package com.sky.task;


import com.sky.entity.Orders;
import com.sky.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Component
public class OrderTask {
    @Autowired
    private OrderMapper orderMapper;

    @Scheduled(cron = "0 * * * * *")
    public void processTimeoutOrder(){
        log.info("处理支付超时订单中......");
        //查询出支付超时的订单
        LocalDateTime timeoutTime = LocalDateTime.now().plusMinutes(-15);
        List<Orders> ordersList = orderMapper.getByTime(Orders.PENDING_PAYMENT,timeoutTime);

        //更新订单的状态为“已取消”
        if(ordersList != null && !ordersList.isEmpty()){
            for(Orders orders : ordersList){
                orders.setCancelTime(LocalDateTime.now());
                orders.setStatus(Orders.CANCELLED);
                orders.setCancelReason("支付超时");
                orderMapper.update(orders);
            }
        }
    }

    @Scheduled(cron = "0 0 1 * * *")
    public void processDeliveryOrder(){
        log.info("处理仍然在派送中的订单");
        //查询出仍然在派送中的订单
        LocalDateTime time = LocalDateTime.now().plusMinutes(-60);
        List<Orders> ordersList = orderMapper.getByTime(Orders.DELIVERY_IN_PROGRESS,time);

        //更新订单中的状态为已完成
        if(ordersList != null && !ordersList.isEmpty()){
            for(Orders orders : ordersList){
                orders.setCancelTime(LocalDateTime.now());
                orders.setStatus(Orders.COMPLETED);
                orderMapper.update(orders);
            }
        }

    }
}

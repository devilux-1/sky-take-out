🍔 苍穹外卖 (CangQiong Waimai)

一个基于 Spring Boot + Vue3 + TypeScript + 微信小程序 的现代化外卖点餐系统，支持商家管理、用户点餐、订单统计、员工管理等完整业务流程。

🌟 项目简介

苍穹外卖是一套全栈外卖解决方案，包含：

• ✅ 微信小程序端（用户点餐、下单、查订单）

• ✅ 商家管理端（后台管理系统，支持菜品、订单、员工、店铺管理）

• ✅ 后端服务（Spring Boot + MyBatis + MySQL + Redis）

• ✅ 公共模块（sky-common、sky-pojo，统一工具类、实体类、接口定义）

适合学习、二次开发、毕业设计、创业原型搭建。

🛠️ 技术栈

模块 技术选型

微信小程序端 原生小程序 + Taro / 原生框架

管理端前端 Vue3 + TypeScript + Vite + Element Plus

后端服务 Spring Boot  + MyBatis + MySQL + Redis

公共模块 sky-common（工具类）、sky-pojo（实体类）

构建工具 Maven（后端）、npm（前端）

部署方式 Docker（可选）、传统部署

🚀 快速开始

1. 环境准备

• JDK 17+

• Node.js 18+

• MySQL 8.0+

• Redis 7.0+

• Maven 3.8+

2. 克隆项目

git clone https://github.com/your-username/cangqiong-waimai.git
cd cangqiong-waimai


3. 初始化数据库

• 执行 sky-server/src/main/resources/sql/init.sql（或按项目说明导入）

• 确保 MySQL 数据库名为 cangqiong_waimai

4. 启动后端服务

cd sky-server
mvn spring-boot:run


后端默认端口：8080

5. 启动管理端前端

cd project-sky-admin-vue-ts
npm install
npm run dev


管理端默认访问地址：http://localhost:5173

6. 启动微信小程序端

• 打开 mp-weixin 文件夹

• 使用微信开发者工具导入项目

• 配置 project.config.json 中的 appid

• 编译运行

📁 项目结构说明


cangqiong-waimai/
├── mp-weixin/                 # 微信小程序端（用户点餐）
├── project-sky-admin-vue-ts/  # 管理端前端（商家后台）
├── sky-common/                # 公共模块（工具类、常量、通用逻辑）
├── sky-pojo/                  # 实体类模块（Employee, Dish, Order 等）
├── sky-server/                # 后端服务（Spring Boot）
├── .gitignore
└── pom.xml                    # Maven 父工程配置


✨ 功能特性

• 👤 用户端：登录、浏览菜品、加入购物车、下单、查看订单

• 🧑💼 商家端：员工管理、菜品管理、订单管理、数据统计、店铺设置

• 📊 工作台模块：今日订单、待处理订单、收入统计

• 🔐 权限控制：RBAC 权限模型，不同角色（管理员、普通员工）权限隔离

• 🚀 高性能：Redis 缓存热点数据，提升响应速度

• 📱 响应式管理端：适配 PC 和移动端

📦 模块说明

模块名 作用说明

mp-weixin 微信小程序端开发

project-sky-admin-vue-ts 管理端开发（Vue3 + TS）

sky-common 新增员工接口等公共工具类

sky-pojo 新增员工接口等实体类定义

sky-server 工作台模块功能开发、后端核心逻辑

🤝 贡献指南

欢迎提交 Issue 或 Pull Request！

1. Fork 本仓库
2. 创建你的分支 (git checkout -b feature/AmazingFeature)
3. 提交你的修改 (git commit -m 'Add some AmazingFeature')
4. 推送到分支 (git push origin feature/AmazingFeature)
5. 开启 Pull Request

📄 许可证

本项目采用 LICENSE 授权，欢迎自由使用和修改。

📬 联系方式

• 作者：devilux

• 邮箱：3259300377@qq.com

• 项目主页：https://github.com/your-username/cangqiong-waimai

🌈 致谢

• 感谢开源社区提供的优秀框架和组件

• 感谢所有贡献者和用户支持

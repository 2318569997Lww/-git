# 医疗关怀系统 Medical Care System

Java Web 课程实验项目 —— 基于 Spring Boot 的医疗关怀系统。本阶段（实验一）完成开发环境搭建与工程整体初始化。

## 技术栈

| 分类 | 说明 |
| --- | --- |
| 开发语言 | Java 17 |
| 构建工具 | Apache Maven 3.9.10 |
| 开发框架 | Spring Boot 3.2.0（内嵌 Tomcat） |
| 数据库 | MySQL 8.0.41，字符集 utf8mb4 |
| 版本控制 | Git（main 主干 + dev 开发分支） |
| 开发工具 | IntelliJ IDEA |

## 目录结构

```
Medical_care_system
├── db
│   └── init.sql                      数据库初始化脚本
├── src/main/java/org/example
│   ├── Main.java                     启动类
│   ├── common/Result.java            统一响应结果封装
│   ├── controller
│   │   ├── HelloController.java      /api/hello 测试接口
│   │   ├── PatientController.java    患者查询接口
│   │   └── PageController.java       页面跳转
│   ├── entity/Patient.java           患者实体
│   └── service
│       ├── PatientService.java       业务接口
│       └── impl/PatientServiceImpl.java
├── src/main/resources
│   ├── application.properties        应用配置
│   └── static
│       ├── index.html                医疗系统初始化引导页
│       ├── patients.html             患者信息可视化页面
│       ├── hello.html                系统运行自检页
│       └── api-doc.html              接口文档与在线调试页
└── pom.xml
```

## 快速开始

### 1. 初始化数据库

```bash
mysql -u root -p --default-character-set=utf8mb4 < db/init.sql
```

脚本会创建 `medical_care_system` 数据库、`patient` 表，并写入两条测试数据。

### 2. 启动项目

```bash
mvn spring-boot:run
```

启动成功后控制台输出 `Started Main in ...`，服务监听 `http://localhost:8080`。

### 3. 访问页面

| 页面 | 地址 |
| --- | --- |
| 初始化引导页 | http://localhost:8080/ |
| 患者信息页 | http://localhost:8080/patients.html |
| 运行自检页 | http://localhost:8080/hello.html |
| 接口文档页 | http://localhost:8080/api-doc.html |

## 接口说明

| 方法 | 路径 | 说明 |
| --- | --- | --- |
| GET | /api/hello | 环境连通性测试，返回初始化成功提示 |
| GET | /api/patient/list | 查询全部患者列表 |
| GET | /api/patient/{id} | 按 ID 查询单个患者，不存在时返回友好提示 |

所有接口统一返回 `Result` 结构：

```json
{
  "code": 200,
  "message": "操作成功",
  "data": "..."
}
```

## 分支规范

- `main`：主干分支，始终保持可运行状态
- `dev`：开发分支，承载新功能开发
- 功能开发完成后通过 `git merge --no-ff` 合并回主干，保证提交历史清晰可追溯
- 提交注释采用 `feat:` / `fix:` / `style:` / `chore:` / `merge:` 前缀

-- ============================================
-- 医疗系统数据库初始化脚本（实验一）
-- 执行方式：mysql -u root -p --default-character-set=utf8mb4 < db/init.sql
-- ============================================

-- 创建数据库，采用 utf8mb4 字符集，支持中文与完整 Unicode
CREATE DATABASE IF NOT EXISTS medical_care_system
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_general_ci;

USE medical_care_system;

-- 患者信息表（对应后端 Patient 实体）
CREATE TABLE IF NOT EXISTS patient (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '患者ID',
    name VARCHAR(50) NOT NULL COMMENT '患者姓名',
    id_card VARCHAR(18) NOT NULL UNIQUE COMMENT '身份证号',
    phone VARCHAR(11) NOT NULL COMMENT '联系电话'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT = '患者信息表';

-- 初始化测试数据
INSERT INTO patient (name, id_card, phone)
VALUES ('张三', '110101199001011234', '13800138000'),
       ('李四', '110101199505055678', '13900139000');

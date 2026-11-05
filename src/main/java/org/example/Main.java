package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // 这一行才是真正启动 Spring Boot 和内置 Tomcat 服务器的代码
        SpringApplication.run(Main.class, args);
    }
}
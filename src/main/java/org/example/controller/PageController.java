package org.example.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController // 使用 RestController 直接返回内容，避免视图解析器的干扰
public class PageController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        try {
            // 显式指定去 classpath 下的 static 文件夹读取 index.html
            ClassPathResource resource = new ClassPathResource("static/index.html");
            // 以 UTF-8 编码读取文件内容并返回
            return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "<h1>找不到 static/index.html 文件，请检查文件路径！</h1>";
        }
    }
}
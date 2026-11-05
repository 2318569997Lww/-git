package org.example.controller;

import org.example.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Result<String> hello() {
        return Result.success("医疗系统初始化成功！环境搭建完毕！");
    }
}
package com.uwjx.nacos.service01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "s1")
@Slf4j
public class S1Controller {

    @GetMapping(value = "f1")
    public String f1(){
        log.warn("在 s1 服务中 接收到 f1 请求");
        return "s1 f1 return";
    }

    @GetMapping(value = "f2")
    public String f2(){
        log.warn("在 s1 服务中 接收到 f2 请求");
        return "s1 f2 return";
    }
}

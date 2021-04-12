package com.uwjx.nacos.service02.controller;

import com.uwjx.nacos.service02.feign.S1FeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "s2")
@Slf4j
public class S2Controller {

    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    S1FeignClient s1FeignClient;

    @GetMapping(value = "f1")
    public String f1(){
        log.warn("在 s2 服务中 接收到 f1 请求");
        return "s2 f1 return";
    }

    @GetMapping(value = "f2")
    public String f2(){
        log.warn("在 s2 服务中 接收到 f2 请求");
        return "s2 f2 return";
    }


    @GetMapping(value = "r_s1_f1")
    public String r_s1_f1(){
        log.warn("在 s2 服务中 接收到 r_s1_f1 请求");
        return s1FeignClient.f1();
    }

    @GetMapping(value = "getInstanceInfo")
    public List<ServiceInstance>  getInstanceInfo(){
        log.warn("在 s2 服务中 接收到 getInstanceInfo 请求");
        List<ServiceInstance> instances  = discoveryClient.getInstances("nacos-service-01");
        return instances;
    }
}

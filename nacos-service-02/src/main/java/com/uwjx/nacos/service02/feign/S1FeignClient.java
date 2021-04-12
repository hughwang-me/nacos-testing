package com.uwjx.nacos.service02.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-service-01")
public interface S1FeignClient {

    @GetMapping(value = "s1/f1")
    String f1();
}

package com.uwjx.nacos.service02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NacosService02Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosService02Application.class, args);
    }

}

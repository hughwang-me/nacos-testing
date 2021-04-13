package com.uwjx.gateway.service.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    RouteLocator configRoute(RouteLocatorBuilder routeLocatorBuilder) {
        final RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        builder.route("s1-router", f -> f.path("/s1/**").uri("lb://nacos-service-01"));
        builder.route("s2-router", f -> f.path("/s2/**").uri("lb://nacos-service-02"));
        return builder.build();
    }
}

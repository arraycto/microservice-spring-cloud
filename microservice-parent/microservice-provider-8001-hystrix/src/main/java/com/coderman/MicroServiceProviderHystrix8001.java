package com.coderman;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.coderman.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class MicroServiceProviderHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceProviderHystrix8001.class, args);
    }
}

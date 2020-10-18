package com.coderman;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.coderman.mapper")
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceProvider8002 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceProvider8002.class, args);
    }
}

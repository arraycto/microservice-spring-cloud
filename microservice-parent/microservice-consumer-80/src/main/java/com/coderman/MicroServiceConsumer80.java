package com.coderman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 19:48
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceConsumer80.class, args);
    }
}

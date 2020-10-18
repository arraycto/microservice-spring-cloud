package com.coderman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 19:48
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroServiceConsumer80Feign {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceConsumer80Feign.class, args);
    }
}

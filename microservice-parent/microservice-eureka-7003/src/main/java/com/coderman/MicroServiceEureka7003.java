package com.coderman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 19:48
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class MicroServiceEureka7003 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceEureka7003.class, args);
    }
}

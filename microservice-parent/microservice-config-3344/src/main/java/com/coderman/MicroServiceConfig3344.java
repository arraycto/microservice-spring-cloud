package com.coderman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author zhangyukang
 * @Date 2020/10/18 15:30
 * @Version 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class MicroServiceConfig3344 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceConfig3344.class,args);
    }
}

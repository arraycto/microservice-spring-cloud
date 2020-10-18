package com.coderman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author zhangyukang
 * @Date 2020/10/16 17:40
 * @Version 1.0
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class MicroServiceHystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceHystrixDashboard9001.class,args);
    }
}

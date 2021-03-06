package com.coderman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author zhangyukang
 * @Date 2020/10/16 18:10
 * @Version 1.0
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class MicroServiceZuulGateWay9527 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceZuulGateWay9527.class,args);
    }
}

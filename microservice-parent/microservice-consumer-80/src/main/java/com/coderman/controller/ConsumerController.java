package com.coderman.controller;

import com.coderman.model.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 19:53
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/consumer/department")
public class ConsumerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    //private static final String restUrl="http://localhost:8001";
    /** 服务地址 */
    private static final String restUrl="http://microservice-provider";

    @GetMapping(value = "/listAll")
    public Object attachListAll(){
        logger.info("微服务:{},调用消费者服务:{}",getClass().getSimpleName(),restUrl+"/department/listAll");
        return restTemplate.getForObject(restUrl+"/department/listAll", List.class);
    }

    @GetMapping(value = "/get/{id}")
    public Object attachGetById(@PathVariable(value = "id") Long id){
        logger.info("微服务:{},调用消费者服务:{}",getClass().getSimpleName(),restUrl+"/department/get/"+id);
        return restTemplate.getForObject(restUrl+"/department/get/"+id, Department.class);
    }

    @GetMapping(value = "/add")
    public Object attachAdd(Department department){
        logger.info("微服务:{},调用消费者服务:{}",getClass().getSimpleName(),restUrl+"/department/add?name="+department.getName());
        return restTemplate.getForObject(restUrl+"/department/add?name="+department.getName(), Boolean.class);
    }

    @GetMapping("/delete/{id}")
    public Object attachDelete(@PathVariable(value = "id") Long id){
        logger.info("微服务:{},调用消费者服务:{}",getClass().getSimpleName(),restUrl+"/department/delete/"+id);
        return restTemplate.getForObject(restUrl+"/department/delete/"+id, Boolean.class);
    }

}

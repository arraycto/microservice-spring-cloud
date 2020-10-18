package com.coderman.controller;

import com.coderman.model.Department;
import com.coderman.service.DepartmentFeignClient;
import com.netflix.discovery.converters.Auto;
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

    @Autowired
    private DepartmentFeignClient departmentFeignClient;

    @GetMapping(value = "/listAll")
    public Object attachListAll(){
        return departmentFeignClient.listAll();
    }

    @GetMapping(value = "/get/{id}")
    public Object attachGetById(@PathVariable(value = "id") Long id){
        return departmentFeignClient.get(id);
    }

    @GetMapping(value = "/add")
    public Object attachAdd(Department department){
        return departmentFeignClient.add(department);
    }

    @GetMapping("/delete/{id}")
    public Object attachDelete(@PathVariable(value = "id") Long id){
        return departmentFeignClient.delete(id);
    }

}

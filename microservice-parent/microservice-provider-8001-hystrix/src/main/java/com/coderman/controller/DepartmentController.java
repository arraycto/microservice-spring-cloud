package com.coderman.controller;

import com.coderman.model.Department;
import com.coderman.service.DepartmentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 19:21
 * @Version 1.0
 **/
@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @GetMapping("/listAll")
    public List<Department> listAll(){
        return departmentService.listAll();
    }

    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod ="processHystrix_GET")
    public Department get(@PathVariable(value = "id") Long id){
        return departmentService.get(id);
    }

    //服务熔断，出现异常会去调用 processHystrix_GET（）
    public Department processHystrix_GET(Long id) {
        logger.info("服务熔断调用该方法： department:{},not found",id);
        Department department = new Department();
        department.setDbSource("no database");
        department.setName("服务熔断");
        return department;
    }

    @GetMapping("/add")
    public Boolean add(Department department){
        return departmentService.add(department);
    }

    @GetMapping("/delete/{id}")
    public Boolean delete(@PathVariable(value = "id") Long id){
        return departmentService.delete(id);
    }
}

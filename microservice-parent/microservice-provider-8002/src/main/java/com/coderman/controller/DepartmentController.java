package com.coderman.controller;

import com.coderman.model.Department;
import com.coderman.service.DepartmentService;
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

    @GetMapping("/listAll")
    public List<Department> listAll(){
        return departmentService.listAll();
    }

    @GetMapping("/get/{id}")
    public Department get(@PathVariable(value = "id") Long id){
        return departmentService.get(id);
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

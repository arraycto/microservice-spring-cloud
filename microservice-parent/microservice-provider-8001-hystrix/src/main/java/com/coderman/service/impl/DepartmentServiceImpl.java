package com.coderman.service.impl;

import com.coderman.mapper.DepartmentMapper;
import com.coderman.model.Department;
import com.coderman.service.DepartmentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 19:21
 * @Version 1.0
 **/
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public List<Department> listAll() {
        return departmentMapper.listAll();
    }

    @Override
    public Department get(Long id) {
        Department department = departmentMapper.get(id);
        if(department==null){
            throw new RuntimeException("not found department id:{"+id+"}");
        }else {
            return department;
        }
    }


    @Override
    public Boolean add(Department department) {
        return departmentMapper.add(department)==1;
    }

    @Override
    public Boolean delete(Long id) {
        return departmentMapper.delete(id);
    }

}

package com.coderman.service.impl;

import com.coderman.mapper.DepartmentMapper;
import com.coderman.model.Department;
import com.coderman.service.DepartmentService;
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


    @Override
    public List<Department> listAll() {
        return departmentMapper.listAll();
    }

    @Override
    public Department get(Long id) {
        return departmentMapper.get(id);
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

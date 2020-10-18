package com.coderman.service;

import com.coderman.model.Department;

import java.util.List;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 19:20
 * @Version 1.0
 **/
public interface DepartmentService {
    public List<Department> listAll();
    public Department get(Long id);
    public Boolean add(Department department);
    public Boolean delete(Long id);
}

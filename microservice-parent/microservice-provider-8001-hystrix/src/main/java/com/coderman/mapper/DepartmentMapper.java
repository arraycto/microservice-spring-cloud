package com.coderman.mapper;

import com.coderman.model.Department;

import java.util.List;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 18:21
 * @Version 1.0
 **/
public interface DepartmentMapper {
    List<Department> listAll();
    Department get(Long id);
    int add(Department department);
    Boolean delete(Long id);
}

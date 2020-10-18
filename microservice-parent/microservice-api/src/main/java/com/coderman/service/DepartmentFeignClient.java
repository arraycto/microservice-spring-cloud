package com.coderman.service;

import com.coderman.model.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author zhangyukang
 * @Date 2020/10/12 10:09
 * @Version 1.0
 **/
@FeignClient(value = "microservice-provider",fallbackFactory = DepartmentFallBackFactory.class)
public interface DepartmentFeignClient {

    /**
     * 显示所有部门的列表
     * @return
     */
    @RequestMapping(value ="/department/listAll",method = RequestMethod.GET)
    List<Department> listAll();

    /**
     * 查询指定id
     * @param id
     * @return
     */
    @RequestMapping(value = "/department/get/{id}",method = RequestMethod.GET)
    Department get(@PathVariable(value = "id") Long id);

    @RequestMapping(value = "/department/add",method = RequestMethod.GET)
    Boolean add(Department department);

    @RequestMapping(value = "/department/delete/{id}",method = RequestMethod.GET)
    Boolean delete(@PathVariable(value = "id") Long id);

}

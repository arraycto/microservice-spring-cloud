package com.coderman.service;

import com.coderman.model.Department;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 当调用的服务不可用的时候回调用该方法
 * @Author zhangyukang
 * @Date 2020/10/16 17:14
 * @Version 1.0
 **/
@Component
public class DepartmentFallBackFactory implements FallbackFactory<DepartmentFeignClient> {
    @Override
    public DepartmentFeignClient create(Throwable throwable) {
        return new DepartmentFeignClient() {
            @Override
            public List<Department> listAll() {
                return null;
            }

            @Override
            public Department get(Long id) {
                Department department = new Department();
                department.setName("服务降级");
                department.setDbSource("no database");
                return department;
            }

            @Override
            public Boolean add(Department department) {
                return null;
            }

            @Override
            public Boolean delete(Long id) {
                return null;
            }
        };
    }
}

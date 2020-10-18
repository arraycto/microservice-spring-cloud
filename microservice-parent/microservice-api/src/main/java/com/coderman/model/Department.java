package com.coderman.model;

import java.io.Serializable;

/**
 * @Author zhangyukang
 * @Date 2020/10/7 17:18
 * @Version 1.0
 **/
public class Department implements Serializable {
    private Long id;
    private String name;
    private String dbSource; //存放到哪个数据库

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}

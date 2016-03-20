package com.db2.dubbo.model;

import java.io.Serializable;

/**
 * Created by dengbin on 2016/3/20.
 */
public class People implements Serializable {


    private Integer id;


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

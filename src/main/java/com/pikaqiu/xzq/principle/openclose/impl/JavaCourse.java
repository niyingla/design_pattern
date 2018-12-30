package com.pikaqiu.xzq.principle.openclose.impl;

import com.pikaqiu.xzq.principle.openclose.ICourse;

/**
 * @program: pikaqiu
 * @description:
 * @author: xiaoye
 * @create: 2018-12-30 20:22
 **/
public class JavaCourse implements ICourse {
    private Integer id;

    private String name;

    private double price;

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

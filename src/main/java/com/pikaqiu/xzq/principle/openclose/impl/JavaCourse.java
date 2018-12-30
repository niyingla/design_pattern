package com.pikaqiu.xzq.principle.openclose.impl;

import com.pikaqiu.xzq.principle.openclose.ICourse;
import lombok.Data;

/**
 * @program: pikaqiu
 * @description:
 * @author: xiaoye
 * @create: 2018-12-30 20:22
 **/
@Data
public class JavaCourse implements ICourse {
    private Integer id;

    private String name;

    private double price;

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

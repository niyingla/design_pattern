package com.pikaqiu.xzq.principle.openclose.impl;

/**
 * @program: pikaqiu
 * @description:
 * @author: xiaoye
 * @create: 2018-12-31 00:22
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }

    /**
     * 获取原价
     * @return
     */
    public double getOrigPrice(){
        return super.getPrice();
    }

    /**
     * 获取折后价
     * @return
     */
    @Override
    public double getPrice(){
        return super.getPrice() * 0.8;
    }
}

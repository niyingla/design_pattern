package com.pikaqiu.xzq.principle.openclose;

import com.pikaqiu.xzq.principle.openclose.impl.JavaCourse;
import com.pikaqiu.xzq.principle.openclose.impl.JavaDiscountCourse;

/**
 * @program: pikaqiu
 * @description:
 * @author: xiaoye
 * @create: 2018-12-30 20:29
 **/
public class Test {

    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(11, "java课程", 42d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)course;
        System.out.println("课程Id：" + javaCourse.getId() + "       课程名：" + javaCourse.getName() + "      课程价格：" + javaCourse.getOrigPrice()+ "      课程折后价格：" + javaCourse.getPrice());
    }


}

package com.pikaqiu.xzq.principle.openclose;

import com.pikaqiu.xzq.principle.openclose.impl.JavaCourse;

/**
 * @program: pikaqiu
 * @description:
 * @author: xiaoye
 * @create: 2018-12-30 20:29
 **/
public class Test {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse(11, "java课程", 42d);
        System.out.println(javaCourse.getName());
        System.out.println("课程Id：" + javaCourse.getId() + "       课程名：" + javaCourse.getName() + "      课程价格：" + javaCourse.getPrice());
    }


}

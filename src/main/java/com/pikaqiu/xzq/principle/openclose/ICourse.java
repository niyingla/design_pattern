package com.pikaqiu.xzq.principle.openclose;

/**
 * 课程
 */
public interface ICourse {
    /**
     * 主键
     * @return
     */
    Integer getId();

    /**
     * 名字
     * @return
     */
    String getName();

    /**
     *  价格
     * @return
     */
    double getPrice();


}


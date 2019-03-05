package com.mxy.design.factory.abstract_;
/**
 * 具体产品
 */
public class Mobike implements Bike {

    @Override
    public String name() {
        return "膜拜单车";
    }

    @Override
    public String color() {
        return "红色";
    }

}

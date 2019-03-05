package com.mxy.design.factory.abstract_;
/**
 * 具体产品
 */
public class OFO implements Bike {

    @Override
    public String name() {
        return "小黄车";
    }

    @Override
    public String color() {
        return "黄色";
    }

}

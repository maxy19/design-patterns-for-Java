package com.mxy.design.factory.abstract_;
/**
 * 具体产品
 */
public class BYD implements Cart {
    @Override
    public String name() {
        return "比亚迪";
    }
    @Override
    public String speed() {
        return "20km";
    }
}

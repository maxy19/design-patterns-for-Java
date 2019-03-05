package com.mxy.design.factory.abstract_;

/**
 * 具体产品
 */
public class BMW implements Cart {
    @Override
    public String name() {
         return "宝马";
    }

    @Override
    public String speed() {
        return "50km";
    }
}

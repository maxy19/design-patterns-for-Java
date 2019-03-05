package com.mxy.design.factory.abstract_;

/**
 * 抽象工厂
 */
public abstract class Factory {


    protected <T> T  getCart(Class<T> clazz) {
        return null;
    }

    protected <T> T getBike(Class<T> clazz) {
        return null;
    }

}

package com.mxy.design.singleton.hungry;

/**
 * 饿汉模式
 */
public class Singleton {

    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {

    }

}

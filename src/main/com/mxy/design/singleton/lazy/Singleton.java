package com.mxy.design.singleton.lazy;

/**
 * 懒汉模式
 */
public class Singleton {

    private static Singleton ourInstance = null;

    public static Singleton getInstance() {
        if (ourInstance == null) {
            ourInstance = new Singleton();
            return ourInstance;
        }
        return ourInstance;
    }

    private Singleton() {

    }

}

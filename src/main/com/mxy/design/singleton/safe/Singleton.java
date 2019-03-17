package com.mxy.design.singleton.safe;

/**
 * 使用 synchronized 线程安全模式
 */
public class Singleton {

    private static  Singleton ourInstance = null;

    public static synchronized Singleton getInstance() {
        if (ourInstance == null) {
            ourInstance = new Singleton();
            return ourInstance;
        }
        return ourInstance;
    }

    private Singleton() {

    }

}

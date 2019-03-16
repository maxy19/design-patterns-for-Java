package com.mxy.design.singleton.inner;

/**
 * 静态内部类模式 (类初始化机制的线程安全)
 */
public class Singleton {

    public static Singleton getInstance() {
        return innerClass.OURINSTANCE;
    }

    private Singleton() {

    }

    private static class innerClass {
        private static final Singleton OURINSTANCE = new Singleton();
    }

}

package com.mxy.design.singleton.dcl;

/**
 * DCL模式
 */
public class Singleton {
    //重点:volatile 增加线程间的可见性 线程安全
    private static volatile Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}

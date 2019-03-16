package com.mxy.design.singleton.enum_;

/**
 * 枚举模式 （线程安全）
 */
public enum Singleton {

    INSTANCE;

    private Resource instance;

    Singleton() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }
}

class Resource {
}


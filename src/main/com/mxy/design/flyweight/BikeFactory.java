package com.mxy.design.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 工厂构造对象，享元模式核心
 */
public class BikeFactory {

    private static ConcurrentHashMap<String, BikeService> cache = new ConcurrentHashMap();

    public static BikeService get(String name) {
        if (cache.get(name) == null) {
            if (cache.get(name) == null) {
                BikeService flyWeight = new BikeServiceImpl(name);
                cache.put(name, flyWeight);
                return cache.get(name);
            }
        }
        System.out.println(name+" 已经存在不需要再生产");
        return cache.get(name);
    }

}

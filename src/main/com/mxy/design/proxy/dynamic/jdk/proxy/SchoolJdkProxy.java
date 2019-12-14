package com.mxy.design.proxy.dynamic.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理 实现JDK 接口
 * 重点：JDK动态代理只能对实现了接口的类生成代理，而不能针对类。 如果使用单纯的类，而这个类没有实现接口，会报错
 * 在spring里面
 * 1.当Bean实现接口时，Spring就会用JDK的动态代理。
 * 2.当Bean没有实现接口时，Spring使用CGlib是实现。
 */
public class SchoolJdkProxy implements InvocationHandler {

    private Object target;

    public SchoolJdkProxy(Object object) {
        this.target = object;
    }

    public <T> T getInstance() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}

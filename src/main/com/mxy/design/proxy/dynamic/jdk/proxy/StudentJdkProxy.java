package com.mxy.design.proxy.dynamic.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理 实现JDK 接口
 */
public class StudentJdkProxy implements InvocationHandler {

    private Object target;

    public StudentJdkProxy(Object object) {
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

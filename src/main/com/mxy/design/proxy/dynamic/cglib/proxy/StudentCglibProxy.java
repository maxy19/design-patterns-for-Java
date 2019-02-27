package com.mxy.design.proxy.dynamic.cglib.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 动态代理 实现JDK 接口
 */
public class StudentCglibProxy implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(o, objects);
    }

    public  <T> T getInstance(Class<T> objClass) {
        return (T)Enhancer.create(objClass.getClass(), this);
    }
}

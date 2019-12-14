package com.mxy.design.proxy.dynamic.cglib.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 动态代理 实现GGLIB 接口
 * 注意：
 * CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法，
 * 并覆盖其中方法实现增强，但是因为采用的是继承，所以该类或方法最好不要声明成final，
 * 对于final类或方法，是无法继承的。
 */
public class StudentCglibProxy implements MethodInterceptor {
    /**
     * CGLib需要代理的目标对象
     */
    private Object target;

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //可能造成死循环坑：而如果调用invokeSuper方法，则一定要使用被代理后的obj对象
        //return methodProxy.invokeSuper(obj, args);
        //可能造成死循环坑：如果是用invoke方法一定要使用被代理的对象也就是上文中的target
        return methodProxy.invoke(target, args);
    }

    public <T> T getInstance(Object target) {
        this.target = target;
        return (T) Enhancer.create(target.getClass(), this);
    }
}

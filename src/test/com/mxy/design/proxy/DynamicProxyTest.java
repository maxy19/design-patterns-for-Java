package com.mxy.design.proxy;

import com.mxy.design.proxy.dynamic.cglib.proxy.StudentCglibProxy;
import com.mxy.design.proxy.dynamic.cglib.proxy.StudentService;
import com.mxy.design.proxy.dynamic.cglib.proxy.StudentServiceExtendChildren;
import com.mxy.design.proxy.dynamic.jdk.proxy.SchoolJdkProxy;
import org.junit.Test;

import java.util.Random;

/**
 * 装饰模式:增加功能,不改变接口
 * 对比
 * 适配器模式:改变接口名,不改变功能
 * 对比
 * 代理模式:代理类对被代理的对象有控制权，决定其执行或者不执行。
 * 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能。
 * 动态代理：原理通过反射来获得代理的实现 常用的有JDK 自带jdkProxy 与 cglib 之前hibernate使用 javassist
 * 好处：当使用动态代理 一个动态代理模板就能代理多个目标类 只需要传入接口 通过反射得到实现目标类方法
 */
public class DynamicProxyTest {

    @Test
    public void cglibProxyTest() {
        System.out.println("=====使用CGLIB代理模式");
        //去掉下面注释可以 会在指定位置生成文件
        //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, ".\\\\classes");
        StudentService cglibProxy = new StudentCglibProxy().getInstance(new StudentServiceExtendChildren());
        save(cglibProxy);
        delete(cglibProxy);
    }

    @Test
    public void jdkProxyTest() {
        System.out.println("=====使用JDK动态代理模式");
        ISchool jdkProxy = new SchoolJdkProxy(new SchoolImpl()).getInstance();
        //与静态代理输出结果保持一致
        save(jdkProxy);
        //查询是否存在
        delete(jdkProxy);
    }

    private void delete(ISchool jdkProxy) {
        if (new Random().nextBoolean()) {
            System.out.println("===开启事务");
            jdkProxy.delete();
            System.out.println("===提交事务");
        } else {
            System.out.println("===该用户已经被删除");
        }
    }

    private void save(ISchool jdkProxy) {
        System.out.println("==开启事务");
        jdkProxy.save();
        System.out.println("==提交事务");
    }

    public void save(StudentService cglibProxy) {
        System.out.println("==开启事务");
        cglibProxy.save();
        System.out.println("==提交事务");
    }

    public void delete(StudentService cglibProxy) {
        if (new Random().nextBoolean()) {
            System.out.println("===开启事务");
            cglibProxy.delete();
            System.out.println("===提交事务");
        } else {
            System.out.println("===该用户已经被删除");
        }
    }

}

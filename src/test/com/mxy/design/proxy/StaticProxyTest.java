package com.mxy.design.proxy;

import org.junit.Test;

/**
 * 装饰模式:增加功能,不改变接口
 * 对比
 * 适配器模式:改变接口名,不改变功能
 * 对比
 * 代理模式:代理类对被代理的对象有控制权，决定其执行或者不执行。
 * 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能。
 *
 * 缺点：
 *
 * 1）代理类和委托类实现了相同的接口，代理类通过委托类实现了相同的方法。这样就出现了大量的代码重复。如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。
 *
 * 2）代理对象只服务于一种类型的对象，如果要服务多类型的对象。势必要为每一种对象都进行代理，静态代理在程序规模稍大时就无法胜任了。如上的代码是只为UserManager类的访问提供了代理，但是如果还要为其他类如Department类提供代理的话，就需要我们再次添加代理Department的代理类。
 */
public class StaticProxyTest {


    @Test
    public void logicTest() {
        System.out.println("====使用代理模式前");
        ISchool iSchool = new SchoolImpl();
        iSchool.save();
        iSchool.delete();
        System.out.println();
        System.out.println("=====使用静态代理模式后");
        ISchool studentProxy =  new SchoolProxy(iSchool);
        studentProxy.save();
        studentProxy.delete();
    }

}

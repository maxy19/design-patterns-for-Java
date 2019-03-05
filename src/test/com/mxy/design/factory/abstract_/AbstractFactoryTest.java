package com.mxy.design.factory.abstract_;

import org.junit.Test;

/**
 * 抽象工厂模式:抽象工厂定义建造那些工厂 ，抽象产品定义具体产品，工厂与产品耦合 实现抽象工厂模式
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 */

public class AbstractFactoryTest {

    @Test
    public void logicTest() {
        //创建工厂
        Factory factory = new BikeFactory();
        //创建产品
        Bike bike = factory.getBike(OFO.class);
        System.out.println(bike.name() + " " + bike.color());

        //创建工厂
         factory = new CartFactory();
        //创建产品
        BYD cart = factory.getCart(BYD.class);
        System.out.println(cart.name() + " " + cart.speed());

    }
}

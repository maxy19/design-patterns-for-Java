package com.mxy.design.decorator;

import org.junit.Test;

/**
 * 装饰模式:增加功能,不改变接口
 * 对比
 * 适配器模式:改变接口名,不改变功能
 * 对比
 * 代理模式:代理类对被代理的对象有控制权，决定其执行或者不执行。
 * 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能。
 */
public class DecoratorTest {

    @Test
    public void logicTest() {
        System.out.println("装饰前======");
        Cake cake = new CakeImpl();
        System.out.println(cake.description()+"花费:"+cake.cost());
        System.out.println("装饰后======");
        Cake addFruits = new Fruits(cake);
        System.out.println("只增加"+addFruits.description()+"共花费:"+addFruits.cost());
        Cake addCandle = new Candle(cake);
        System.out.println("只增加"+addCandle.description()+"共花费:"+addCandle.cost());
        //为期增加功能 向下转型
        ((Candle) addCandle).risePrice(10);
        System.out.println("涨价后"+addCandle.description()+"总共花费:"+addCandle.cost());
    }

}

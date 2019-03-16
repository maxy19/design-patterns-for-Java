package com.mxy.design.visitor;

import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * 观察者模式:访问者模式被用在针对一组相同类型对象的操作。优点是，可以把针对此对象的操作逻辑转移到另外一个类上。
 * 目的：主要作用数据模型与操作分开
 * 例子：添加到购物车中商品计算总价
 * 特点：访问者可以对功能进行统一，如：拦截器与过滤器等。
 */
public class VisitorTest {

    @Test
    public void logicTest() {
        //visitor
        ShoppingCartService visitor = new ShoppingCartImpl();
        //item
        Book book = new Book(10, 20);
        Food food = new Food(100, 2);
        //calculate total price
        System.out.println("总价："+Lists.newArrayList(book,food).stream().map(c->c.accept(visitor)).reduce(Double::sum).get());

    }

}

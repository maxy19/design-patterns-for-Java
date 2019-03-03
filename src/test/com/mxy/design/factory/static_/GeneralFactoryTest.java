package com.mxy.design.factory.static_;

import org.junit.Test;

/**
 * 静态工厂模式:最重要的是它违背了我们在概述中说的 开放-封闭原则 （虽然可以通过反射的机制来避免） 。因为每次你要新添加一个功能，都需要在生switch-case 语句（或者if-else 语句）中去修改代码，添加分支条
 * <p>
 * 解决方法：
 * 这种方式的虽然符合了 开放-关闭原则 ，但是每一次传入的都是产品类 比较麻烦。
 * 如果需要改善的话可以通过 反射+配置文件 的形式来改善.
 */

public class GeneralFactoryTest {

    @Test
    public void logicTest1() {
        try {
            System.out.println(CartFactory.createCart("BYD").name());
            System.out.println(CartFactory.createCart("BMW").name());
            System.out.println(CartFactory.createCart("Benz").name());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void logicTest2() {
        BMW cart = (BMW) CartFactory.createCart(BMW.class);
        System.out.println(cart.name());
    }


}

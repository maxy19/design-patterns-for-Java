package com.mxy.design.flyweight;

import org.junit.Test;

/**
 * 享元模式:享元模式的思想就是缓存和复用，重点关注的是性能。 内存开销较大或者对象的大部分的属性是外部状态情况下，利用工厂创造。
 * 单例模式对比；相同点：不重复创造对象，不同点：单利只能创造一个，享元可以创造多个对象
 * jdk：Integer.valueOf  Double.valueOf Boolean.valueOf 等包装类都是使用这个模式。
 */
public class FlyWeightTest {

    @Test
    public void logicTest() {

        BikeService yj = BikeFactory.get("永久牌自行车");

        BikeService hq = BikeFactory.get("红旗牌自行车");

        yj.print();

        hq.print();

        BikeFactory.get("永久牌自行车");

    }


}

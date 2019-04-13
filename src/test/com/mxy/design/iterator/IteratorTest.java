package com.mxy.design.iterator;

import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * 迭代器模式：提供一种方法顺序访问一个聚合对象中的各种元素，不暴露该对象的内部的操作
 * 优点：迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器来负责，这样既可以做到不暴露集合的内部结构，又可以让外部代码透明的访问集合内部的数据。
 * 缺点：由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。
 * jdk：collection容器用这种遍历方式
 */
public class IteratorTest {


    @Test
    public void logicTest() {
        Iterable<Integer> iterable = new Collection(Lists.newArrayList(1, 2, 3, 4, 5));
        //remove
        while (iterable.hasNext()) {
            Integer current = iterable.next();
            if (current.equals(1)) {
                iterable.remove();
            }
        }
        //获得remove后的元素
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

    }
}

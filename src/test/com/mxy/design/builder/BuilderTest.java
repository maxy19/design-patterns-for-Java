package com.mxy.design.builder;

import org.junit.Test;

/**
 * 建造者模式:是将一个复杂的对象的构建与它的表示分离，创建者模式隐藏了复杂对象的创建过程 ，构建与表象分离解耦。
 *
 * jdk:java.lang.StringBuilder#append()  java.lang.StringBuffer#append() 都是使用建造者模式
 */

public class BuilderTest {

    @Test
    public void logicTest() {

        StringBuilder content = new StringBuilder();
        String appendValue = content.append("这里有").append(10)
                                    .append("个苹果").append("拿走").append(1)
                                    .append("还剩").append(9).append("个").append("这是")
                                    .append(Boolean.TRUE).append("?")
                                    .toString();
        System.out.println(appendValue);

    }
}

package com.mxy.design.bridge;

import org.junit.Test;

/**
 * 桥接模式:是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 */

public class BridgeTest {

    @Test
    public void logicTest() {

        //桥的一端->来者
        DriverManager driverManager = new ALi();
        //桥的另一端->目的地
        driverManager.jdbc = new Mysql();
        //建立连接
        driverManager.useDB(driverManager.jdbc.DbName());

        //桥的另一端->目的地
        driverManager = new JD();
        driverManager.jdbc = new Oracle();
        //建立连接
        driverManager.useDB(driverManager.jdbc.DbName());

    }


}

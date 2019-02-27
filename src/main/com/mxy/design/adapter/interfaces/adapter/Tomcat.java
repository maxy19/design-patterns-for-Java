package com.mxy.design.adapter.interfaces.adapter;

/**
 * 该类只需要 NET 就够了 所以继承父类并重写
 */
public class Tomcat extends Adapter {


    @Override
    public void NET() {
        System.out.println("Tomcat 开启80端口");
    }
}

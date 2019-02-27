package com.mxy.design.adapter.interfaces.adapter;
/**
 * 该类只需要 NET FTP 就够了 所以继承父类并重写
 */
public class Chat extends Adapter {


    @Override
    public void NET() {
        System.out.println("Chat 开启80端口");
    }

    @Override
    public void FTP() {
        System.out.println("Chat 开启21端口");
    }
}

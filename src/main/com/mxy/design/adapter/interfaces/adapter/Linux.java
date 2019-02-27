package com.mxy.design.adapter.interfaces.adapter;

/**
 * 该系统需要全部方法
 */
public class Linux implements Port {

    @Override
    public void SSH() {
        System.out.println("Linux 开启22端口");
    }

    @Override
    public void NET() {
        System.out.println("Linux 开启80端口");
    }

    @Override
    public void FTP() {
        System.out.println("Linux 开启21端口");
    }
}

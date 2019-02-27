package com.mxy.design.adapter.interfaces.adapter;

/**
 * 各种协议端口
 */
public interface Port {

    // 远程SSH端口22
    public void SSH();

    // 网络端口80
    public void NET();

    // 文件传输FTP端口21
    public void FTP();
}


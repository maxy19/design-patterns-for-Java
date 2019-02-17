package com.mxy.design.observer;

public interface ObServer {
    /**
     * 接受公众号推送的信息
     * @param receiveMsg
     */
    void update(String receiveMsg);
}

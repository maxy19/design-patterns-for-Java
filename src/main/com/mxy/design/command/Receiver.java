package com.mxy.design.command;

/**
 * 接受者 负责接受命令
 */
public class Receiver {

    public void pass() {
        System.out.println("美妙的传球。");
    }

    public void dunk() {
        System.out.println("惊人的扣篮。");
    }

    public void shoot() {
        System.out.println("帅气的投篮。");
    }
}

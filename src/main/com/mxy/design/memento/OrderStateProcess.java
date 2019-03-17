package com.mxy.design.memento;

/**
 * 订单流程处理
 */
public class OrderStateProcess {

    private Memento memento;

    public OrderStateProcess(Memento memento) {
        this.memento = memento;
    }

    public Memento rollbackLastState() {
        return memento;
    }
}

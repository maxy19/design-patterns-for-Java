package com.mxy.design.state;

public class FinishOrder implements OrderState {

    @Override
    public void changeState() {
        System.out.println("完成订单.");
    }
}

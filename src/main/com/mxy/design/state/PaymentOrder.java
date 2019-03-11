package com.mxy.design.state;

public class PaymentOrder implements OrderState {

    @Override
    public void changeState() {
        System.out.println("支付订单.");
    }
}

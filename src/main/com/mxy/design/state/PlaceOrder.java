package com.mxy.design.state;

public class PlaceOrder implements OrderState {

    @Override
    public void changeState() {
        System.out.println("下单状态.");
    }
}

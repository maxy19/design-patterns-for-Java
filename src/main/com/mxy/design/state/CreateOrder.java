package com.mxy.design.state;

public class CreateOrder implements OrderState {

    @Override
    public void changeState() {
        System.out.println("生成订单.");
    }


}

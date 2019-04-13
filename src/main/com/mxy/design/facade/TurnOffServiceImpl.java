package com.mxy.design.facade;

public class TurnOffServiceImpl implements TurnOffService {


    @Override
    public void turnOffDoor() {
        System.out.println("===关门===");
    }

    @Override
    public void turnOffLight() {
        System.out.println("===关灯===");
    }

    @Override
    public void turnOffWindow() {
        System.out.println("===关窗===");
    }
}

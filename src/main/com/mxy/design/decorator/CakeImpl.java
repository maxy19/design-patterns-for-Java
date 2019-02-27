package com.mxy.design.decorator;

public class CakeImpl implements Cake {


    @Override
    public String description() {
        return "蛋糕";
    }

    @Override
    public double cost() {
        return 10;
    }
}

package com.mxy.design.decorator;


public class Candle extends CakeDecorator {

    double candleCost = 30;

    public Candle(Cake cake) {
        super(cake);
    }

    @Override
    public String description() {
        return "蜡烛";
    }

    @Override
    public double cost() {
        return (candleCost) + (cake.cost());
    }

    /**
     * 涨价
     * @param price
     */
    public void risePrice(double price) {
        this.candleCost += price;
    }
}

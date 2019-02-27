package com.mxy.design.decorator;

public class Fruits extends CakeDecorator {

    double fruitsCost = 20;

    /**
     * 构造为了 调用父类方法
     *
     * @param cake
     */
    public Fruits(Cake cake) {
        super(cake);
    }

    @Override
    public String description() {
        return "水果";
    }

    @Override
    public double cost() {
        return (fruitsCost) + (cake.cost());
    }
}

package com.mxy.design.visitor;

public class Food implements Goods {

    private double price;
    private int count;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Food(double price, int count) {
        this.price = price;
        this.count = count;
    }

    @Override
    public double accept(ShoppingCartService visitor) {
       return visitor.visit(this);
    }
}

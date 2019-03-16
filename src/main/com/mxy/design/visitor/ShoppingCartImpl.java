package com.mxy.design.visitor;

public class ShoppingCartImpl implements ShoppingCartService {

    @Override
    public double visit(Book book) {
        return book.getCount() * book.getPrice();
    }

    @Override
    public double visit(Food food) {
        return food.getCount() * food.getPrice();
    }
}

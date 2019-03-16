package com.mxy.design.visitor;

public interface ShoppingCartService {

    double visit(Book book);

    double visit(Food food);

}

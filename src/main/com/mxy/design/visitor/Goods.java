package com.mxy.design.visitor;

public interface Goods {

    double accept(ShoppingCartService visitor);


}

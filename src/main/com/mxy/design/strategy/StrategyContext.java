package com.mxy.design.strategy;

/**
 * 策略环境 重点类
 */
public class StrategyContext {

    private DiscountStrategy discountStrategy;

    public StrategyContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    /**
     * 多态机制
     * @param price
     * @return
     */
    public double invoke(double price) {
        return discountStrategy.calculateDiscount(price);
    }


}

package com.mxy.design.strategy;

import java.math.BigDecimal;

/**
 * 策略角色实现 新客户
 */
public class NewCustomerQuoteStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price) {
        System.out.println("老顾客9折");
        return new BigDecimal(price).multiply(new BigDecimal(0.9)).doubleValue();
    }
}

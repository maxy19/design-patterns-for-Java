package com.mxy.design.strategy;

import java.math.BigDecimal;

/**
 * 策略角色实现 老客户
 */
public class OldCustomerQuoteStrategy implements DiscountStrategy {



    @Override
    public double calculateDiscount(double price) {
        System.out.println("老顾客8折");
        return new BigDecimal(price).multiply(new BigDecimal(0.8)).doubleValue();
    }
}

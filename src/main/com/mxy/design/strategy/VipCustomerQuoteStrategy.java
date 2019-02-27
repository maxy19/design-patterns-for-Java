package com.mxy.design.strategy;

import java.math.BigDecimal;

/**
 * 策略角色实现 vip客户
 */
public class VipCustomerQuoteStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price) {
        System.out.println("vip顾客5折");
        return new BigDecimal(price).multiply(new BigDecimal(0.5)).doubleValue();
    }
}

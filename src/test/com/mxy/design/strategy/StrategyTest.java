package com.mxy.design.strategy;

import org.junit.Test;

/**
 * 策略模式:定义了一系列的算法，并将每一个算法封装起来，使每个算法可以相互替代，使算法本身和使用算法的客户端分割开来，相互独立。
 * 开发中：解决相同条件的多层if...else..
 */
public class StrategyTest {


    @Test
    public void logicTest(){
        System.out.println("======不同客户，不同的折扣！=======");
        System.out.println("老顾客实际消费："+new StrategyContext(new OldCustomerQuoteStrategy()).invoke(10));
        System.out.println("vip顾客实际消费："+new StrategyContext(new VipCustomerQuoteStrategy()).invoke(10));
        System.out.println("新顾客实际消费："+new StrategyContext(new NewCustomerQuoteStrategy()).invoke(10));
    }

}

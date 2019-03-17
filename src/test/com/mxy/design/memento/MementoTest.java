package com.mxy.design.memento;

import org.junit.Test;

import java.util.Random;

/**
 * 备忘录模式：备忘录模式可以使系统恢复到某一历史时期的状态，又称标记模式
 * 场景：模拟下单流程，出现异常回滚到上个状态。
 */
public class MementoTest {

    @Test
    public void logicTest() {

        Memento memento1 = new Memento("待下单");
        OrderState state = new OrderState();
        state.restoreMemento(memento1);
        //赋值当前订单状态
        OrderStateProcess orderStateProcess = new OrderStateProcess(memento1);

        System.out.println("正在生成订单.....");
        if (rollbackState(orderStateProcess)){
            return;
        }

        Memento memento2 = new Memento("生成订单");
        state.restoreMemento(memento2);

        System.out.println("已生成订单准备支付");

        orderStateProcess = new OrderStateProcess(memento2);
        Memento memento3 = new Memento("待支付");
        state.restoreMemento(memento3);


        orderStateProcess = new OrderStateProcess(memento3);

        System.out.println("正在支付.....");
        if (rollbackState(orderStateProcess)){
            return;
        }

        Memento memento4 = new Memento("已支付");
        System.out.println("支付成功：当前订单状态："+memento4.getState());
        state.restoreMemento(memento4);

    }

    private boolean rollbackState(OrderStateProcess orderStateProcess) {
        //模拟场景 如果异常问题则回滚
        if((new Random().nextBoolean())) {
            orderStateProcess.rollbackLastState();
            System.out.println("出现异常回滚到订单状态："+orderStateProcess.rollbackLastState().getState());
            return true;
        }
        return false;
    }

}

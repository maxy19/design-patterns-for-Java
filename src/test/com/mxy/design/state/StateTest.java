package com.mxy.design.state;

import org.junit.Test;

/**
 * 状态模式：面向接口式编程，将实现细节巧妙封装在各个不同的状态类中，状态转换交给状态类自己去实现
 * 简化复杂的嵌套逻辑,与策略模式有类似点
 */
public class StateTest {

    @Test
    public void logicTest() {

          new OrderProcess(OrderProcess.PLACEORDER).changeState();
          new OrderProcess(OrderProcess.CREATE).changeState();
          new OrderProcess(OrderProcess.PAYMENt).changeState();
          new OrderProcess(OrderProcess.FINISH).changeState();

    }

}

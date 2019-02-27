package com.mxy.design.template;

import org.junit.Test;

/**
 * 　模板方法　一个模板方法是定义在抽象类中的，把基本操作方法组合在一起形成一个总算法或一个总行为的方法。
 *   本人倾向于使用内部构造实现
 *   JDK 中的servlet 就是一个典型的模板方法
 */
public class TempLateTest {
    @Test
    public void logicTest() {


        new ProcessTempLate() {

            @Override
            protected void checkParam(String... arg) {
                System.out.println(arg.length);
            }

            @Override
            protected void mainLogic() {
                System.out.println("处理主逻辑");
            }
        }.invoke("参数1","参数2");

    }
}

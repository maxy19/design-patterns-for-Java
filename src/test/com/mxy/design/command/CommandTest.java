package com.mxy.design.command;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * 命令模式:命令的封装。命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象。
 * 1.执行-动作-动作实现 三者解耦
 * 2.执行者不关心具体的实现 而关心特定的动作action
 * 3.如果接受者需要扩展方法 只需要扩展方法 或者重构接口类 并替换 而无需要改变动作（pass,shoot,dunk）等
 */
public class CommandTest {

    @Test
    public void logicTest() {
        //接受者 创造动作
        Receiver receiver = new Receiver();
        //执行者.execute -> 操作行为->接受者
        new Invoker(new Pass(receiver)).execute();
        new Invoker(new Dunk(receiver)).execute();
        new Invoker(new Shoot(receiver)).execute();
    }

    @Test
    public void logicTest2() {
        //接受者 创造动作-
        Receiver receiver = new Receiver();
        //执行者.execute -> 操作行为->接受者
        List<Command> commands = Lists.newArrayList(new Pass(receiver),new Dunk(receiver),new Shoot(receiver));
        new Invoker(commands.stream().findAny().get()).execute();
    }

}

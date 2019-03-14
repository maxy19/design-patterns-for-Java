package com.mxy.design.command;

/**
 * 执行者
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    void execute() {
        command.action();
    }


}

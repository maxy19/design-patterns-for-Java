package com.mxy.design.command;

/**
 * 传球
 */
public class Pass implements Command {

    private Receiver receiver;

    public Pass(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void action() {
        receiver.pass();
    }
}

package com.mxy.design.command;

/**
 * 灌篮
 */
public class Dunk implements Command {

    private Receiver receiver;

    public Dunk(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void action() {
        receiver.dunk();
    }
}

package com.mxy.design.command;

/**
 * 投篮
 */
public class Shoot implements Command {

    private Receiver receiver;

    public Shoot(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void action() {
        receiver.shoot();
    }
}

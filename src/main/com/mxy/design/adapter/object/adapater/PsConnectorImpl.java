package com.mxy.design.adapter.object.adapater;


public class PsConnectorImpl implements Ps2Connector {

    @Override
    public void ps2Description() {

        System.out.println("使用PS/2插口");
    }
}

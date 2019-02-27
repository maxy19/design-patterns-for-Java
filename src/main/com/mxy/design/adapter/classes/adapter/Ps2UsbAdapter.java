package com.mxy.design.adapter.classes.adapter;

/**
 * 1.类适配器
 * PS2 to Usb 转换口
 */
public class Ps2UsbAdapter extends UsbConnectorImpl implements Ps2Connector {

    /**
     * 重点：继承你需要适配的类
     */
    @Override
    public void ps2Description() {
        System.out.println("正在进行 PS/2适配USB中....");
        usbDescription();
    }
}

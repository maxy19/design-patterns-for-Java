package com.mxy.design.adapter.object.adapater;

/**
 * 1.对象适配器
 * PS2 to Usb 转换口
 */
public class Ps2UsbAdapter implements Ps2Connector {


    /**
     * 重点：在适配器里面持有需要适配的对象
     */
    private UsbConnector usbConnector;


    public Ps2UsbAdapter(UsbConnector usbConnector) {
        this.usbConnector = usbConnector;
    }

    @Override
    public void ps2Description() {
        System.out.println("正在进行 PS/2适配USB中....");
        usbConnector.usbDescription();
    }
}

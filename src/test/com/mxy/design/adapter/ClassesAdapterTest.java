package com.mxy.design.adapter;

import com.mxy.design.adapter.classes.adapter.Ps2Connector;
import com.mxy.design.adapter.classes.adapter.Ps2UsbAdapter;
import com.mxy.design.adapter.classes.adapter.PsConnectorImpl;
import org.junit.Test;

/**
 * 适配器:这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能
 * 适配器分为两类：类适配器模式、对象的适配器模式,接口适配器
 * 不同点:
 *    1.类适配器：使用继承
 *    2.对象适配器：使用组合(建议使用组合模式 降低耦合)
 *    3.继承原有方法 子类需要重写需要的 并不需要全部都是实现
 */
public class ClassesAdapterTest {


    /**
     * 类适配器
     */
    @Test
    public void logicTest() {
        System.out.println("======适配前=======");
        Ps2Connector ps2Connector = new PsConnectorImpl();
        ps2Connector.ps2Description();
        System.out.println("======适配后======");
        Ps2Connector adapter = new Ps2UsbAdapter();
        adapter.ps2Description();
    }



}

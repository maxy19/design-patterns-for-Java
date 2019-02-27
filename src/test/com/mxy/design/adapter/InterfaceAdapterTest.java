package com.mxy.design.adapter;

import com.mxy.design.adapter.interfaces.adapter.Chat;
import com.mxy.design.adapter.interfaces.adapter.Linux;
import com.mxy.design.adapter.interfaces.adapter.Port;
import com.mxy.design.adapter.interfaces.adapter.Tomcat;
import org.junit.Test;
/**
 * 适配器:这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能
 * 适配器分为两类：类适配器模式、对象的适配器模式,接口适配器
 * 不同点:
 *    1.类适配器：使用继承
 *    2.对象适配器：使用组合(建议使用组合模式 降低耦合)
 *    3.继承原有方法 子类需要重写需要的 并不需要全部都是实现
 */
public class InterfaceAdapterTest {

    /**
     * 接口适配器
     */
    @Test
    public void logicTest() {
        System.out.println("====LINUX使用原生的端口");
        Port linuxPort = new Linux();
        linuxPort.FTP();
        linuxPort.SSH();
        linuxPort.NET();
        System.out.println("====TOMCAT抽象并重写的端口");
        Port tomcatPort = new Tomcat();
        tomcatPort.NET();
        System.out.println("====CHAT抽象并重写的端口");
        Port ChatPort = new Chat();
        ChatPort.FTP();
        ChatPort.NET();
    }

}

package com.mxy.design.proxy;

import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK 生成代理类工具
 */
public class ProxyGeneratorUtils {
    /**
     *  把代理类的字节码写到硬盘上 
     *  @param path 保存路径 
     */
    public static void writeProxyClassToHardDisk(String path) throws IOException {
        // 第一种方法，这种方式在刚才分析ProxyGenerator时已经知道了
        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", true);
        // 第二种方法
        // 获取代理类的字节码
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy11", SchoolImpl.class.getInterfaces());
        FileOutputStream out = null;
        out = new FileOutputStream(path);
        out.write(classFile);
        out.flush();
    }

    @Test
    public void write() throws IOException {
        ProxyGeneratorUtils.writeProxyClassToHardDisk("./$Proxy11.class");
    }
}

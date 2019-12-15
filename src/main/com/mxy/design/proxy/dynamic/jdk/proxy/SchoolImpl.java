package com.mxy.design.proxy.dynamic.jdk.proxy;

import com.mxy.design.proxy.ISchool;

public class SchoolImpl implements ISchool {

    public SchoolImpl(){
        //JDK动态代理通过反射会调用这个方法
        System.out.println(SchoolImpl.class+":JDK 动态代理反射调用。");
    }

    public SchoolImpl(String str) {
        //避免与当通过代理初始化对象空构造时候打印内容混淆
    }

    @Override
    public void save() {
        System.out.println("保存学校信息ing");
    }

    @Override
    public void delete() {
        System.out.println("删除学校信息ing");
    }
}

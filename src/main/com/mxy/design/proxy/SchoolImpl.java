package com.mxy.design.proxy;

public class SchoolImpl implements ISchool {

    public SchoolImpl(){
        //JDK动态代理通过反射会调用这个方法
        System.out.println(SchoolImpl.class+":JDK 动态代理反射调用。");
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

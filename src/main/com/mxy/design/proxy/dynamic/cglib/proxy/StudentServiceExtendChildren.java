package com.mxy.design.proxy.dynamic.cglib.proxy;

public class StudentServiceExtendChildren extends StudentServiceExtend {

    public StudentServiceExtendChildren() {
        System.out.println("studentServiceExtendChildren===>扩展类子类构造方法");
    }

    public StudentServiceExtendChildren(String str) {
        //避免与当通过代理初始化对象空构造时候打印内容混淆
    }

    @Override
    public void save(){
        System.out.println("===>扩展类子类save");
    }

    @Override
    public void delete(){
        System.out.println("===>扩展类子类delete");
    }
}

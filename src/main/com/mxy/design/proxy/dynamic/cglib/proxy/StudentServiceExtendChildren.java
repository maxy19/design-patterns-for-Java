package com.mxy.design.proxy.dynamic.cglib.proxy;

public class StudentServiceExtendChildren extends StudentServiceExtend {

    public StudentServiceExtendChildren() {
        System.out.println("===>扩展类子类构造方法");
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

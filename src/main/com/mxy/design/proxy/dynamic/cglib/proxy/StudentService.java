package com.mxy.design.proxy.dynamic.cglib.proxy;

public class StudentService {

    public StudentService() {
        //CGLIB动态代理通过反射会调用这个方法
        System.out.println("基类==> CGLIB 动态代理反射调用。");
    }
    public StudentService(String str) {
        //避免混淆
    }

    public void save() {
        System.out.println("保存ing");
    }

    public void delete() {
        System.out.println("删除ing");
    }
}

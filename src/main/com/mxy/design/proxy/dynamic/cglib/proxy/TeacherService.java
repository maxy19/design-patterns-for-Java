package com.mxy.design.proxy.dynamic.cglib.proxy;

public class TeacherService {

    public TeacherService() {
        System.out.println("teacherService===>基类类构造方法");
    }
    public TeacherService(String str) {
        //避免与当通过代理初始化对象空构造时候打印内容混淆
    }

    public void save() {
        System.out.println("保存ing");
    }

    public void delete() {
        System.out.println("删除ing");
    }
}

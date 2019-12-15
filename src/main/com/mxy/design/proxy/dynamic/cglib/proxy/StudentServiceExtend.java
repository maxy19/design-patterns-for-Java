package com.mxy.design.proxy.dynamic.cglib.proxy;

public class StudentServiceExtend extends StudentService {

    public StudentServiceExtend() {
        System.out.println("studentServiceExtend===>扩展类构造方法");
    }

    public StudentServiceExtend(String str) {
    }

    @Override
    public void save(){
        System.out.println("===>扩展类Save");
        super.save();
    }

    @Override
    public void delete(){
        System.out.println("===>扩展类delete");
        super.delete();
    }
}

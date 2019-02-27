package com.mxy.design.proxy;

public class StudentImpl implements IStudent {
    @Override
    public void save() {
        System.out.println("保存ing");
    }

    @Override
    public void delete() {
        System.out.println("删除ing");
    }
}

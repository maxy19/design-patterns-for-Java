package com.mxy.design.proxy;

/**
 * 重点类 静态代理 实现目标接口
 */
public class SchoolProxy implements ISchool {

    private ISchool student;

    public SchoolProxy(ISchool iSchool) {
        this.student = iSchool;
    }

    @Override
    public void save() {
        System.out.println("==开启事务");
        student.save();
        System.out.println("==提交事务");
    }

    @Override
    public void delete() {
        //查询是否存在
        System.out.println("===开启事务");
        student.delete();
        System.out.println("===提交事务");
    }
}

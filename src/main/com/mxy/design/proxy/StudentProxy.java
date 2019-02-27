package com.mxy.design.proxy;

import java.util.Random;

/**
 * 重点类 静态代理 实现目标接口
 */
public class StudentProxy implements IStudent {

    private IStudent student;

    public StudentProxy(IStudent iStudent) {
        this.student = iStudent;
    }

    @Override
    public void save() {
        System.out.println("==开启事务");
        student.save();
        System.out.println("==提交事务");
    }

    @Override
    public void delete() {
        Random random = new Random();
        //查询是否存在
        if(random.nextBoolean()){
            System.out.println("===开启事务");
            student.delete();
            System.out.println("===提交事务");
        }else{
            System.out.println("===该用户已经被删除");
        }

    }
}

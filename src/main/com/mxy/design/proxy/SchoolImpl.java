package com.mxy.design.proxy;

public class SchoolImpl implements ISchool {

    public SchoolImpl(){
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

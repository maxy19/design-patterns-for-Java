package com.mxy.design.bridge;

public class ALi extends DriverManager {
    @Override
    protected void useDB(String dbName) {
        System.out.println("阿里使用=="+dbName+"==数据库");
    }
}

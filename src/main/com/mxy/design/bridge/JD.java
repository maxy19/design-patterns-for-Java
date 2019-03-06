package com.mxy.design.bridge;


public class JD extends DriverManager {
    @Override
    protected void useDB(String dbName) {
        System.out.println("京东使用=="+dbName+"==数据库");
    }
}

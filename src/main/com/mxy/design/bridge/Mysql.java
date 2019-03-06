package com.mxy.design.bridge;

public class Mysql implements JDBC {

    @Override
    public String DbName(){
        return "MYSQL";
    }
}

package com.mxy.design.bridge;

public class Oracle implements JDBC {
    @Override
    public String DbName(){
        return "ORACLE";
    }
}

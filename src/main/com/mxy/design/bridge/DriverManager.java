package com.mxy.design.bridge;

/**
 * 重点:Bridge 作为核心连接通道
 */
public abstract class DriverManager {

        public JDBC jdbc;

        protected abstract void useDB(String dbName);
}

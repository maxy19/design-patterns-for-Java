package com.mxy.design.prototype;

import org.junit.Test;

/**
 * 原型模式：创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 好处：避免构造函数约束，提高创建速度
 * 注意：如果一个类包含其他类对象 比如User 包含 Address 对象 则两个都要重写，不然就会出现 克隆前与克隆后User 使用Address为同一个对象。
 */
public class PrototypeTest {

    @Test
    public void logicTest() throws CloneNotSupportedException {
        User u1 = new User("maxy", 11);
        Address a1 = new Address();
        a1.setAddressName("beijing");
        u1.setAddress(a1);

        User cloneU1 = (User) u1.clone();
        cloneU1.setAge(12);
        cloneU1.setName("maxy clone");
        Address cloneA2 = (Address) a1.clone();
        cloneA2.setAddressName("shanghai");
        cloneU1.setAddress(cloneA2);

        System.out.println(u1 == cloneU1);//false
        System.out.println("克隆前 User:" + u1);
        System.out.println("克隆后 cloneU1:" + cloneU1);

        System.out.println("hashCode User:" + u1.hashCode());
        System.out.println("hashCode cloneU1:" + cloneU1.hashCode());

    }


}

package com.mxy.design.singleton.dcl;

import lombok.SneakyThrows;

/**
 * DCL模式
 */
public class Singleton {
    /*
      重点:volatile 利用有序性保证变量不参与重排序
      synchronized 保证代码块里面有序性，不能保证未进入代码块的变量有序，jvm依然可以重排序
      dcl问题点：
      需要知道的是 singleton = new Singleton();这句代码并不是一个原子操作,他的操作大体上可以被拆分为三步
        1.分配内存空间
        2.实例化对象instance
        3.把instance引用指向已分配的内存空间,此时instance有了内存地址,不再为null了
        java是允许对指令进行重排序, 那么以上的三步的执行顺序就有可能是1-3-2. 在这种情况下,
        如果线程A执行完1-3之后被阻塞了, 而恰好此时线程B进来了 此时的 singleton 已经不为空了所以线程B走完代码
        在[第一步]以后就直接返回了这个还没有实例化好的instance, 所以在调用其后续的实例方法时就会得不到预期的结果
    */
    private static volatile Singleton singleton;

    private Singleton() {
    }

    @SneakyThrows
    public static Singleton getInstance() {
        if (singleton == null) { //第一步，这一行在临界区，不受锁保护
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
                //同步代码块的unlock之前会把线程中的最新状态刷回主存
            }
        }
        return singleton;
    }

}

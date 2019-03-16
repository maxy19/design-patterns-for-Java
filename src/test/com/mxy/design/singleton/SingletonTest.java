package com.mxy.design.singleton;

import com.mxy.design.singleton.enum_.Singleton;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 单利模式:单例对象的类只能允许一个实例存在。
 * 非线程安全：
 * 1.懒汉模式:推荐 使用时候加载
 * 2.饿汉模式:不推荐
 * 线程安全：
 * 3.普通线程安全：不推荐
 * 4.DCL模式(Double Check Lock):不要忘记使用关键字 volatile （可见性）
 * 5.ENUM模式(最安全):推荐
 * 6.静态内部类模式:推荐
 * 注意： 除枚举模式 其他的都无法防止以下问题(序列化,clone,多线程,反射)生成多个对象。
 */
public class SingletonTest {

    private final ExecutorService threadPool = Executors.newFixedThreadPool(10);

    @Test
    public void logicTest1() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(com.mxy.design.singleton.lazy.Singleton.getInstance());
        }
        System.out.println("懒汉模式");
    }

    @Test
    public void logicTest2() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(com.mxy.design.singleton.hungry.Singleton.getInstance());
        }
        System.out.println("饿汉模式");
    }

    @Test
    public void logicTest3() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(com.mxy.design.singleton.safe.Singleton.getInstance());
                }
            });
        }
        shutDownThreadPool();
        System.out.println("synchronize模式");
    }

    @Test
    public void logicTest4() {
        for (int i = 0; i < 10; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(com.mxy.design.singleton.dcl.Singleton.getInstance());
                }
            });
        }
        shutDownThreadPool();
        System.out.println("dcl模式");
    }

    @Test
    public void logicTest5() {
        for (int i = 0; i < 10; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.INSTANCE.getInstance());
                }
            });
        }
        shutDownThreadPool();
        System.out.println("enum 枚举模式");
    }

    @Test
    public void logicTest6() {
        for (int i = 0; i < 10; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(com.mxy.design.singleton.inner.Singleton.getInstance());
                }
            });
        }
        shutDownThreadPool();
        System.out.println("静态内部类模式");
    }

    private void shutDownThreadPool() {
        threadPool.shutdown();
        try {
            if (!threadPool.awaitTermination(5, TimeUnit.SECONDS)) {
                threadPool.shutdownNow();
            }
        } catch (InterruptedException e) {
            threadPool.shutdownNow();
        }
    }

}

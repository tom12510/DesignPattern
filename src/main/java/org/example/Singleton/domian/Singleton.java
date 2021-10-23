package org.example.Singleton.domian;

/**
 * 单例模式通用代码  (线程安全)
 */
public class Singleton {
    //类加载时创建一次
    private static final Singleton singleton = new Singleton();

    //私有化构造方法
    private Singleton() {
    }

    // 提供获取单个对象
    public static Singleton getSingleton() {
        return singleton;
    }

    public static void doSomeThing() {
        System.out.println("create  one Singleton");
    }

}

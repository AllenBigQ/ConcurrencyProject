package com.mmall.concurrency.example.singleton;
import com.mmall.concurrency.annotation.ThreadSafe;

/**
 * Created by Allen
 * 饿汉模式
 * 单例实例在类装载时进行创建
 */
@ThreadSafe
public class SingletonExample2 {
    //私有构造函数,防止外部多次实例化
    private SingletonExample2() {
        //可能会进行很多操作
    }

    //单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    //静态的工厂方法
    public static SingletonExample2 getInstance() {
        return instance;
    }
}

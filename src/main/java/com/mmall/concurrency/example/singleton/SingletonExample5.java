package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotation.NotThreadSafe;
import com.mmall.concurrency.annotation.ThreadSafe;

/**
 * Created by Allen
 * 懒汉模式->双重同步锁单例模式(volatile防止指令重排)
 * 单例实例在第一次使用时进行创建
 */
@ThreadSafe
public class SingletonExample5 {
    //私有构造函数,防止外部多次实例化
    private SingletonExample5() {

    }

    //单例对象 volatile + 双重检测机制 ->禁止指令重排
    private volatile static SingletonExample5 instance = null;

    //静态的工厂方法
    public static synchronized SingletonExample5 getInstance() {
        if (instance == null) {     //双重检测机制
            synchronized (SingletonExample5.class){ //同步锁
                if (instance==null){
                instance = new SingletonExample5();
                }
            }
        }
        return instance;
    }
}

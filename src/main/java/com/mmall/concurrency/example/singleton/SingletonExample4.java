package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotation.NotRecommend;
import com.mmall.concurrency.annotation.NotThreadSafe;
import com.mmall.concurrency.annotation.ThreadSafe;

/**
 * Created by Allen
 * 懒汉模式->双重同步锁单例模式
 * 单例实例在第一次使用时进行创建
 */
@NotThreadSafe
public class SingletonExample4 {
    //私有构造函数,防止外部多次实例化
    private SingletonExample4() {

    }

    //单例对象
    private static SingletonExample4 instance = null;

    //静态的工厂方法
    public static synchronized SingletonExample4 getInstance() {
        if (instance == null) {     //双重检测机制
            synchronized (SingletonExample4.class){ //同步锁
                if (instance==null){
                instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}

package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotation.Recommend;
import com.mmall.concurrency.annotation.ThreadSafe;

/**
 * Created by Allen
 * 单例模式——枚举模式：最安全
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {
    //私有构造函数
    private SingletonExample7(){

    }
    public static SingletonExample7 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    //私有的枚举类
    private enum Singleton{
        INSTANCE;
        //定义一个私有的实例
        private SingletonExample7 singleton;

        //JVM保证这个方法绝对只调用一次
        Singleton(){
            singleton = new SingletonExample7();
        }
        public SingletonExample7 getInstance(){
            return singleton;
        }
    }
}

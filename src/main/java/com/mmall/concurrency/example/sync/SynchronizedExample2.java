package com.mmall.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Allen
 * 介绍synchronizaed 修饰一个类和修饰一个静态方法
 */
@Slf4j
public class SynchronizedExample2 {
    //修饰一个类
    public static void test1(int j){
        synchronized (SynchronizedExample2.class){
            for (int i=0;i<10;i++){
                log.info("test1 {}- {}",j,i);
            }
        }
    }

    //修饰一个静态方法
    public static  synchronized void test2(int j){
        for (int i=0;i<10;i++){
            log.info("test2 {}- {}",j,i);
        }
    }

    public static void main(String[] args) {

        //测试一个类
//        SynchronizedExample1 example1 = new SynchronizedExample1();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(()->{
//            example1.test1(1);
//        });
//        executorService.execute(()->{
//            example1.test1(2);
//        });           //输出结果为0-9  0-9

        //测试静态方法
//        SynchronizedExample1 example1 = new SynchronizedExample1();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(()->{
//            example1.test2(1);
//        });
//        executorService.execute(()->{
//            example1.test2(2);
//        });           //输出结果为0-9  0-9


    }
}

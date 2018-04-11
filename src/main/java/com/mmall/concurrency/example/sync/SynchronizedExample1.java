package com.mmall.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Allen
 * 介绍synchronizaed 修饰一个代码块和修饰一个方法
 */
@Slf4j
public class SynchronizedExample1 {
    //修饰一个代码块
    public void test1(int j){
        synchronized (this){
            for (int i=0;i<10;i++){
                log.info("test1 {}- {}",j,i);
            }
        }
    }

    //修饰一个方法
    public synchronized void test2(int j){
        for (int i=0;i<10;i++){
            log.info("test2 {}- {}",j,i);
        }
    }

    public static void main(String[] args) {
//        SynchronizedExample1 example1 = new SynchronizedExample1();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(()->{
//            example1.test1(1);
//        });
//        executorService.execute(()->{
//            example1.test1(1);
//        });           //输出结果为0-9  0-9

//        SynchronizedExample1 example1 = new SynchronizedExample1();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(()->{
//            example1.test2(2);
//        });
//        executorService.execute(()->{
//            example1.test2(2);
//        });           //输出结果为0-9 0-9

//        SynchronizedExample1 example1 = new SynchronizedExample1();
//        SynchronizedExample1 example2 = new SynchronizedExample1();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(()->{
//            example1.test1(1);
//        });
//        executorService.execute(()->{
//            example2.test1(2);
//        });           //0-9交替进行

//        SynchronizedExample1 example1 = new SynchronizedExample1();
//        SynchronizedExample1 example2 = new SynchronizedExample1();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(()->{
//            example1.test2(1);
//        });
//        executorService.execute(()->{
//            example2.test2(2);
//        });           //0-9交替进行
    }
}
package com.mmall.concurrency.example.syncContainer;

import com.mmall.concurrency.annotation.NotThreadSafe;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Allen
 */
@NotThreadSafe
public class VectorExample3 {
    //使用foreach
    //运行test1(vector)后产生异常java.util.ConcurrentModificationException
    private static void test1(Vector<Integer> v1){
        for (Integer i :v1){
            if (i.equals(3)){
                v1.remove(i);
            }
        }
    }
    //迭代器
    //运行test2(vector)后产生异常java.util.ConcurrentModificationException
    private static void test2(Vector<Integer> v1){
        Iterator<Integer> iterator = v1.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i.equals(3)){
                v1.remove(i);
            }
        }
    }
    //for循环
    //运行test3(vector)正常
    private static void test3(Vector<Integer> v1){
        for (int i =0;i<v1.size();i++){
            if (v1.get(i).equals(3)){
                v1.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        test2(vector);
    }
}

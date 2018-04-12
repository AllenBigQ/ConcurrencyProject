package com.mmall.concurrency.example.immutable;

import com.google.common.collect.Maps;
import com.mmall.concurrency.annotation.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * Created by Allen
 * final关键字修饰变量
 */
@Slf4j
@NotThreadSafe
public class ImmutableExample1 {
    private final static Integer a =1;
    private final static String b = "2";
    private final static Map<Integer,Integer> map = Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
    }

    public static void main(String[] args) {
        //修饰基础数据类型时不可修改
//        a=2;
//        b="3";
        //修饰引用时初始化之后不能再修改其引用，但可以修改里面的值
//        map=Maps.newHashMap();
        map.put(1,3);
        log.info("{}",map.get(1));
    }
    //修饰一个传进来的变量，如果是基本数据类型也是不可修改的
    private void test(final int a){
//        a=2;
    }
}

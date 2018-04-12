package com.mmall.concurrency.example.immutable;

import com.google.common.collect.Maps;
import com.mmall.concurrency.annotation.NotThreadSafe;
import com.mmall.concurrency.annotation.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

/**
 * Created by Allen
 * Collections
 */
@Slf4j
@ThreadSafe
public class ImmutableExample2 {
    private  static Map<Integer,Integer> map = Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map= Collections.unmodifiableMap(map);//通过这样处理过的map不能被修改
    }

    public static void main(String[] args) {
        //运行后会抛出异常
//        map.put(1,3);
        log.info("{}",map.get(1));
    }
}

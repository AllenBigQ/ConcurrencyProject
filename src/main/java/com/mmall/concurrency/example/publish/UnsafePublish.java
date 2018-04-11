package com.mmall.concurrency.example.publish;

import com.mmall.concurrency.annotation.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Allen
 * 不安全的发布
 */
@Slf4j
@NotThreadSafe
public class UnsafePublish {
    private String[] states = {"a","b","c"};
    public String[] getStates(){
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        log.info("{}", Arrays.toString(unsafePublish.getStates()));
        unsafePublish.getStates()[0]="d";
        log.info("{}", Arrays.toString(unsafePublish.getStates()));
    }
}

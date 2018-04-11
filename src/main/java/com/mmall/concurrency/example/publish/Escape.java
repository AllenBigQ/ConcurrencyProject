package com.mmall.concurrency.example.publish;

import com.mmall.concurrency.annotation.NotRecommend;
import com.mmall.concurrency.annotation.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Allen
 * 对象溢出
 */
@Slf4j
@NotThreadSafe
@NotRecommend
public class Escape {
    private int thisCanBeEscape = 0;
    public Escape(){

    }
    private class InnerClass{
        public InnerClass(){
            log.info("{}",Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}

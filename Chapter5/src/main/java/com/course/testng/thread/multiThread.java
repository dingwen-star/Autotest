package com.course.testng.thread;

import org.testng.annotations.Test;

public class multiThread {
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println("线程测试");
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}

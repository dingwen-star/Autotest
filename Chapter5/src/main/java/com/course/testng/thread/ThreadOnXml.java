package com.course.testng.thread;

import org.testng.annotations.Test;

public class ThreadOnXml {

    @Test()
    public void test1(){
        System.out.println();
        System.out.printf("test1的线程Thread Id: %s%n",Thread.currentThread().getId());
    }

    @Test()
    public void test2(){
        System.out.printf("test2的线程Thread Id: %s%n",Thread.currentThread().getId());
    }
    @Test()
    public void test3(){
        System.out.printf("test3的线程Thread Id: %s%n",Thread.currentThread().getId());
    }
}

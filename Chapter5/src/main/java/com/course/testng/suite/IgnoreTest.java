package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore 1 执行");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore 3 执行");
    }

}

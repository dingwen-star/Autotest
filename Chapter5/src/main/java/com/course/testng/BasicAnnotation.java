package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test //最基本的注解，用来把方法标记为测试的一部分
    public void testCase1(){
        System.out.println("这个测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这个测试用例2");
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("这是在测试前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行的");
    }

    @BeforeClass
    public void bedorClass(){
        System.out.println("这是类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是类运行后执行的方法");
    }

    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }


}

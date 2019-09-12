package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是server 1 测试.......");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是server 2测试.............");
    }

    @Test
    public void test3(){
        System.out.println("这是客户端 1测试...........");
    }

    @BeforeGroups("server")
    public void Server1(){
        System.out.println("这是server测试之前执行的------------");
    }

    @AfterGroups("server")
    public void Server2(){
        System.out.println("这是server测试执行之后执行的***********");
    }
}

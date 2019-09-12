package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teah")
public class GroupsOneClass3 {
    public void teacher1(){
        System.out.println("Class3中的teacher1运行..................");
    }
    public void teacher2(){
        System.out.println("Class3中的teacher2运行..................");
    }
}

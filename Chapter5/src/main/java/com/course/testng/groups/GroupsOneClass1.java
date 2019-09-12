package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOneClass1 {
    public void student1(){
        System.out.println("Class中的student1运行..................");
    }
    public void student2(){
        System.out.println("Class中的student2运行..................");
    }
}

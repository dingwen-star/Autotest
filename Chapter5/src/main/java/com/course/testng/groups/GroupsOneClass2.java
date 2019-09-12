package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOneClass2 {
    public void student1(){
        System.out.println("Class2中的student1运行..................");
    }
    public void student2(){
        System.out.println("Class2中的student2运行..................");
    }
}

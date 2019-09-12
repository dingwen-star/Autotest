package com.course.testng.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTet {
    @Test
    @Parameters({"name","age"})
    public void parameter(String name,int age){
        System.out.println();
        System.out.println("name = "+ name+";  age = "+age);
    }
}

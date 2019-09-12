package com.course.testng.Parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ProviderData {
    @Test(dataProvider = "data")
    public void testProviderData(String name,int age){
        System.out.println("name = "+ name +";  age = "+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] para = new Object[][]{
                {"萨顶顶",26},
                {"周杰伦",33},
                {"阿三啊",16}
        };
        return para;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法 name = "+name+"; age = "+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法 name = "+name+"; age = "+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"张张",20},
                    {"五五",25},
                    {"嘻嘻",18}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"六六",17},
                    {"七七",21},
                    {"霞霞",28}
            };
        }
        return result;
    }
}

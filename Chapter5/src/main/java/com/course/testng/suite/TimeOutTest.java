package com.course.testng.suite;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)
    public void TestSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void TestFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}

package com.xm.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在每一个测试方法之前运行");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在每一个测试方法之后运行");
    }

    @BeforeClass
    public void beforClass(){
        System.out.println("这是在类运行之前运行");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行之后运行");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("beforeSuite测试套件");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("afterSuite测试套件");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }


}

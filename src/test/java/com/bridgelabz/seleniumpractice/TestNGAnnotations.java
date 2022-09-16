package com.bridgelabz.seleniumpractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(priority = 0)
    public void test2(){
        System.out.println("Test 2 with priority 0");
    }

    @Test(priority = 1, invocationCount = 3)
    public void test3(){
        System.out.println("Test 3.. Invocation count is 3 so will run the test Three times");
    }

    @Test(priority = 2,invocationCount = 3, enabled = false)
    public void test4(){
        System.out.println("Test 4.. If enabled=false The test will not run");
    }

    @Test(priority = 3, invocationCount = 0)
    public void test5(){
        System.out.println("Test 5.. If invocation count is 0 ");
    }




    @Test(priority=4)
    public void createUser(){
        System.out.println("createUser...user created successufuly");
        Assert.fail();
    }
    @Test(priority=5, dependsOnMethods="createUser")
    public void deleteUser(){
        System.out.println("deleteUser...");
    }







    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }
}

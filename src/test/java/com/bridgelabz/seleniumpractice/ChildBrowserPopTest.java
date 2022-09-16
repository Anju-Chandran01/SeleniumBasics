package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class ChildBrowserPopTest {

    WebDriver driver;

    @BeforeTest
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");
        Thread.sleep(1000);
    }

    @Test
    public void windowHandle_Title_Id() throws InterruptedException {
        String parentWindowID = driver.getWindowHandle();
        System.out.println("Parent window handle id " + parentWindowID);
        System.out.println("Parent window title " + driver.getTitle());

        driver.findElement(By.xpath("//a[contains(text(),'Amazon')]")).click();
        Set<String> windowHandleIDs = driver.getWindowHandles();


        for (String windoID:windowHandleIDs) {
            if(!windoID.equals(parentWindowID)){
                driver.switchTo().window(windoID);
                System.out.println("Child window title " + driver.getTitle());
                System.out.println("Child window id " + windoID);
                Thread.sleep(5000);
                driver.close();
            }
//            else
//                driver.close();
        }
    }

    @Test
    public void close_MainBrowser_Only(){
        //get the window handle id of the parent browser window
         String parentWindowhandleID = driver.getWindowHandle();
         Set<String> allWindowHandles = driver.getWindowHandles();
         int count = allWindowHandles.size();
         System.out.println("Number of browser windows opened on the system is : "+ count);
         for (String windowHandle : allWindowHandles) {
             //switch to each browser window
              driver.switchTo().window(windowHandle);
             if (windowHandle.equals(parentWindowhandleID)) {
                 driver.close();
                 System.out.println("Main Browser window is closed");
             }
         }
    }
    @Test
    public void close_All_ChildBrowsers_Only(){
        //get the window handle id of the parent browser window
        String parentWindowhandleID = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : "+ count);
        for (String windowHandle : allWindowHandles) {
            //switch to each browser window
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            if (!windowHandle.equals(parentWindowhandleID)) {
                driver.close();
                System.out.println("Child Browser window with title -->"+ title +" --> is closed");
            }
        }
    }

    @Test
    public void handleTabs(){
        driver.navigate().to("https://demo.actitime.com/login.do");
        //get the window handle id of the parent browser window
        String parentWindowHandle = driver.getWindowHandle();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
        //get the number of windows currently opened on the system
        Set<String> allwhs = driver.getWindowHandles();
        //switch to all the browser windows
        for (String wh : allwhs) {
            driver.switchTo().window(wh);
        }
        String childTitle = driver.getTitle();
        System.out.println("Title of the child tab is :"+ childTitle);
        driver.close();
        //switch back to the main browser window
        driver.switchTo().window(parentWindowHandle);
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        //closing the parent window
        driver.close();
    }
}

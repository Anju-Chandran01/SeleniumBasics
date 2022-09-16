package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest {
    WebDriver driver;
    @Test
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("C:\\Users\\HP\\IdeaProjects\\SeleniumBasics\\src\\main\\resources\\page3.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.id("t3")).sendKeys("3rd text field");
        Thread.sleep(2000);
        driver.switchTo().frame("f2");
        driver.findElement(By.id("t2")).sendKeys("2nd text field");
        Thread.sleep(2000);

        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("1st text field");
        Thread.sleep(2000);

        driver.switchTo().parentFrame();

        driver.findElement(By.id("t2")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("t2")).sendKeys("2nd after switching to parent frame");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        driver.findElement(By.id("t3")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("t3")).sendKeys("3rd after switching to default content");
        Thread.sleep(2000);

    }
}

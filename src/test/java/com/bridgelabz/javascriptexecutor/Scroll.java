package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scroll {

    WebDriver driver;

    @BeforeTest
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
        driver.manage().window().maximize();
    }

    @Test
    public void scroll_UpAndDown() throws InterruptedException {
        //typecasting driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
        //scroll down on the webpage
            js.executeScript("window.scrollBy(0, 500)");
            Thread.sleep(3000);
            System.out.println("The count is " + i);
        }
        for (int i = 1; i < 10; i++) {
        //scroll up on the webpage
            js.executeScript("window.scrollBy(0, -500)");
            Thread.sleep(3000);
            System.out.println("The count is " + i);
        }
    }

    @Test
    public void scrollDown_To_SpecificElement() throws InterruptedException {

        // find the Applitools element on the webpage
        WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));

        int x = ele.getLocation().getX();
        int y = ele.getLocation().getY();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Scroll to Applitools element’s x and y coordinate
        js.executeScript("window.scrollBy("+x+", "+y+")");
        Thread.sleep(3000);
    }
}
package com.bridgelabz.seleniumpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {
    @Test
    public void screenshotFromChromeDriver() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("anjuchandrancs01@gmail.com");
        Thread.sleep(2000);

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenshots/" + System.currentTimeMillis() + "facebook" + ".png");
        FileHandler.copy(srcFile, destFile);
        driver.close();
    }

    @Test
    public void screenshotFromFirefoxDriver() throws InterruptedException, IOException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenshots/" + System.currentTimeMillis() + "facebook" + ".png");
        FileHandler.copy(srcFile, destFile);
        driver.close();
    }

    @Test
    public void screenshotWithoutWebDriverManager() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("anjuchandrancs01@gmail.com");
        Thread.sleep(2000);

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenshots/" + System.currentTimeMillis() + "facebook" + ".png");
        FileHandler.copy(srcFile, destFile);
        driver.close();
    }
}

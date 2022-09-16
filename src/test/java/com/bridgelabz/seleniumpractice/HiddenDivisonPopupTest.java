package com.bridgelabz.seleniumpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisonPopupTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("anjuchandran153@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Anju123@123");
        driver.findElement(By.linkText("Log In")).click();
        driver.close();
    }
}

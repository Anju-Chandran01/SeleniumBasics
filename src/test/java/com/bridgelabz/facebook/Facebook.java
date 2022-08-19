package com.bridgelabz.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
    WebDriver driver;

    @BeforeTest
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @Test
    public void createAccount() throws InterruptedException{
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Anju");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Chandran");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("anjuchandran153@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("anjuchandran153@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Anju123@123");
        Thread.sleep(2000);
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("23");
        Thread.sleep(2000);
        Select month = new Select(driver.findElement(By.name("birthday_month")));
        month.selectByVisibleText("Jan");
        Thread.sleep(2000);
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1998");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='u_4_s_5S']")).click();
        driver.close();
    }
}

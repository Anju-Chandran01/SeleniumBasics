package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PopupTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Say my name!']"))).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);

        System.out.println("Alert text is '" +alert.getText() +"'");
        Thread.sleep(3000);
        alert.sendKeys("Anju");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);

        System.out.println("Message after entering name '" + alert.getText() +"'");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
    }
}

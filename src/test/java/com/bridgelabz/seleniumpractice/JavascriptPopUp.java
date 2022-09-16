package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavascriptPopUp {

    public static WebDriver driver;

    @BeforeTest
    public void launchBrowswe() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void simpleAlertPopup() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void conformationPopup() throws InterruptedException {
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("confirmalertbox")).click();
        Thread.sleep(2000);
        Alert confirmationAlert = driver.switchTo().alert();
        String alertText = confirmationAlert.getText();
        System.out.println("The alert text is : " + alertText);
        confirmationAlert.accept();
    }

    @Test
    public void promptPopup() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        promptAlert.accept();
    }
}

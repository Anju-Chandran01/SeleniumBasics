package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUpload {

    public static WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void fileUpload_UsingSendKeys() throws InterruptedException {
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\HP\\Downloads\\Anju_Chandran_CV.pdf");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void autoIt_UploadFile() throws InterruptedException, IOException {
        driver.get("https://www.freepdfconvert.com/pdf-to-word");
        driver.findElement(By.linkText("Choose PDF file")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\HP\\Documents\\fileUpload1.exe");
    }
}
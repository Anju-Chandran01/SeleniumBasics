package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anju");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Chandran");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id,'u_f_g_iq')]")).sendKeys("anjuchandrancs01@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__' and @type='text']")).sendKeys("anjuchandrancs01@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_passwd__' or @id='password_step_input']")).sendKeys("Anju1234@123");
        Thread.sleep(2000);
    }
}

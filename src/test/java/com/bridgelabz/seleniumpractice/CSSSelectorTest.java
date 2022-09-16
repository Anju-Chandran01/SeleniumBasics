package com.bridgelabz.seleniumpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTest {
    public static void main(String args[]) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        //create account
        driver.findElement(By.cssSelector("a#u_0_0_q/"));
        driver.findElement(By.cssSelector("input#u_f_b_CU.inputtext"));
        driver.findElement(By.cssSelector("input[id='u_f_d_cJ']"));
        driver.findElement(By.cssSelector("input[id='u_f_g_iq'][type='text']"));
        driver.findElement(By.cssSelector("input[name^='reg_email_conf']"));
        driver.findElement(By.cssSelector("input[id*='password_step']"));
        driver.findElement(By.cssSelector("select[name$='_day']"));
    }
}

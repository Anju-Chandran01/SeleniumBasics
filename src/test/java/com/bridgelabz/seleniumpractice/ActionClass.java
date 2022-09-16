package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        ActionClass.dragAndDrop(driver);
//        ActionClass.contextClick(driver);
        ActionClass.moveToParticularElement(driver);
    }

    public static void moveToParticularElement(WebDriver driver) throws InterruptedException {
        driver.get("https://www.istqb.in/");
        Thread.sleep(3000);
        WebElement foundation = driver.findElement(By.xpath("//a[contains(text(),'Foundation')]"));

        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(foundation).perform();
        Thread.sleep(3000);
    }

    public static void dragAndDrop(WebDriver driver) throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(3000);
        WebElement dragElement = driver.findElement(By.id("box7"));
        WebElement dropElement = driver.findElement(By.id("box107"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        System.out.println("Hii");
        actions.dragAndDrop(dragElement,dropElement);
        Thread.sleep(3000);
    }

    public static void contextClick(WebDriver driver) throws InterruptedException {
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        WebElement logInButton = driver.findElement(By.linkText("Log In"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.contextClick(logInButton);
        Thread.sleep(3000);
        driver.quit();
    }
}

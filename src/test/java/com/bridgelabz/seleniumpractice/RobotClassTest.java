package com.bridgelabz.seleniumpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassTest {

    public static void main(String[] args) throws AWTException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        Robot robot = new Robot();

        robot.mouseMove(300,300);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_I);

        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_I);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_C);

        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);

    }
}

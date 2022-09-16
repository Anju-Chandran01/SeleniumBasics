package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTooltip_Actitime_RememberCheckbox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");

        //find the Keep me Logged in Checkbox
        WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));

        //get the tooltip text using getAttribute() method and store in a variable
        String tooltipText = Checkbox.getAttribute("title");
        System.out.println(tooltipText);

        driver.close();
    }
}

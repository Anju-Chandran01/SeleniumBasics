package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText_Into_DisabledTextBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\HP\\IdeaProjects\\SeleniumBasics\\src\\main\\resources\\test.html");
        //Typecast driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        //enter "admin" in first textbox
        js.executeScript("document.getElementById('t1').value='admin'");
        Thread.sleep(2000);

        //clear the value in second textbox
        js.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(2000);

        //enter "manager" in second textbox
        js.executeScript("document.getElementById('t2').value='manager'");
        Thread.sleep(2000);

        //change the second text box to button type
        js.executeScript("document.getElementById('t2').type='button'");
        Thread.sleep(2000);
    }
}

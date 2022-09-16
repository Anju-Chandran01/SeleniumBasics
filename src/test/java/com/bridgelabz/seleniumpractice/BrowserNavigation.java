package com.bridgelabz.seleniumpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserNavigation {

    @Test
    public void launch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println("The title of the page is : " + title);
        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("The URL of the page is : " + currentUrl);
        Thread.sleep(2000);

        String pageSource = driver.getPageSource();
        System.out.println("The source code of the page is : " + pageSource);
        Thread.sleep(2000);


        ///////******** Browser Navigations **********///////
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);

        String amazonTitle = driver.getTitle();
        System.out.println("The title of the navigated page is : " + amazonTitle);
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
    }
}



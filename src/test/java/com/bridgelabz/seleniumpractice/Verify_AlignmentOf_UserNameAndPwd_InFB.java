package com.bridgelabz.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verify_AlignmentOf_UserNameAndPwd_InFB {
    WebDriver driver;
    @BeforeTest
    public void launch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void userNameAndPassword_IsInSameRowOrNot() throws InterruptedException {
        WebElement unTB = driver.findElement(By.id("email"));
        Thread.sleep(2000);
        int username_Y_coordinate = unTB.getLocation().getY();
        System.out.println(username_Y_coordinate);
        Thread.sleep(2000);

        WebElement pwdTB = driver.findElement(By.name("pass"));
        Thread.sleep(2000);
        int password_Y_coordinate = pwdTB.getLocation().getY();
        System.out.println(password_Y_coordinate);
        Thread.sleep(2000);

        //check whether the Y-coordinate of username and  password field are same
        if (username_Y_coordinate == password_Y_coordinate) {
            System.out.println("Both username and password fields are displayed in the same row");
        }else{
            System.out.println("username and password fields are NOT aligned in the same row");
        }

    }

    @Test
    public void alignmentVerificationOfUNandPWD() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement unTB = driver.findElement(By.id("username"));
        int username_height = unTB.getSize().getHeight();
        int username_width = unTB.getSize().getWidth();
        System.out.println("Height of User name is " + username_height);
        System.out.println("Width of User name is " + username_width);

        WebElement pwdTB = driver.findElement(By.name("pwd"));
        int password_height = pwdTB.getSize().getHeight();
        int password_width = pwdTB.getSize().getWidth();
        System.out.println("Height of password is " + password_height);
        System.out.println("Width of password is" + password_width);

        //check the height and width of username and password fields are same
        if (username_height==password_height && username_width==password_width) {
            System.out.println("Username and password fields are aligned");
        }else{
            System.out.println("Username and password fields are NOT aligned");
        }
    }

    @Test
    public void usernameField_lessthanMobileNumberField() {
        System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        int username_width = unTB.getSize().getWidth();
        System.out.println(username_width);
        //Identify the mobile number text box
        WebElement mobileNumTB = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
        int mobNumWidth = mobileNumTB.getSize().getWidth(); System.out.println(mobNumWidth);
        //Compare the width of both username and mobilenumber text box
        if (username_width==mobNumWidth) {
            System.out.println("Size of Both username and password fields are same" +username_width+" = " + mobNumWidth);
        } else {
            System.out.println("Size of username and password fields are NOT same that is : " + username_width + " Not equals to " + mobNumWidth);
        }
    }
}

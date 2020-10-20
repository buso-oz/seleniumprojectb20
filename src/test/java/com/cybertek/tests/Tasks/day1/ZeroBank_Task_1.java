package com.cybertek.tests.Tasks.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_Task_1 {
/*
TC #1: Zero Bank title verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify titleExpected: “Zero -Log in”
 */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Log in";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!");
        }
    }
}

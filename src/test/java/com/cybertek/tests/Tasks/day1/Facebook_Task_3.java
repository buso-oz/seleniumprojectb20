package com.cybertek.tests.Tasks.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Task_3 {
/*
TC #3: Facebook header verification1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify header text is as expected:
Expected: “Connect with friends and the world around you on Facebook.”
 */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");

        String actualHeader = driver.findElement(By.className("_8eso")).getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header Verification PASSED!");
        }else{
            System.out.println("Header Verification FAILED!");
        }

    }
}

package com.cybertek.tests.Tasks.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Task_4 {
/*
TC #4: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify “Create a page” link href value contains text:
 Expected: “registration_form”
 */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");

        String expectedInAttribute = "registration_form";
        String actualInAttribute = driver.findElement(By.linkText("Create a Page")).getAttribute("href");

        if(actualInAttribute.contains(expectedInAttribute)){
            System.out.println("Attribute value verification PASSED!");
        }else{
            System.out.println("Attribute value verification FAILED!!!");
        }

        System.out.println(driver.findElement(By.linkText("Create a Page")).getText());


    }
}

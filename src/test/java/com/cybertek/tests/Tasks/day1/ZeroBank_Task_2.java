package com.cybertek.tests.Tasks.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_Task_2 {
/*
TC #2: Zero Bank link text verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify link text from top left:Expected: “Zero Bank”
4.Verify link href attribute value contains:
Expected: “index.html”
 */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        String actualHREF = driver.findElement(By.linkText("Zero Bank")).getAttribute("href");
        String expectedHREF = "index.html";

        if(actualHREF.contains(expectedHREF)){
            System.out.println("Attribute Verification PASSED!");
        }else{
            System.out.println("Attribute Verification FAILED!");
        }
    }
}

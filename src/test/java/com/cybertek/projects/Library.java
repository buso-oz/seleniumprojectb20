package com.cybertek.projects;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Library {

    WebDriver driver;
    @BeforeMethod
    public void setUp_Method(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open the url
        driver.get("http://library2.cybertekschool.com/login.html");
        BrowserUtils.wait(2);
        //credentials
        driver.findElement(By.id("inputEmail")).sendKeys("student64@library");
        driver.findElement(By.id("inputPassword")).sendKeys("pbdQAvkN");
        //click login
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
        BrowserUtils.wait(2);
        

    }
    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test
    public void book_categories(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click "Book Categories"
        driver.findElement(By.id("book_categories")).click();
        BrowserUtils.wait(2);
        // choose a category
        driver.findElement(By.xpath("//option[@value='14']")).click();
        BrowserUtils.wait(2);

    }
}

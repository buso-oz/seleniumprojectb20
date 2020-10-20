package com.cybertek.projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrack {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.name("_username")).sendKeys("user177");
        Thread.sleep(1000);

        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        Thread.sleep(1000);

        driver.findElement(By.name("_submit")).click();




    }



}

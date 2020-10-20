package com.cybertek.tests.day1_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.close();

    }
}

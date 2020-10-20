package com.cybertek.tests.day1_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.quit();

    }
}

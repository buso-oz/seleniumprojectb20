package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        //1- set up the web driver
        WebDriverManager.chromedriver().setup();
        //System.setProperty("driver.type","path to the driver");
       //System.setProperty("webdriver.chrome.driver","path to the driver");


        //2- create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();  // THIS LINE IS OPENING ME BROWSER

        driver.manage().window().maximize();

        //3- test if driver is working
        driver.get("https://www.google.com");

        //System.out.println("The title of the page is: "+ driver.getTitle());

        String actualTitle = driver.getTitle();
        System.out.println("ACTUAL TITLE STRING: " + actualTitle);

        String actualUrl = driver.getCurrentUrl();

        System.out.println("actualUrl = " + actualUrl);

        Thread.sleep(1000);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com");
        //Thread.sleep(3000);
        //driver.navigate().to("https://www.instagram.com");
        //Thread.sleep(3000);
        //driver.navigate().to("https://www.youtube.com");
        //Thread.sleep(3000);
        //driver.navigate().to("https://www.amazon.com");
        //Thread.sleep(3000);

        String pageSource = driver.getPageSource();

        System.out.println("pageSource = " + pageSource);

        driver.close();






    }
}

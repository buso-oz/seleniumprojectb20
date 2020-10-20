package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation2 {

    public static void main(String[] args) throws InterruptedException {
        //to setup chrome driver
        WebDriverManager.chromedriver().setup();

        //to create an object of chromedriver class
        ChromeDriver driver = new ChromeDriver();
        String url = "http://google.com";
        String url2 = "http://amazon.com";

        //will open browser with URL
        driver.get(url);

        //will put on hold current run on 3 seconds
        Thread.sleep(3000);

        //navigate to Amazon.com
        driver.navigate().to(url2);

        //wait for 3 seconds
        Thread.sleep(3000);

        //will navigate back to the previous url
        //in our case it's a google.com
        driver.navigate().back();




        //wait for 3 seconds
        Thread.sleep(3000);

        //goes forward
        driver.navigate().forward();

        //wait for 3 seconds
        Thread.sleep(3000);

        //will refresh the page
        driver.navigate().refresh();

        //wait for 3 seconds
        Thread.sleep(3000);

        //will close web browser
        driver.close();




    }
}

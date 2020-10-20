package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_FindElements_Practice1 {
    public static void main(String[] args) {
        //TC #0: FINDELEMENTS
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // 3.Print out the texts of all links
        //shortcut is option + enter for mac
        List<WebElement> ListOfLinks = driver.findElements(By.xpath("//body//a"));


        //Looping through the list of webelements we just creted above
        for(WebElement eachLink : ListOfLinks){
            //Getting the text of each element in each oiiteration, and printing the values
            System.out.println(eachLink.getText());
        }

        // 4.Print out how many total link
        int numberOfLinks = ListOfLinks.size();

        System.out.println("numberOfLinks = "+numberOfLinks);
    }
}

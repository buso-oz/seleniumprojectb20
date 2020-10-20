package com.cybertek.projects;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Bitrix {



    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//put the link
        driver.get("https://login2.nextbasecrm.com");
//put user name
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk27@cybertekschool.com");
        BrowserUtils.wait(2);
//put password
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        BrowserUtils.wait(2);
//click the button - Log in
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        BrowserUtils.wait(2);
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test
    public void ARecent() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//click Activity Stream
        driver.findElement(By.xpath("(//span[@class='menu-item-link-text'])[12]")).click();
        //driver.findElement(By.linkText("Activity Stream")).click();
        BrowserUtils.wait(2);
//click to the Message
        driver.findElement(By.id("feed-add-post-form-tab-message")).click();
        BrowserUtils.wait(2);
//delete to all employees
        WebElement DeleteAllEmployees = driver.findElement(By.xpath("//span[@class='feed-add-post-del-but']"));
        DeleteAllEmployees.click();
        BrowserUtils.wait(2);
//click Add more
        driver.findElement(By.id("bx-destination-tag")).click();
        BrowserUtils.wait(2);
//click to the address (from Recent)
        WebElement RecentAddress = driver.findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[2]"));
        RecentAddress.click();
        BrowserUtils.wait(2);
//find Web element which was added to the sending list "To" from RECENT
        WebElement AddedAddressFromResent = driver.findElement(By.xpath("//span[@class='feed-add-post-destination-text']"));
        Assert.assertEquals(RecentAddress.getText(), AddedAddressFromResent.getText());
    }
    @Test
    public void BEmployeesAndDepartments(){
//click Activity Stream
        driver.findElement(By.xpath("(//span[@class='menu-item-link-text'])[12]")).click();
        //driver.findElement(By.linkText("Activity Stream")).click();
        BrowserUtils.wait(2);
//click to the Message
        driver.findElement(By.id("feed-add-post-form-tab-message")).click();
        BrowserUtils.wait(2);
//delete to all employees
        WebElement DeleteAllEmployees = driver.findElement(By.xpath("//span[@class='feed-add-post-del-but']"));
        DeleteAllEmployees.click();
        BrowserUtils.wait(2);
//click Add more
        driver.findElement(By.id("bx-destination-tag")).click();
        BrowserUtils.wait(2);
//click to the EmployeesAndDepartments
        WebElement EmployeesAndDepartments = driver.findElement(By.xpath("//a[.='Employees and departments']"));
        EmployeesAndDepartments.click();
        BrowserUtils.wait(2);
        //click to the e-mail from EmployeesAndDepartments list
        // WebElement EmployeeAddress =  driver.findElement(By.linkText("helpdesk23@cybertekschool.com"));
        //  EmployeeAddress.click();
        WebElement EmployeeAddress =  driver.findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name']"));
        EmployeeAddress.click();
        BrowserUtils.wait(2);
//find Web element which was added to the sending list "To" from EmployeesAndDepartments
        WebElement AddedAddressFromEmployeesAndDepartments = driver.findElement(By.xpath("//span[@class='feed-add-post-destination-text']"));
        //span[@class='feed-add-post-destination-text']
        //Assert
        Assert.assertEquals(EmployeeAddress.getText().trim(), AddedAddressFromEmployeesAndDepartments.getText().trim());
    }
    @Test
    public void CEmailUsers(){
//click Activity Stream
        driver.findElement(By.xpath("(//span[@class='menu-item-link-text'])[12]")).click();
        //driver.findElement(By.linkText("Activity Stream")).click();
        BrowserUtils.wait(2);
//click to the Message
        driver.findElement(By.id("feed-add-post-form-tab-message")).click();
        BrowserUtils.wait(2);
//delete to all employees
        WebElement DeleteAllEmployees = driver.findElement(By.xpath("//span[@class='feed-add-post-del-but']"));
        DeleteAllEmployees.click();
        BrowserUtils.wait(2);
//click Add more
        driver.findElement(By.id("bx-destination-tag")).click();
        BrowserUtils.wait(2);
        //click to e-mail
        WebElement EmailUsers = driver.findElement(By.xpath("//a[.='E-mail users']"));
        EmailUsers.click();
        BrowserUtils.wait(2);
//Enter any valid email in a field
        WebElement ValidEmail = driver.findElement(By.id("feed-add-post-destination-input"));
        ValidEmail.sendKeys("helpdesk26@cybertekschool.com"+ Keys.ENTER);
        BrowserUtils.wait(2);
//check if element is displayed inside a field "To"
        WebElement EnteredValidEmail = driver.findElement(By.xpath("//span[@class='feed-add-post-destination-text']"));
        EnteredValidEmail.isDisplayed();
    }




    @Test
    public void taskTab_VisualEditor(){
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys("marketing27@cybertekschool.com");
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");

        Driver.getDriver().findElement(By.className("login-btn")).click();

        BrowserUtils.wait(2);
        Driver.getDriver().findElement(By.id("feed-add-post-form-tab-tasks")).click();

        BrowserUtils.wait(3);
        Driver.getDriver().findElement(By.id("lhe_button_editor_task-form-lifefeed_task_form")).click();


    }
    @Test
    public void user_able_to_create_a_quote() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement dropdownMenu = driver.findElement(By.xpath("//div[@id='sitemap-menu']"));
        dropdownMenu.click();
        WebElement ActivityStream = driver.findElement(By.xpath("//a[.='Activity Stream']"));
        ActivityStream.click();
        WebElement taskBar = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskBar.click();
        WebElement createQuoteButton = driver.findElement(By.xpath("//span[@id='bx-b-quote-task-form-lifefeed_task_form']"));
        createQuoteButton.click();

    }

    @Test
    public void User_able_to_create_a_deadline () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement dropdownMenu = driver.findElement(By.xpath("//div[@id='sitemap-menu']"));
        dropdownMenu.click();
        WebElement ActivityStream = driver.findElement(By.xpath("//a[.='Activity Stream']"));
        ActivityStream.click();
        WebElement taskBar = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskBar.click();
        WebElement dataPickersDeadline = driver.findElement(By.xpath("//input[@class='task-options-inp']"));
        dataPickersDeadline.click();
        Thread.sleep(2000);
        WebElement clickSelectButton = driver.findElement(By.xpath("//span[.='Select']"));
        clickSelectButton.click();
    }

    /*
User Story#2:
As a user, I should be able to assign tasks by clicking on Task tab under Active Stream.
AC#1: 1.User should be able to click on "High Priority" checkbox to set the current task to a top priority task.
 */
    @Test
    public void Test_US2_AC1() throws InterruptedException {
        Thread.sleep(2000);
        WebElement menuButton = driver.findElement(By.cssSelector(".sitemap-menu-lines"));
        menuButton.click();
        Thread.sleep(2000);
        WebElement activityStreamButton = driver.findElement(By.cssSelector(".sitemap-section-item"));
        activityStreamButton.click();
        Thread.sleep(2000);
        WebElement taskButton = driver.findElement(By.id("feed-add-post-form-tab-tasks"));
        taskButton.click();
        Thread.sleep(2000);
        WebElement highPriority = driver.findElement(By.cssSelector("#tasks-task-priority-cb"));
        highPriority.click();
    }
    /*
    User Story#2:
    As a user, I should be able to assign tasks by clicking on Task tab under Active Stream.
    AC#1: 10. User can click on More to specify the task details.
     */
    @Test
    public void Test_US2_AC10() throws InterruptedException {
        Thread.sleep(2000);
        WebElement menuButton = driver.findElement(By.cssSelector(".sitemap-menu-lines"));
        menuButton.click();
        Thread.sleep(2000);
        WebElement activityStreamButton = driver.findElement(By.cssSelector(".sitemap-section-item"));
        activityStreamButton.click();
        Thread.sleep(2000);
        WebElement taskButton = driver.findElement(By.id("feed-add-post-form-tab-tasks"));
        taskButton.click();
        Thread.sleep(2000);
        WebElement clickMore = driver.findElement(By.cssSelector("#feed-add-post-form-link-text"));
        clickMore.click();
    }




}

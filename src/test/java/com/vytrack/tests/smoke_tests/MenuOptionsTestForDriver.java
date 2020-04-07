package com.vytrack.tests.smoke_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class MenuOptionsTestForDriver extends TestBase {

    @Test
    public void test(){
        //STEP - 1
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));

        //STEP - 2
        dashboardPage.changeMenu("Fleet", "Vehicles");

        //verify title
        String expectedTitle = "Car - Entities - System - Car - Entities - System";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        String expectedPageName = "Cars";
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 3
        dashboardPage.changeMenu("Customers", "Accounts");

        //verify title
        expectedTitle = "Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "Accounts";
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 4
        dashboardPage.changeMenu("Customers", "Contacts");

        //verify title
        expectedTitle = "Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "Contacts";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 5
        dashboardPage.changeMenu("Activities", "Calendar Events");

        //verify title
        expectedTitle = "Calendar Events - Activities";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "Calendar Events";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

    }


    //BELOW IS THE CODE WE HAD BEFORE I MADE CHANGES
    /*
    Actions actions;
    @Test
    public void test() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(ConfigurationReader.getProperty("url"));
        driver.findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("username"));
        driver.findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("password"));
        driver.findElement(By.id("_submit")).click();

        //navigate to fleet module
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();

        WebElement vehicle = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        vehicle.click();

        //verify page title
        String expectedTitle = "Car - Entities - System - Car - Entities - System";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        String expectedName = "Cars";

        Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText(), expectedName);


        WebElement customers = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        actions = new Actions(driver);
        actions.moveToElement(customers).pause(2000).perform();

        driver.findElement(By.linkText("Accounts")).click();

        String expected = "Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expected));
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);

        String expectedPageName = "Accounts";
        String actualPageName = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(expectedPageName, actualPageName);

        actions.moveToElement(customers).pause(2000).perform();
        driver.findElement(By.linkText("Contacts")).click();

        expected = "Contacts - Customers";
        wait.until(ExpectedConditions.titleIs(expected));
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);

        expectedPageName = "Contacts";
        actualPageName = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(expectedPageName, actualPageName);

        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
        actions.moveToElement(activities).pause(2000).perform();

        driver.findElement(By.linkText("Calendar Events")).click();

        expectedTitle = "Calendar Events - Activities";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertEquals(driver.getTitle(), expectedTitle);

        expectedPageName = "Calendar Events";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[@class='oro-subtitle']"))));
        actualPageName = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(expectedPageName, actualPageName);
    }*/
}

package com.vytrack.tests.smoke_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MenuOptionsTestForStoreManager extends TestBase {

    //Driver
    @Test
    public void test(){
        //STEP - 1
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));

        //STEP - 2
        dashboardPage.changeMenu("Dashboards", "Dashboard");

        //verify title
        String expectedTitle = "Dashboard - Dashboards";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        String expectedPageName = "Dashboard";
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 3
        dashboardPage.changeMenu("Fleet", "Vehicles");

        //verify title
        expectedTitle = "Car - Entities - System - Car - Entities - System";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Cars";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 4
        dashboardPage.changeMenu("Customers", "Accounts");

        //verify title
        expectedTitle = "All - Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Accounts";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 5
        dashboardPage.changeMenu("Customers", "Contacts");

        //verify title
        expectedTitle = "All - Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Contacts";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 6
        dashboardPage.changeMenu("Sales", "Opportunities");

        //verify title
        expectedTitle = "Open Opportunities - Opportunities - Sales";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "Open Opportunities";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 7
        dashboardPage.changeMenu("Activities", "Calls");

        //verify title
        expectedTitle = "All - Calls - Activities";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Calls";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 8
        dashboardPage.changeMenu("Activities", "Calendar Events");

        //verify title
        expectedTitle = "All - Calendar Events - Activities"; //homework assignment has a typo in this step
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Calendar Events";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

    }

    //BELOW IS THE CODE WE HAD BEFORE I MADE CHANGES
    /*Actions actions;

    @Test
    public void test() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
        driver.get(ConfigurationReader.getProperty("url"));
        driver.findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        driver.findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        driver.findElement(By.id("_submit")).click();

        wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"))));
        WebElement dashboard = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        actions.moveToElement(dashboard).pause(2000).perform();

        driver.findElement(By.linkText("Dashboard")).click();

        String expected = "Dashboard - Dashboards";
        wait.until(ExpectedConditions.titleIs(expected));
        Assert.assertEquals(driver.getTitle(), expected);

        expected = "Dashboard";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[@class='oro-subtitle']"))));
        Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText(), expected);

        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        actions.moveToElement(fleet).pause(2000).perform();

        WebElement vehicle = driver.findElement(By.linkText("Vehicles"));
        vehicle.click();

          expected = "All - Car - Entities - System - Car - Entities - System";
            wait.until(ExpectedConditions.titleIs(expected));
            Assert.assertEquals(driver.getTitle(), expected);

        WebElement customers = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
        actions.moveToElement(customers).pause(2000).perform();
        driver.findElement(By.linkText("Accounts")).click();

        expected ="All - Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expected));
        Assert.assertEquals(driver.getTitle(), expected);

        expected = "All Accounts";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[@class='oro-subtitle']"))));
        Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText(), expected);

        actions.moveToElement(customers).pause(2000).perform();
        driver.findElement(By.linkText("Contacts")).click();

        expected ="All - Contacts - Customers";
        wait.until(ExpectedConditions.titleIs(expected));
        Assert.assertEquals(driver.getTitle(), expected);

        expected = "All Contacts";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[@class='oro-subtitle']"))));
        Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText(), expected);

        //stopped at test case 2, before step 6
    }

     */
}

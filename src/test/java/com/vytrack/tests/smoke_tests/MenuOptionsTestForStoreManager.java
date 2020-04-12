package com.vytrack.tests.smoke_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MenuOptionsTestForStoreManager extends TestBase {

    //Driver
    @Test
    public void test(){
        //STEP - 1
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));

        //STEP - 2
        dashboardPage.navigateMenu("Dashboards", "Dashboard");

        //verify title
        String expectedTitle = "Dashboard - Dashboards";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        String expectedPageName = "Dashboard";
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 3
        dashboardPage.navigateMenu("Fleet", "Vehicles");

        //verify title
        expectedTitle = "Car - Entities - System - Car - Entities - System";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Cars";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 4
        dashboardPage.navigateMenu("Customers", "Accounts");

        //verify title
        expectedTitle = "All - Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Accounts";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 5
        dashboardPage.navigateMenu("Customers", "Contacts");

        //verify title
        expectedTitle = "All - Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Contacts";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 6
        dashboardPage.navigateMenu("Sales", "Opportunities");

        //verify title
        expectedTitle = "Open Opportunities - Opportunities - Sales";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "Open Opportunities";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 7
        dashboardPage.navigateMenu("Activities", "Calls");

        //verify title
        expectedTitle = "All - Calls - Activities";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Calls";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 8
        dashboardPage.navigateMenu("Activities", "Calendar Events");

        //verify title
        expectedTitle = "All - Calendar Events - Activities"; //homework assignment has a typo in this step
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "All Calendar Events";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

    }
}

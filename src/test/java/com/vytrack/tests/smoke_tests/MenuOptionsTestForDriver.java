package com.vytrack.tests.smoke_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class MenuOptionsTestForDriver extends TestBase {

    @Test
    public void test(){
        //STEP - 1
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));

        //STEP - 2
        dashboardPage.navigateMenu("Fleet", "Vehicles");

        //verify title
        String expectedTitle = "Car - Entities - System - Car - Entities - System";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        String expectedPageName = "Cars";
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 3
        dashboardPage.navigateMenu("Customers", "Accounts");

        //verify title
        expectedTitle = "Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "Accounts";
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 4
        dashboardPage.navigateMenu("Customers", "Contacts");

        //verify title
        expectedTitle = "Accounts - Customers";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "Contacts";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

        //STEP - 5
        dashboardPage.navigateMenu("Activities", "Calendar Events");

        //verify title
        expectedTitle = "Calendar Events - Activities";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        assertEquals(driver.getTitle(), expectedTitle);

        //verify page name
        expectedPageName = "Calendar Events";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, expectedPageName));
        assertEquals(dashboardPage.pageName.getText(), expectedPageName);

    }
}

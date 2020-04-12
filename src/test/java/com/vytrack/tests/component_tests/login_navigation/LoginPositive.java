package com.vytrack.tests.component_tests.login_navigation;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPositive extends TestBase {

    @Test
    public void loginPositive() throws Exception{

        //Login as a store manager
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));

        //Verify store manager name
        String stManName = "Effie Stracke";
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.accountHolderName));
        Assert.assertEquals(dashboardPage.accountHolderName.getText().trim(), stManName);

        //Verify page name
        String pageName = "Dashboard";
        Assert.assertEquals(dashboardPage.pageName.getText(), pageName);

        //Logout
        logout();

        //Login as a sales manager
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));

        //Verify page name
        Assert.assertEquals(dashboardPage.pageName.getText(), pageName);

        //Verify sales manager name
        String salManName = "Easton Mante";
        Assert.assertEquals(dashboardPage.accountHolderName.getText().trim(), salManName);

        //Logout
        logout();

        //Login as a driver
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));

        //Verify driver name
        String driverName = "Alexie Larson";
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.accountHolderName));
        Assert.assertEquals(dashboardPage.accountHolderName.getText().trim(), driverName);

        //Verify page header
        String pageHeader = "Quick Launchpad";
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.pageHeader));
        Assert.assertEquals(dashboardPage.pageHeader.getText(), pageHeader);


    }
    public void logout()throws Exception{
        dashboardPage.accountHolderDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.logout));
        Thread.sleep(2000);
        dashboardPage.logout.click();
    }
}

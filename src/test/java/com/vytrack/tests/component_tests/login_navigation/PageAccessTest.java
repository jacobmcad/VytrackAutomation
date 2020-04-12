package com.vytrack.tests.component_tests.login_navigation;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageAccessTest extends TestBase {

    @Test(priority = 1, testName = "Store Manager")
    public void vehicleContractsStore() throws Exception{

        //Login as a store manager
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));

        //Navigate to Vehicle Contracts
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.fleet));
        dashboardPage.navigateMenu("Fleet", "Vehicle Contracts");

        //Verify the access to Vehicle Contracts
        String header = "All Vehicle Contract";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName,header));
        Assert.assertEquals(dashboardPage.pageName.getText(), header);

    }

    @Test(priority = 2, testName = "Sales Manager")
    public void vehicleContractsSales() throws Exception{

        //Login as a sales manager
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));

        //Navigate to Vehicle Contracts
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.fleet));
        dashboardPage.navigateMenu("Fleet", "Vehicle Contracts");

        //Verify the access to Vehicle Contracts
        String header = "All Vehicle Contract";
        wait.until(ExpectedConditions.textToBePresentInElement(dashboardPage.pageName, header));
        Assert.assertEquals(dashboardPage.pageName.getText(), header);

    }

    @Test(priority = 3, testName = "Driver")
    public void vehicleContractDriver() throws Exception{

        //Login as a driver


    }

}

package com.vytrack.tests.component_tests.login_navigation;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegative extends TestBase {

    @Test
    public void loginNegative() throws Exception{

        //Login with an invalid password
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("invalidPassword!"));

        //Error message
        String err = "Invalid user name or password.";
        Assert.assertTrue(loginPage.errorMessage.isDisplayed() && err.equals(err));

        //Page title and url
        Assert.assertEquals(driver.getTitle(), ConfigurationReader.getProperty("url").contains("login"));
    }

}

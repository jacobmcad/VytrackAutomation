package com.vytrack.pages;

import com.vytrack.base.TestBase;
import com.vytrack.base.VytrackPageBase;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends VytrackPageBase {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

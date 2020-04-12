package com.vytrack.pages;

import com.vytrack.base.VytrackPageBase;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends VytrackPageBase {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

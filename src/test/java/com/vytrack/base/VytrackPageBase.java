package com.vytrack.base;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class VytrackPageBase {

    public VytrackPageBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader;

    @FindBy(xpath = "//span[contains(text(), 'Fleet')][@class='title title-level-1']")
    public WebElement fleet;

    @FindBy(xpath = "//span[.='Vehicles'][@class='title title-level-2']")
    public WebElement vehicles;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement accountHolderName;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement accountHolderDropdown;

    @FindBy(css = ".title-level-1")
    public List<WebElement> menu1Options;

    @FindBy (xpath = "//h1[@class='oro-subtitle']")
    public  WebElement pageName;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/ul/li[5]/a")
    public WebElement logout;


    public void navigateMenu(String menu1, String menu2) {
        String menu1xpath = "//span[contains(text(), '"+menu1+"')][@class='title title-level-1']";
        WebElement menu1Element = Driver.getDriver().findElement(By.xpath(menu1xpath));

        String menu2xpath = "//span[.='"+menu2+"'][@class='title title-level-2']";
        WebElement menu2Element = Driver.getDriver().findElement(By.xpath(menu2xpath));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

        wait.until(ExpectedConditions.elementToBeClickable(menu1Element));
        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        menu1Element.click();
        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(menu2Element));
        menu2Element.click();
    }
}

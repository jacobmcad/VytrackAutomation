package com.vytrack.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /**
     * this method takes a list of WebElements and returns a List of String
     */
    public static List<String> getElementsText(List <WebElement> listElements){
        //given a list of webElement, extract the text of the elements into a new list of string
        List<String> listString = new ArrayList<>();
        for (WebElement  eachElement : listElements){
            listString.add(eachElement.getText().trim());
        }
        return listString;
    }
}

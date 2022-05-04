package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {
    By saleTxt = By.xpath("//h1[@id='page-title']");
    By sortByDropBox = By.xpath("//div[@class='sort-box']");
    By aToZOption = By.linkText("Name A - Z");
    By lowToHighOption = By.linkText("Price Low - High");
    By arrangedByRatesOption = By.linkText("Rates");
    By aToZText = By.xpath("//span[contains(text(),'Name A - Z')]");
    By lowToHighText = By.xpath("//span[contains(text(),'Price Low - High')]");
    By arrangedByRatesText = By.xpath("//span[contains(text(),'Rates')]");



    public String getSaleText() {
        return getTextFromElement(saleTxt);
    }

    public void hoverOnDropBox() {
        mouseHoverToElement(sortByDropBox);
    }

    public void hoverAndClickOnAToZ() {
        mouseHoverToElementAndClick(aToZOption);
    }

    public String getAtoZText(){
        return getTextFromElement(aToZText);
    }

    public void hoverAndClickOnLowToHigh() {
        mouseHoverToElementAndClick(lowToHighOption);
    }

    public String getLowToHighText(){
        return getTextFromElement(lowToHighText);
    }

    public void hoverAndClickOnArrangedByRates() {
        mouseHoverToElementAndClick(arrangedByRatesOption);
    }

    public String getArrangedByRatesText(){
        return getTextFromElement(arrangedByRatesText);
    }
}



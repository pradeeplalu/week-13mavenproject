package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellersPage extends Utility {
    By bestsellersTxt = By.xpath("//h1[@id='page-title']");
    By sortByDropBox = By.xpath("//div[@class='sort-box']");
    By zToAOption = By.linkText("Name Z - A");
    By highToLowOption = By.linkText("Price High - Low");
    By arrangedByRatesOption = By.linkText("Rates");
    By zToAText = By.xpath("//span[contains(text(),'Name Z - A')]");
    By highToLowText = By.xpath("//span[contains(text(),'Price High - Low')]");
    By arrangedByRatesText = By.xpath("//span[contains(text(),'Rates')]");
    By aToZOption = By.linkText("Name A - Z");
    By product = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']" +
            "/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]");
    By addToCartProduct = By.xpath("//ul[@class = 'products-grid grid-list']/li[8]/div/div[2]/div[4]/div/button");
    By addedToCartMessage = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By xButton = By.xpath("//div[@id='status-messages']/a");
    By yourCartButton = By.xpath("//div[@title='Your cart']");
    By viewCartButton = By.linkText("View cart");


    public String getBestsellersText(){
        return getTextFromElement(bestsellersTxt);
    }

    public void hoverOnDropBox(){
        mouseHoverToElement(sortByDropBox);
    }

    public void hoverAndClickOnZToA() {
        mouseHoverToElementAndClick(zToAOption);
    }

    public String getZtoAText(){
        return getTextFromElement(zToAText);
    }

    public void hoverAndClickOnHighToLow() {
        mouseHoverToElementAndClick(highToLowOption);
    }

    public String getHighToLowText(){
        return getTextFromElement(highToLowText);
    }

    public void hoverAndClickOnArrangedByRates() {
        mouseHoverToElementAndClick(arrangedByRatesOption);
    }

    public String getArrangedByRatesText(){
        return getTextFromElement(arrangedByRatesText);
    }

    public void hoverAndClickOnAToZ() {
        mouseHoverToElementAndClick(aToZOption);
    }

    public void hoverOnProduct(){
        mouseHoverToElement(product);
    }

    public void clickOnAddToCart(){
        mouseHoverToElementAndClick(addToCartProduct);
    }

    public String popUpCartMessage(){
        return getTextFromElement(addedToCartMessage);
    }

    public void clickOnXButton(){
        clickOnElement(xButton);
    }

    public void clickOnYourCartButton(){
        clickOnElement(yourCartButton);
    }

    public void clickOnViewCartButton(){
        clickOnElement(viewCartButton);
    }
}



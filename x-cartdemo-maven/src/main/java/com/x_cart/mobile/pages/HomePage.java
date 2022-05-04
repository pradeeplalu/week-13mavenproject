package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By hotDealsButton = By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span");
    By hotDealsSaleButton = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a");
    By hotDealsBestsellersButton = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span");
    By shippingButton = By.linkText("Shipping");
    By newButton = By.linkText("New!");
    By comingSoonButton = By.linkText("Coming soon");
    By contactUsButton = By.linkText("Contact us");



    public void hoverOnHotDealButton() {
        mouseHoverToElement(hotDealsButton);
    }

    public void hoverAndClickOnHotDealSaleButton() {
        mouseHoverToElementAndClick(hotDealsSaleButton);
    }

    public void hoverAndClickOnHotDealBestsellersButton() {
        mouseHoverToElementAndClick(hotDealsBestsellersButton);
    }

    public void clickShippingLink(){
        clickOnElement(shippingButton);
    }

    public void clickNewLink(){
        clickOnElement(newButton);
    }

    public void clickComingSoonLink(){
        clickOnElement(comingSoonButton);
    }

    public void clickContactUsLink(){
        clickOnElement(contactUsButton);
    }
}





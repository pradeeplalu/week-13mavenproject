package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    By yourShoppingCartText = By.id("page-title");
    By subtotalText = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']" +
            "/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]" +
            "/div[1]/div[1]/ul[1]/li[1]/span[1]/span[1]/span[1]");
    By totalText = By.xpath("//li/span/span[@class='surcharge-cell']");
    By checkoutButton = By.xpath("//span[text()='Go to checkout']");
    By emptyYourCartButton = By.xpath("//a[contains(text(),'Empty your cart')]");
    By yourItemsDeletedText = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By yourCartIsEmptyText = By.xpath("//h1[contains(text(),'Your cart is empty')]");



    public String getYourShoppingCartText(){
        return getTextFromElement(yourShoppingCartText);
    }

    public String getSubtotalAmount(){
        return getTextFromElement(subtotalText);
    }

    public String getTotalAmount(){
        return getTextFromElement(totalText);
    }

    public void clickCheckoutButton(){
        clickOnElement(checkoutButton);
    }

    public void clickEmptyYourCartButton(){
        clickOnElement(emptyYourCartButton);
    }

    public String getItemsDeletedText(){
        return getTextFromElement(yourItemsDeletedText);
    }

    public String getCartIsEmptyText(){
        return getTextFromElement(yourCartIsEmptyText);
    }
}



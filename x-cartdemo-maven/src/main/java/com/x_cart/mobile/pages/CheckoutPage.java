package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By secureCheckoutText = By.xpath("//h1[@class='title']");
    By firstNameField = By.id("shippingaddress-firstname");
    By lastNameField = By.id("shippingaddress-lastname");
    By streetField = By.id("shippingaddress-street");
    By countryField = By.id("shippingaddress-country-code");
    By stateField = By.id("shippingaddress-custom-state");
    By createAccount = By.id("create_profile");
    By passwordField = By.id("password");
    By localShippingOption = By.id("method128");
    By paymentOption = By.id("pmethod6");
    By totalAmount = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']" +
            "/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/" +
            "div[2]/div[1]/div[3]/span[2]/span[1]/span[1]");
    By placeOrderButton = By.xpath("//button[@type= 'submit']");



    public String getSecureCheckoutText(){
        return getTextFromElement(secureCheckoutText);
    }

    public void enterFirstNameField (String firstName){
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastNameField (String lastName){
        sendTextToElement(lastNameField, lastName);
    }

    public void enterStreetField (String street){
        sendTextToElement(streetField, street);
    }
    public void enterCountryField (){
        selectByValueFromDropDown(countryField,"FI");
    }

    public void enterStateField (String state){
        sendTextToElement(stateField, state);
    }

    public void checkCreateAccountButton(){
        clickOnElement(createAccount);
    }

    public void enterPassword (String password){
        sendTextToElement(passwordField, password);
    }

    public void clickLocalShippingButton(){
        clickOnElement(localShippingOption);
    }

    public void clickPaymentButton(){
        clickOnElement(paymentOption);
    }

    public String getTotalAmountText(){
        return getTextFromElement(totalAmount);
    }

    public void clickPlaceOrderButton(){
        clickOnElement(placeOrderButton);
    }
}



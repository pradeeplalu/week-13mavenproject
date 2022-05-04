package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By loginToYourAccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailField = By.id("email");
    By continueButton = By.xpath("//span[contains(text(),'Continue')]");



    public String getLoginToYourAccountText(){
        return getTextFromElement(loginToYourAccount);
    }

    public void enterEmailField (String email){
        sendTextToElement(emailField, email);
    }

    public void clickContinueButton(){
        clickOnElement(continueButton);
    }
}



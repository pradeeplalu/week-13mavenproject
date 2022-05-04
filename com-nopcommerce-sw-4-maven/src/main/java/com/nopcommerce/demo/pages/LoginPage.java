package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    By logoutButton = By.className("ico-logout");
    By logInSuccessfulMessage = By.xpath("//div[contains(text(),'Your registration completed')]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailID(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickLoginInButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void clickLogOutButton(){
        clickOnElement(logoutButton);
    }

    public String getSuccessfulLoginMessage(){
        return getTextFromElement(logInSuccessfulMessage);
    }
}



package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.id("login-button");

    public void enterUsername(String userName){
        sendTextToElement(usernameField, userName);
    }


    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }


    public void clickOnLoginLink() {
        clickOnElement(loginButton);
    }

}

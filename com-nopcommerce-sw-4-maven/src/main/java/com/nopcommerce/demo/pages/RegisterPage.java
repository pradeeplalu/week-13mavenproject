package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registertext = By.className("ico-register");
    By radioBtn = By.id("gender-male");
    By firstNameField = By.name("FirstName");
    By lastNameField = By.name("LastName");
    By dayDropDwn = By.xpath("//select[@name='DateOfBirthDay']");
    By monthDropDwn = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearDropDwn = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyField = By.name("Company");
    By newsletterCheck = By.cssSelector("#Newsletter");
    By passwordfield = By.name("Password");
    By confirmPasswordfield = By.name("ConfirmPassword");
    By registerBtn = By.name("register-button");

    public String getRegisterText() {
        return getTextFromElement(registertext);
    }

    public void clickRadioBtn() {
        clickOnElement(radioBtn);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
    }

    public void selectdayDropDwn() {
        selectByValueFromDropDown(dayDropDwn, "22");
    }

    public void selectmonthDropDwn() {
        selectByValueFromDropDown(monthDropDwn, "9");
    }

    public void selectyearDropDwn(){
        selectByValueFromDropDown(yearDropDwn, "1994");
    }

    public void enterEmailField(String email){
        sendTextToElement(emailField, email);
    }

    public void enterCompanyField(String company){
        sendTextToElement(companyField, company);
    }

    public void clickNewsletterCheck(){
        clickOnElement(newsletterCheck);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordfield, password);
    }

    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordfield, confirmPassword);
    }

    public void clickRegisterButton(){
        clickOnElement(registerBtn);
    }
}





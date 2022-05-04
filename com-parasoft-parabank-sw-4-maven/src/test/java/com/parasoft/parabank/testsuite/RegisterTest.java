package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.AccountsPreviewPage;
import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    AccountsPreviewPage accountsPreviewPage = new AccountsPreviewPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePage.clickOnRegisterLink();
        String expectedMessage = "Signing up is easy!";
        String actualMessage = registerPage.getSignInText();
        Assert.assertEquals( expectedMessage, actualMessage,"Text does not match expected text");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("Christy");
        registerPage.enterLastName("Speed");
        registerPage.enterAddress("116 Rochford Lane");
        registerPage.enterCity("London");
        registerPage.enterState("London");
        registerPage.enterZipCode("TW1618A");
        registerPage.enterPhoneNo("07956 875475");
        registerPage.enterSSNNo("1234567891");
        registerPage.enterUsername("Chrispeeds768");
        registerPage.enterPassword("Chrispeeds12345");
        registerPage.enterConfirmPassword("Chrispeeds12345");
        registerPage.clickRegisterButton();
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        String actualMessage = accountsPreviewPage.getsuccessfulSignUpMessage();
        Assert.assertEquals( expectedMessage, actualMessage,"Text does not match expected text");
    }
}




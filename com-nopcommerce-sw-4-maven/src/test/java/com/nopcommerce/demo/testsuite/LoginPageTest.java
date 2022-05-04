package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login Page not displayed");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailID("prime123@gmail.com");
        loginPage.enterPassword("Prime123");
        loginPage.clickLoginInButton();
        String expectedMessage = "";
        String actualMessage = "";
        Assert.assertEquals(expectedMessage, actualMessage, "User has not logged in successfully");
    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailID("chris12358@gmail.com");
        loginPage.enterPassword("Redspieces");
        loginPage.clickLoginInButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }

}



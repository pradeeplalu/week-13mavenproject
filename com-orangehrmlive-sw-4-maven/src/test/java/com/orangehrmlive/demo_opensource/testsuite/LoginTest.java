package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.pages.WelcomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    WelcomePage welcomePage = new WelcomePage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.enterUserName("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLoginButton();
        String expectedResult = "Welcome";
        String actualResult = welcomePage.verifyWelcomeText();
        Assert.assertEquals(expectedResult, actualResult, "Welcome page not found:error");


    }
}



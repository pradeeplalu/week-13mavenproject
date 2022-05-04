package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterText();
        Assert.assertEquals(expectedMessage, actualMessage, "Register Page not displayed");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.clickRadioBtn();
        registerPage.enterFirstName("Chris");
        registerPage.enterLastName("Mark");
        registerPage.selectdayDropDwn();
        registerPage.selectmonthDropDwn();
        registerPage.selectyearDropDwn();
        registerPage.enterEmailField("stuartlittle@gmail.com");
        registerPage.enterCompanyField("Prime");
        registerPage.enterPassword("Prime123");
        registerPage.enterConfirmPassword("Prime123");
        registerPage.clickRegisterButton();
    }
}

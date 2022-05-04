package com.saucedemo.www.testsuite;


import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.pages.ProductPage;
import com.saucedemo.www.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    ProductPage productsPage = new ProductPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginLink();
        String expectedMessage = "PRODUCTS";
        String actualMessage = productsPage.getProductsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Products Page not displayed");
    }
}








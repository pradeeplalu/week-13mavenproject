package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends Utility {
    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewPage newPage = new NewPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        homePage.clickShippingLink();
        String expectedMessage = "Shipping";
        String actualMessage = shippingPage.getShippingText();
        Assert.assertEquals(expectedMessage, actualMessage, "Shipping page not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        homePage.clickNewLink();
        String expectedMessage = "New arrivals";
        String actualMessage = newPage.getNewText();
        Assert.assertEquals(expectedMessage, actualMessage, "New arrivals page not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() {
        homePage.clickComingSoonLink();
        String expectedMessage = "Coming soon";
        String actualMessage = comingSoonPage.getComingSoonText();
        Assert.assertEquals(expectedMessage, actualMessage, "Coming Soon page not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        homePage.clickContactUsLink();
        String expectedMessage = "Contact us";
        String actualMessage = contactUsPage.getContactUsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Contact Us page not displayed");
    }
}



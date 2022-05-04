package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellersPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    SalePage salePage = new SalePage();
    BestSellersPage bestsellersPage = new BestSellersPage();


    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        homePage.hoverOnHotDealButton();
        homePage.hoverAndClickOnHotDealSaleButton();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        salePage.hoverOnDropBox();
        salePage.hoverAndClickOnAToZ();
        String expectedMessage1 = "Name A - Z";
        String actualMessage1 = salePage.getAtoZText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Error has occurred --->  Test failed :");
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        homePage.hoverOnHotDealButton();
        homePage.hoverAndClickOnHotDealSaleButton();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        salePage.hoverOnDropBox();
        salePage.hoverAndClickOnLowToHigh();
        String expectedMessage1 = "Price Low - High";
        String actualMessage1 = salePage.getLowToHighText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Error has occurred --->  Test failed :");
    }

    @Test
    public void verifySaleProductsArrangeByRates() {
        homePage.hoverOnHotDealButton();
        homePage.hoverAndClickOnHotDealSaleButton();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        salePage.hoverOnDropBox();
        salePage.hoverAndClickOnArrangedByRates();
        String expectedMessage1 = "Rates";
        String actualMessage1 = salePage.getArrangedByRatesText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Error has occurred --->  Test failed :");
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        homePage.hoverOnHotDealButton();
        homePage.hoverAndClickOnHotDealBestsellersButton();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.getBestsellersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Bestsellers page not displayed");
        bestsellersPage.hoverOnDropBox();
        bestsellersPage.hoverAndClickOnZToA();
        String expectedMessage1 = "Name Z - A";
        String actualMessage1 = bestsellersPage.getZtoAText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Error has occurred --->  Test failed :");

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        homePage.hoverOnHotDealButton();
        homePage.hoverAndClickOnHotDealBestsellersButton();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.getBestsellersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Bestsellers page not displayed");
        bestsellersPage.hoverOnDropBox();
        bestsellersPage.hoverAndClickOnHighToLow();
        String expectedMessage1 = "Price High - Low";
        String actualMessage1 = bestsellersPage.getHighToLowText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Error has occurred --->  Test failed :");
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() {
        homePage.hoverOnHotDealButton();
        homePage.hoverAndClickOnHotDealBestsellersButton();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.getBestsellersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Bestsellers page not displayed");
        bestsellersPage.hoverOnDropBox();
        bestsellersPage.hoverAndClickOnArrangedByRates();
        String expectedMessage1 = "Rates";
        String actualMessage1 = bestsellersPage.getArrangedByRatesText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Error has occurred --->  Test failed :");
    }
}
    


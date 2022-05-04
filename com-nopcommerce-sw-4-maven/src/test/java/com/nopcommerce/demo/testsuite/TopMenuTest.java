package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.nopcommerce.demo.testbase.TestBase;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        homePage.clickComputerTab();
        String expectedMessage = "Computers";
        String actualMessage = homePage.getComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Computer page not displayed");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homePage.clickElectronicsTab();
        String expectedMessage = "Electronics";
        String actualMessage = homePage.getElectronicsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Electronics page not displayed");
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homePage.clickApparelTab();
        String expectedMessage = "Apparel";
        String actualMessage = homePage.getApparelText();
        Assert.assertEquals(expectedMessage, actualMessage, "Apparel page not displayed");
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homePage.clickDigitalDownloadsTab();
        String expectedMessage = "Digital downloads";
        String actualMessage = homePage.getDigitalDownloadsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Digital downloads page not displayed");
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickBooksTab();
        String expectedMessage = "Books";
        String actualMessage = homePage.getBooksText();
        Assert.assertEquals(expectedMessage, actualMessage, "Books page not displayed");
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickJewelryTab();
        String expectedMessage = "Jewelry";
        String actualMessage = homePage.getJewelryText();
        Assert.assertEquals(expectedMessage, actualMessage, "Jewelry page not displayed");
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.clickGiftCardTab();
        String expectedMessage = "Gift Cards";
        String actualMessage = homePage.getGiftCardsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Gift Cards page not displayed");
    }

}



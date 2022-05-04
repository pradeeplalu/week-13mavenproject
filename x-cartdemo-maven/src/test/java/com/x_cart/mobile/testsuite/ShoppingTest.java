package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends Utility {
    HomePage homePage = new HomePage();
    BestSellersPage bestsellersPage = new BestSellersPage();
    CartPage cartPage = new CartPage();
    SignInPage signInPage = new SignInPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    PaymentConfirmationPag paymentConfirmationPage = new PaymentConfirmationPag();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForGhostBustersVinylIdols(){
        homePage.hoverOnHotDealButton();
        homePage.hoverAndClickOnHotDealBestsellersButton();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.getBestsellersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Bestsellers page not displayed");
        bestsellersPage.hoverOnDropBox();
        bestsellersPage.hoverAndClickOnAToZ();
        waitUntilVisibilityOfElementLocated(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']" +
                "/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]"), 5);
        bestsellersPage.hoverOnProduct();
        bestsellersPage.clickOnAddToCart();
        String expectedMessage1 = "Product has been added to your cart";
        String actualMessage1 = bestsellersPage.popUpCartMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "An error has occurred.");
        bestsellersPage.clickOnXButton();
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@title='Your cart']"), 5);
        bestsellersPage.clickOnYourCartButton();
        waitUntilVisibilityOfElementLocated(By.linkText("View cart"), 5);
        bestsellersPage.clickOnViewCartButton();
        String expectedMessage2 = "Your shopping cart - 1 item";
        String actualMessage2 = cartPage.getYourShoppingCartText();
        Assert.assertEquals(expectedMessage2, actualMessage2, "An error has occurred.");
        String expectedMessage3 = "$19.99";
        String actualMessage3 = cartPage.getSubtotalAmount();
        Assert.assertEquals(expectedMessage3, actualMessage3, "An error has occurred.");
        String expectedMessage4 = "$25.84";
        String actualMessage4 = cartPage.getTotalAmount();
        Assert.assertEquals(expectedMessage4, actualMessage4, "An error has occurred.");
        cartPage.clickCheckoutButton();
        String expectedMessage5 = "Log in to your account";
        String actualMessage5 = signInPage.getLoginToYourAccountText();
        Assert.assertEquals(expectedMessage5, actualMessage5, "An error has occurred.");
        signInPage.enterEmailField("abc123465@gmail.com");
        signInPage.clickContinueButton();
        String expectedMessage6 = "Secure Checkout";
        String actualMessage6 = checkoutPage.getSecureCheckoutText();
        Assert.assertEquals(expectedMessage6, actualMessage6, "An error has occurred.");
        checkoutPage.enterFirstNameField("Prime");
        checkoutPage.enterLastNameField("Method");
        checkoutPage.enterStreetField("Spiderman");
        checkoutPage.enterCountryField();
        checkoutPage.enterStateField("Flounder");
        checkoutPage.checkCreateAccountButton();
        checkoutPage.enterPassword("DarthVader12389730234");
        checkoutPage.clickLocalShippingButton();
        checkoutPage.clickPaymentButton();
        waitUntilVisibilityOfElementLocated(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']" +
                "/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/" +
                "div[2]/div[1]/div[3]/span[2]/span[1]/span[1]"), 5);
        String expectedMessage7 = "$26.86";
        String actualMessage7 = checkoutPage.getTotalAmountText();
        Assert.assertEquals(expectedMessage7, actualMessage7, "An error has occurred.");
        checkoutPage.clickPlaceOrderButton();
        String expectedMessage8 = "Thank you for your order";
        String actualMessage8 = paymentConfirmationPage.getConfirmationText();
        Assert.assertEquals(expectedMessage8, actualMessage8, "An error has occurred.");
    }


    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully(){
        homePage.hoverOnHotDealButton();
        homePage.hoverAndClickOnHotDealBestsellersButton();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.getBestsellersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Bestsellers page not displayed");
        bestsellersPage.hoverOnDropBox();
        bestsellersPage.hoverAndClickOnAToZ();
        waitUntilVisibilityOfElementLocated(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']" +
                "/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]"), 5);
        bestsellersPage.hoverOnProduct();
        bestsellersPage.clickOnAddToCart();
        String expectedMessage1 = "Product has been added to your cart";
        String actualMessage1 = bestsellersPage.popUpCartMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "An error has occurred.");
        bestsellersPage.clickOnXButton();
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@title='Your cart']"), 5);
        bestsellersPage.clickOnYourCartButton();
        waitUntilVisibilityOfElementLocated(By.linkText("View cart"), 5);
        bestsellersPage.clickOnViewCartButton();
        String expectedMessage2 = "Your shopping cart - 1 item";
        String actualMessage2 = cartPage.getYourShoppingCartText();
        Assert.assertEquals(expectedMessage2, actualMessage2, "An error has occurred.");
        cartPage.clickEmptyYourCartButton();
        acceptAlert();
        waitUntilVisibilityOfElementLocated(By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"), 5);
        String expectedMessage3 = "Item(s) deleted from your cart";
        String actualMessage3 = cartPage.getItemsDeletedText();
        Assert.assertEquals(expectedMessage3, actualMessage3, "An error has occurred.");
        String expectedMessage4 = "Your cart is empty";
        String actualMessage4 = cartPage.getCartIsEmptyText();
        Assert.assertEquals(expectedMessage4, actualMessage4, "An error has occurred.");
    }

}


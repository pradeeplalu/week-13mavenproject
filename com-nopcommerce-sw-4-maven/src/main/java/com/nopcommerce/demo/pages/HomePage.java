package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    By computerTab = By.linkText("Computers");
    By electronicsTab = By.linkText("Electronics");
    By apparelTab = By.linkText("Apparel");
    By digitalDownloadsTab = By.linkText("Digital downloads");
    By booksTab = By.linkText("Books");
    By jewelryTab = By.xpath("//a[contains(text(),'Jewelry')]");
    By giftCardsTab = By.xpath("//a[contains(text(),'Gift Cards')]");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public String getComputerText() {
        return getTextFromElement(computerTab);
    }

    public String getElectronicsText() {
        return getTextFromElement(electronicsTab);
    }

    public String getApparelText() {
        return getTextFromElement(apparelTab);
    }

    public String getDigitalDownloadsText() {
        return getTextFromElement(digitalDownloadsTab);
    }

    public String getBooksText() {
        return getTextFromElement(booksTab);
    }

    public String getJewelryText() {
        return getTextFromElement(jewelryTab);
    }

    public String getGiftCardsText() {
        return getTextFromElement(giftCardsTab);
    }

    public void clickComputerTab() {
        clickOnElement(computerTab);
    }

    public void clickElectronicsTab() {
        clickOnElement(electronicsTab);
    }

    public void clickApparelTab() {
        clickOnElement(apparelTab);
    }

    public void clickDigitalDownloadsTab() {
        clickOnElement(digitalDownloadsTab);
    }

    public void clickBooksTab() {
        clickOnElement(booksTab);
    }

    public void clickJewelryTab() {
        clickOnElement(jewelryTab);
    }

    public void clickGiftCardTab() {
        clickOnElement(giftCardsTab);
    }
}





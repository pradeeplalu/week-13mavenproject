package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class PaymentConfirmationPag extends Utility {
    By confirmationText = By.xpath("//h1[@id='page-title']");


    public String getConfirmationText(){
        return getTextFromElement(confirmationText);
    }
}



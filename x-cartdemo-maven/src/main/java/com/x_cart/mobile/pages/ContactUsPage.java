package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {
    By contactUsText = By.id("page-title");


    public String getContactUsText(){
        return getTextFromElement(contactUsText);
    }

}



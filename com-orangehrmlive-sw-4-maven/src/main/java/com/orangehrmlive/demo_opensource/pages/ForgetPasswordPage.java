package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgetPasswordPage extends Utility {
    By forgetPasswordText = By.xpath("//div/div[2]/h1");

    public String getForgetPasswordText()
    {
        return getTextFromElement(forgetPasswordText);

    }
}





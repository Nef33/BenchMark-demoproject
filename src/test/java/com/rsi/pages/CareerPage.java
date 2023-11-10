package com.rsi.pages;

import com.rsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CareerPage {

    public CareerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//li[@class='job-posting-listing general-listing']")
    public List<WebElement> currentOpportunities;
}

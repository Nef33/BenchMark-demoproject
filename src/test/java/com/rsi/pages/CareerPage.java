package com.rsi.pages;

import com.rsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {

    public CareerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[.='Apply at RSI Logistics ›'][1]")
    public WebElement applyRSILogisticButton;

    @FindBy(xpath="//h1[.='RSI Careers Apply at RSI Logistics']")
    public WebElement careerPageHeader;

    @FindBy(xpath="//*[@id='gnewtonSearchBtn']")
    public WebElement searchButton;
    @FindBy(id="/gnewtonLocation")
    public WebElement locationDropdown;

    @FindBy(css=".wpb_wrapper")
    public WebElement scrollUp ;

    @FindBy(id="gnewtonKeyword")
    public WebElement searchJobAndTitle;
}

package com.benchmark.pages;

import com.benchmark.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CareerPage {

    public CareerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//ul/li[@class='job-posting-listing general-listing']//h4")
    public List<WebElement> currentOpportunities;
}

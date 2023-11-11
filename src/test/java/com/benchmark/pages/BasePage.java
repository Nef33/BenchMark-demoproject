package com.benchmark.pages;

import com.benchmark.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//a[.='About Us']")

    public WebElement aboutUsTab;


    @FindBy(xpath="(//a[@title='Careers'])[1]")

    public WebElement careersTab;
}

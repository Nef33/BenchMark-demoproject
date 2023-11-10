package com.rsi.step_definitions;

import com.rsi.pages.BasePage;
import com.rsi.pages.CareerPage;
import com.rsi.utilities.BrowserUtil;
import com.rsi.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class US001_StepDefinitions extends BasePage {

    CareerPage careerPage=new CareerPage();

    @Given("user clicks on About Us tab")
    public void user_clicks_on_about_us_tab() {

        aboutUsTab.click();


    }
    @When("user selects  {string} tab")
    public void user_selects_tab(String careers) {
        careersTab.click();

    }



        @Then("user should see {int} different career opportunities as {string} on the page")
        public void userShouldSeeDifferentCareerOpportunitiesAsOnThePage(int expectedCareerCount, String expectedCurrentOpportunities) {
            int actualCareerCount = careerPage.currentOpportunities.size();

            Assert.assertEquals(expectedCareerCount, actualCareerCount);
            System.out.println("actualCareerCount = " + actualCareerCount);
            System.out.println("expectedCareerCount = " + expectedCareerCount);

            for (int i = 0; i < actualCareerCount; i++) {
                String actualCurrentOpportunities=careerPage.currentOpportunities.get(i).getText();
                System.out.println("actualCurrentOpportunities = " + actualCurrentOpportunities);
                System.out.println("expectedCurrentOpportunities = " + expectedCurrentOpportunities);


            }



        }}

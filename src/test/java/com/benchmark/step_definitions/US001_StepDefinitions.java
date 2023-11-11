package com.benchmark.step_definitions;

import com.benchmark.pages.BasePage;
import com.benchmark.pages.CareerPage;
import com.benchmark.utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US001_StepDefinitions extends BasePage {

    CareerPage careerPage=new CareerPage();
    List<String>actualCurrentOpportunities;

    @Given("user clicks on About Us tab")
    public void user_clicks_on_about_us_tab() {

        aboutUsTab.click();


    }

    @When("user selects  careers tab")
    public void userSelectsCareersTab() {
        careersTab.click();
    }


    @Then("user should see {int} different career opportunities on the page")
    public void user_should_see_different_career_opportunities_on_the_page(int expectedCareerCount, List<String>expectedCurrentOpportunities ) {
        int actualCareerCount = careerPage.currentOpportunities.size();

        List<String>actualCurrentOpportunities=BrowserUtil.getElementsText(careerPage.currentOpportunities);


        System.out.println("actualCareerCount = " + actualCareerCount);
        System.out.println("expectedCareerCount = " + expectedCareerCount);
        System.out.println("actualCurrentOpportunities = " + actualCurrentOpportunities);
        System.out.println("expectedCurrentOpportunities = " + expectedCurrentOpportunities);
        

        Assert.assertEquals(expectedCareerCount, actualCareerCount);
        Assert.assertEquals(expectedCurrentOpportunities,actualCurrentOpportunities);
    }
}


package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListIntelligenceViewSection
{
    @When("Click on ListView button on Contacts window")
    public void click_on_list_view_button_on_contacts_window() throws InterruptedException
    {
        WebDriverUtils.clickListView();
    }
    @Then("Click on IntelligenceView button on Contacts window")
    public void click_on_intelligence_view_button_on_contacts_window() throws InterruptedException
    {
        WebDriverUtils.clickIntelligenceView();
    }
}

package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigateToContactSection
{
    @When("Click on Task Menu to see Contacts option")
    public void click_on_task_menu_to_see_contacts_option()
    {
        WebDriverUtils.clickTaskMenuToSeeContact();
    }
    @Then("Click on Contacts option to navigate to Contacts page")
    public void click_on_contacts_option_to_navigate_to_contacts_page()
    {
        WebDriverUtils.clickContactOption();
    }
}

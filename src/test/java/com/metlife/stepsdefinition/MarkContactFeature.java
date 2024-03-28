package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MarkContactFeature
{
    @When("Click on mark contact icon on Contacts window")
    public void click_on_mark_contact_icon_on_contacts_window() throws InterruptedException
    {
        WebDriverUtils.markContactsClick();
    }
    @Then("Click again on mark contact icon on Contacts window")
    public void click_again_on_mark_contact_icon_on_contacts_window() throws InterruptedException
    {
        WebDriverUtils.unmarkContactsClick();
    }
}

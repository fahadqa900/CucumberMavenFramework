package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteContactSection
{
    @Given("Click on delete section to delete contact")
    public void click_on_delete_section_to_delete_contact()
    {
        WebDriverUtils.openDeleteContactSection();
    }
    @Given("Click on delete button to delete contact")
    public void click_on_delete_button_to_delete_contact()
    {
        WebDriverUtils.deleteContactButton1();
    }
    @Then("Click on next delete button to delete contact")
    public void click_on_next_delete_button_to_delete_contact()
    {
        WebDriverUtils.deleteContactButton2();
    }

}

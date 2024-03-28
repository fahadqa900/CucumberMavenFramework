package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditContactSection
{
    @Given("Click on edit section to edit contact")
    public void click_on_edit_section_to_edit_contact()
    {
        WebDriverUtils.editContacts();
    }
    @Given("Click on edit button to edit contact")
    public void click_on_edit_button_to_edit_contact()
    {
        WebDriverUtils.clickEditContacts();
    }
    @Given("Enter {string} in contact window to edit")
    public void enter_in_contact_window_to_edit(String title)
    {
        WebDriverUtils.editContactsTitle(title);
    }
    @Then("Click on save button to save edited contact")
    public void click_on_save_button_to_save_edited_contact()
    {
        WebDriverUtils.clickSaveContacts1();
    }
}

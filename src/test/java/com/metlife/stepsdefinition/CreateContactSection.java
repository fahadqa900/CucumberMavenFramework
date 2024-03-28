package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateContactSection
{
    @When("Refresh the browser on Contacts page")
    public void refresh_the_browser_on_contacts_page()
    {
        WebDriverUtils.refreshBrowserContactsPage1();
    }
    @When("Click on create new contact button on Contacts page")
    public void click_on_create_new_contact_button_on_contacts_page() throws InterruptedException
    {
        WebDriverUtils.clickCreateContacts();
    }
    @When("Choose salutation")
    public void choose_salutation()
    {
        WebDriverUtils.salutationContacts();
    }
    @When("Enter {string} lastname on Contacts page")
    public void enter_lastname_on_contacts_page(String lastName)
    {
        WebDriverUtils.enterLastNameContacts(lastName);
    }
    @When("Click on save button to save new contact")
    public void click_on_save_button_to_save_new_contact()
    {
        WebDriverUtils.clickSaveContacts();
    }
    @When("Close new created contact window")
    public void close_new_created_contact_window() throws InterruptedException
    {
        WebDriverUtils.closeUpdatedContactsWindow();
    }
    @Then("Refresh the browser to view new created contact")
    public void refresh_the_browser_to_view_new_created_contact() throws InterruptedException
    {
        WebDriverUtils.refreshBrowserContactsPage2();
    }
}

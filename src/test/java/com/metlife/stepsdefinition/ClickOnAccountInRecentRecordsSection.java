package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickOnAccountInRecentRecordsSection
{
    @When("Click on an account in Recent Records section")
    public void click_on_an_account_in_recent_records_section()
    {
        WebDriverUtils.clickAccountInRecentRecord();
    }
    @When("Click on new contact button")
    public void click_on_new_contact_button()
    {
        WebDriverUtils.createNewContactRecentRecords();
    }
    @When("Choose salutation to edit contact")
    public void choose_salutation_to_edit_contact()
    {
        WebDriverUtils.salutationContactRecentRecords();
    }
    @When("Enter {string} lastname")
    public void enter_lastname(String string)
    {
        WebDriverUtils.enterLastNameContactRecentRecords();
    }
    @When("Click on save button to save contact")
    public void click_on_save_button_to_save_contact()
    {
        WebDriverUtils.clickSaveContactRecentRecords();
    }
    @When("Click on details tab")
    public void click_on_details_tab()
    {
        WebDriverUtils.clickDetailsTabRecentRecords();
    }
    @When("Click on edit to edit mobile number")
    public void click_on_edit_to_edit_mobile_number()
    {
        WebDriverUtils.editMobileContactRecentRecords();
    }
    @When("Enter mobile number {string}")
    public void enter_mobile_number(String mobileNumber)
    {
        WebDriverUtils.enterMobileRecentRecords(mobileNumber);
    }
    @When("Click on save button to save mobile number")
    public void click_on_save_button_to_save_mobile_number()
    {
        WebDriverUtils.clickSaveContact1RecentRecords();
    }
    @When("Close updated contact window")
    public void close_updated_contact_window() throws InterruptedException
    {
        WebDriverUtils.closeUpdatedContactRecentRecords();
    }
    @Then("Quit updated contact window")
    public void quit_updated_contact_window() throws InterruptedException
    {
        WebDriverUtils.quitUpdatedContactRecentRecords();
    }
}

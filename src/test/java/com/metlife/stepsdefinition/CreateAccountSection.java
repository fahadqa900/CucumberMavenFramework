package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateAccountSection
{
    @When("Click on new button in Accounts section")
    public void click_on_new_button_in_accounts_section()
    {
        WebDriverUtils.clickOnNewAccountCreate();
    }
    @When("Enter account name as {string}")
    public void enter_account_name_as(String string)
    {
        WebDriverUtils.enterAccountNameCreate();
    }
    @When("Click on save button to save new account")
    public void click_on_save_button_to_save_new_account()
    {
        WebDriverUtils.clickSaveAccountCreate();
    }
    @When("Close new created account window")
    public void close_new_created_account_window() throws InterruptedException
    {
        WebDriverUtils.closeNewAccountWindow();
    }
    @Then("Refresh the browser to view new created account")
    public void refresh_the_browser_to_view_new_created_account() throws InterruptedException
    {
        WebDriverUtils.refreshBrowserAccountCreation();
    }
}

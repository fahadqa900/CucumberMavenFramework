package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAddAccountSection
{
    @When("Click on Task Menu to view Accounts option")
    public void click_on_task_menu_to_view_accounts_option()
    {
        WebDriverUtils.clickTaskMenuAccountRecentRecords();
    }
    @Then("Click on Accounts option to land on Accounts page")
    public void click_on_accounts_option_to_land_on_accounts_page()
    {
        WebDriverUtils.clickAccountOptionRecentRecords();
    }
    @When("Click on account check box to select an account")
    public void click_on_account_check_box_to_select_an_account()
    {
        WebDriverUtils.clickAccountCheckBox();
    }
    @When("Open account edit section to edit first existing account")
    public void open_account_edit_section_to_edit_first_existing_account() throws InterruptedException
    {
        WebDriverUtils.openAccountEditSection();
    }
    @When("Click on edit button to edit first existing account")
    public void click_on_edit_button_to_edit_first_existing_account()
    {
        WebDriverUtils.clickEditButtonExistingAccount();
    }
    @When("Clear account text box to edit first existing account")
    public void clear_account_text_box_to_edit_first_existing_account()
    {
        WebDriverUtils.clearExistingAccountName();
    }
    @When("Enter {string} to edit first existing account")
    public void enter_to_edit_first_existing_account(String accountName)
    {
        WebDriverUtils.enterToEditExistingAccount(accountName);
    }
    @When("Click on save button to update first account")
    public void click_on_save_button_to_update_first_account()
    {
        WebDriverUtils.saveUpdateExistingAccount();
    }
    @When("Click on new button to create second account")
    public void click_on_new_button_to_create_second_account()
    {
        WebDriverUtils.clickNewToCreateSecondAccount();
    }
    @When("Enter {string} to create second account")
    public void enter_to_create_second_account(String accountName)
    {
        WebDriverUtils.enterCreateSecondAccount(accountName);
    }
    @When("Click on save button to save second account")
    public void click_on_save_button_to_save_second_account()
    {
        WebDriverUtils.updateSaveSecondAccount();
    }
    @When("Close second account window")
    public void close_second_account_window()
    {
        WebDriverUtils.closeSecondAccountWindow();
    }
    @When("Click on new button to create third account")
    public void click_on_new_button_to_create_third_account()
    {
        WebDriverUtils.clickCreateThirdAccount();
    }
    @When("Enter {string} to create third account")
    public void enter_to_create_third_account(String accountName)
    {
        WebDriverUtils.enterAccountThird(accountName);
    }
    @When("Click on save button to save third account")
    public void click_on_save_button_to_save_third_account()
    {
        WebDriverUtils.updateSaveThirdAccount();
    }
    @When("Close third account window")
    public void close_third_account_window()
    {
        WebDriverUtils.closeThirdAccountWindow();
    }
    @Then("Refresh the browser to view updated and new created accounts")
    public void refresh_the_browser_to_view_updated_and_new_created_accounts() throws InterruptedException
    {
        WebDriverUtils.refreshBrowserAfterEditAddAccounts();
    }
}

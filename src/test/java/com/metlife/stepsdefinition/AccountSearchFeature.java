package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountSearchFeature
{
    @Given("Click on Task Menu to go to Accounts page to search an account")
    public void click_on_task_menu_to_go_to_accounts_page_to_search_an_account()
    {
        WebDriverUtils.clickTaskMenuAccountSearch();
    }
    @Given("Click on Accounts option to search accounts")
    public void click_on_accounts_option_to_search_accounts()
    {
        WebDriverUtils.selectAccountOptionAccountSearch();
    }
    @Given("Search {string} for first account on Accounts page")
    public void search_for_first_account_on_accounts_page(String firstAccountName)
    {
        WebDriverUtils.firstAccountSearch(firstAccountName);
    }
    @Given("Clear search text for first account")
    public void clear_search_text_for_first_account()
    {
        WebDriverUtils.clearSearchFirstAccount();
    }
    @Given("Search {string} for second account on Accounts page")
    public void search_for_second_account_on_accounts_page(String secondAccountName)
    {
        WebDriverUtils.secondAccountSearch(secondAccountName);
    }
    @Given("Clear search text for second account")
    public void clear_search_text_for_second_account()
    {
        WebDriverUtils.clearSearchSecondAccount();
    }
    @Then("Refresh the browser to view all accounts")
    public void refresh_the_browser_to_view_all_accounts()
    {
        WebDriverUtils.refreshBrowserAfterAccountSearch();
    }
}

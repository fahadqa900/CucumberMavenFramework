package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigateToCommerceModule
{
    @When("Click on hamberger menu")
    public void click_on_hamberger_menu()
    {
        WebDriverUtils.clickHamberger();
    }
    @When("Click on View All link")
    public void click_on_view_all_link()
    {
        WebDriverUtils.clickViewAll();
    }
    @When("Enter {string} in search box")
    public void enter_in_search_box(String searchTexture) throws InterruptedException
    {
        WebDriverUtils.enterInSearch(searchTexture);
    }
    @Then("Click on Commerce link")
    public void click_on_commerce_link()
    {
        WebDriverUtils.clickOnCommerce();
    }
}

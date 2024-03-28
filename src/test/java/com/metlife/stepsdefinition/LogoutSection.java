package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogoutSection
{
    @Given("Click on Logout image icon to logout from SalesForce application")
    public void click_on_logout_image_icon_to_logout_from_sales_force_application() throws InterruptedException
    {
        WebDriverUtils.getLogoutImage();
    }
    @Then("Click on Logout link to logout from SalesForce application")
    public void click_on_logout_link_to_logout_from_sales_force_application() throws InterruptedException
    {
        WebDriverUtils.getLogoutLink();
    }
}

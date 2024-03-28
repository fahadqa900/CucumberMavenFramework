package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SwitchToClassicViewSection
{
    @Given("Click on Logout image icon to switch to SalesForce Classic View")
    public void click_on_logout_image_icon_to_switch_to_sales_force_classic_view()
    {
        WebDriverUtils.clickLogoutImageClassicView();
    }
    @Then("Click on switch to classic view")
    public void click_on_switch_to_classic_view()
    {
        WebDriverUtils.switchToClassicView();
    }
}

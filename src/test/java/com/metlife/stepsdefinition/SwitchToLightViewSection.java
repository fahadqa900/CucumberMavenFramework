package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;

public class SwitchToLightViewSection
{
    @Then("Click on switch to light view")
    public void click_on_switch_to_light_view()
    {
        WebDriverUtils.switchToLightView();
    }
}

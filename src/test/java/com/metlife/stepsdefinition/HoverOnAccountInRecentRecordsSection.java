package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HoverOnAccountInRecentRecordsSection
{
    @When("Hover on an account in Recent Records section")
    public void hover_on_an_account_in_recent_records_section() throws InterruptedException
    {
        WebDriverUtils.hoverOnAccountInRecentRecord();
    }
    @Then("Refresh the browser window")
    public void refresh_the_browser_window()
    {
        WebDriverUtils.refreshBrowserAfterHoverRecentRecords();
    }

}

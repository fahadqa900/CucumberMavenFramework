package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewUpdatedRecentRecordsSection
{
    @When("Click on Task Menu to see Home option so as to view updated recent records")
    public void click_on_task_menu_to_see_home_option_so_as_to_view_updated_recent_records()
    {
        WebDriverUtils.clickTaskUpdatedRecentRecords();
    }
    @When("Click on Home option to see all updated recent records")
    public void click_on_home_option_to_see_all_updated_recent_records()
    {
        WebDriverUtils.clickHomeUpdatedRecentRecords();
    }
    @When("Click on View All Recent Records link to view updated recent records")
    public void click_on_view_all_recent_records_link_to_view_updated_recent_records() throws InterruptedException
    {
        WebDriverUtils.clickViewUpdatedRecords();
    }
    @Then("Close updated recent records window")
    public void close_updated_recent_records_window() throws InterruptedException
    {
        WebDriverUtils.closeUpdatedRecordsWindow();
    }
}

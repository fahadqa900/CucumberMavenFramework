package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.When;

public class ViewAllRecentRecordsSection
{
    @When("Click on Task Menu to see Home option")
    public void click_on_task_menu_to_see_home_option()
    {
        WebDriverUtils.clickTaskMenuForHome();
    }
    @When("Click on Home option to see all recent records")
    public void click_on_home_option_to_see_all_recent_records()
    {
        WebDriverUtils.clickHomeOption();
    }
    @When("Click on View All Recent Records link on Home page to view recent records")
    public void click_on_view_all_recent_records_link_on_home_page_to_view_recent_records() throws InterruptedException
    {
        WebDriverUtils.clickViewRecentRecords();
    }
    @When("Close Recent Records window")
    public void close_recent_records_window() throws InterruptedException
    {
        WebDriverUtils.closeRecentRecords();
    }

}

package com.metlife.stepsdefinition;

import com.metlife.PageObjects.LoginLocators;
import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginModule
{
    @Given("Open browser and launch SalesForce application")
    public void open_browser_and_launch_sales_force_application()
    {
        WebDriverUtils.initialize();
        WebDriverUtils.launchUrl("https://resourceful-bear-twv16u-dev-ed.trailblaze.my.salesforce.com/");
    }
    @When("Enter valid {string} and {string}")
    public void enter_valid_and(String userName, String userPwd)
    {
        WebDriverUtils.type(LoginLocators.uName, userName);
        WebDriverUtils.type(LoginLocators.uPwd, userPwd);
    }
    @Then("For valid credentials user should login into application")
    public void for_valid_credentials_user_should_login_into_application()
    {
        WebDriverUtils.click(LoginLocators.uLogin);
    }

}

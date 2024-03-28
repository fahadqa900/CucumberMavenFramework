package com.metlife.stepsdefinition;

import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAccountFeature
{
    @When("Click on account check box")
    public void click_on_account_check_box()
    {
        WebDriverUtils.clickAccountCheckBox1();
    }
    @When("Click on account edit section")
    public void click_on_account_edit_section()
    {
        WebDriverUtils.openAccountDeleteSection();
    }
    @When("Click on delete button appeared to delete an account")
    public void click_on_delete_button_appeared_to_delete_an_account()
    {
        WebDriverUtils.deleteAccountButton1();
    }
    @Then("Click on delete button again to delete an account")
    public void click_on_delete_button_again_to_delete_an_account()
    {
        WebDriverUtils.deleteAccountButton2();
    }

}

package com.metlife.stepsdefinition;

import com.metlife.PageObjects.LoginLocators;
import com.metlife.Utility.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CommerceDefinition
{
//    @Given("Open browser and launch SalesForce application")
//    public void open_browser_and_launch_sales_force_application()
//    {
//        WebDriverUtils.initialize();
//        WebDriverUtils.launchUrl("https://resourceful-bear-twv16u-dev-ed.trailblaze.my.salesforce.com/");
//    }
//    @When("Enter valid {string} and {string}")
//    public void enter_valid_and(String userName, String userPwd)
//    {
//        WebDriverUtils.type(LoginLocators.uName, userName);
//        WebDriverUtils.type(LoginLocators.uPwd, userPwd);
//    }
//    @Then("For valid credentials user should login into application")
//    public void for_valid_credentials_user_should_login_into_application()
//    {
//        WebDriverUtils.click(LoginLocators.uLogin);
//    }
//    @When("Click on hamberger menu")
//    public void click_on_hamberger_menu()
//    {
//        WebDriverUtils.clickHamberger();
//    }
//    @When("Click on View All link")
//    public void click_on_view_all_link()
//    {
//        WebDriverUtils.clickViewAll();
//    }
//    @When("Enter {string} in search box")
//    public void enter_in_search_box(String searchTexture) throws InterruptedException
//    {
//        WebDriverUtils.enterInSearch(searchTexture);
//    }
//    @Then("Click on Commerce link")
//    public void click_on_commerce_link()
//    {
//        WebDriverUtils.clickOnCommerce();
//    }
//
//    @When("Click on Task Menu to see Accounts option")
//    public void click_on_task_menu_to_see_accounts_option()
//    {
//        WebDriverUtils.clickTaskMenuNewAccountCreate();
//    }
//    @Then("Click on Accounts option to navigate to Accounts page")
//    public void click_on_accounts_option_to_navigate_to_accounts_page()
//    {
//        WebDriverUtils.clickAccountOptionNewAccountCreate();
//    }
//    @When("Click on new button in Accounts section")
//    public void click_on_new_button_in_accounts_section()
//    {
//        WebDriverUtils.clickOnNewAccountCreate();
//    }
//    @When("Enter account name as {string}")
//    public void enter_account_name_as(String string)
//    {
//        WebDriverUtils.enterAccountNameCreate();
//    }
//    @When("Click on save button to save new account")
//    public void click_on_save_button_to_save_new_account()
//    {
//        WebDriverUtils.clickSaveAccountCreate();
//    }
//    @When("Close new created account window")
//    public void close_new_created_account_window() throws InterruptedException
//    {
//        WebDriverUtils.closeNewAccountWindow();
//    }
//    @Then("Refresh the browser to view new created account")
//    public void refresh_the_browser_to_view_new_created_account() throws InterruptedException
//    {
//        WebDriverUtils.refreshBrowserAccountCreation();
//    }
//    @When("Click on Task Menu to see Home option")
//    public void click_on_task_menu_to_see_home_option()
//    {
//        WebDriverUtils.clickTaskMenuForHome();
//    }
//    @When("Click on Home option to see all recent records")
//    public void click_on_home_option_to_see_all_recent_records()
//    {
//        WebDriverUtils.clickHomeOption();
//    }
//    @When("Click on View All Recent Records link on Home page to view recent records")
//    public void click_on_view_all_recent_records_link_on_home_page_to_view_recent_records() throws InterruptedException
//    {
//        WebDriverUtils.clickViewRecentRecords();
//    }
//    @When("Close Recent Records window")
//    public void close_recent_records_window() throws InterruptedException
//    {
//        WebDriverUtils.closeRecentRecords();
//    }
//    @When("Click on Task Menu to view Accounts option")
//    public void click_on_task_menu_to_view_accounts_option()
//    {
//        WebDriverUtils.clickTaskMenuAccountRecentRecords();
//    }
//    @Then("Click on Accounts option to land on Accounts page")
//    public void click_on_accounts_option_to_land_on_accounts_page()
//    {
//        WebDriverUtils.clickAccountOptionRecentRecords();
//    }
//    @When("Click on account check box to select an account")
//    public void click_on_account_check_box_to_select_an_account()
//    {
//        WebDriverUtils.clickAccountCheckBox();
//    }
//    @When("Open account edit section to edit first existing account")
//    public void open_account_edit_section_to_edit_first_existing_account() throws InterruptedException
//    {
//        WebDriverUtils.openAccountEditSection();
//    }
//    @When("Click on edit button to edit first existing account")
//    public void click_on_edit_button_to_edit_first_existing_account()
//    {
//        WebDriverUtils.clickEditButtonExistingAccount();
//    }
//    @When("Clear account text box to edit first existing account")
//    public void clear_account_text_box_to_edit_first_existing_account()
//    {
//        WebDriverUtils.clearExistingAccountName();
//    }
//    @When("Enter {string} to edit first existing account")
//    public void enter_to_edit_first_existing_account(String accountName)
//    {
//        WebDriverUtils.enterToEditExistingAccount(accountName);
//    }
//    @When("Click on save button to update first account")
//    public void click_on_save_button_to_update_first_account()
//    {
//        WebDriverUtils.saveUpdateExistingAccount();
//    }
//    @When("Click on new button to create second account")
//    public void click_on_new_button_to_create_second_account()
//    {
//        WebDriverUtils.clickNewToCreateSecondAccount();
//    }
//    @When("Enter {string} to create second account")
//    public void enter_to_create_second_account(String accountName)
//    {
//        WebDriverUtils.enterCreateSecondAccount(accountName);
//    }
//    @When("Click on save button to save second account")
//    public void click_on_save_button_to_save_second_account()
//    {
//        WebDriverUtils.updateSaveSecondAccount();
//    }
//    @When("Close second account window")
//    public void close_second_account_window()
//    {
//        WebDriverUtils.closeSecondAccountWindow();
//    }
//    @When("Click on new button to create third account")
//    public void click_on_new_button_to_create_third_account()
//    {
//        WebDriverUtils.clickCreateThirdAccount();
//    }
//    @When("Enter {string} to create third account")
//    public void enter_to_create_third_account(String accountName)
//    {
//        WebDriverUtils.enterAccountThird(accountName);
//    }
//    @When("Click on save button to save third account")
//    public void click_on_save_button_to_save_third_account()
//    {
//        WebDriverUtils.updateSaveThirdAccount();
//    }
//    @When("Close third account window")
//    public void close_third_account_window()
//    {
//        WebDriverUtils.closeThirdAccountWindow();
//    }
//    @Then("Refresh the browser to view updated and new created accounts")
//    public void refresh_the_browser_to_view_updated_and_new_created_accounts() throws InterruptedException
//    {
//        WebDriverUtils.refreshBrowserAfterEditAddAccounts();
//    }
//    @When("Click on Task Menu to see Home option so as to view updated recent records")
//    public void click_on_task_menu_to_see_home_option_so_as_to_view_updated_recent_records()
//    {
//        WebDriverUtils.clickTaskUpdatedRecentRecords();
//    }
//    @When("Click on Home option to see all updated recent records")
//    public void click_on_home_option_to_see_all_updated_recent_records()
//    {
//        WebDriverUtils.clickHomeUpdatedRecentRecords();
//    }
//    @When("Click on View All Recent Records link to view updated recent records")
//    public void click_on_view_all_recent_records_link_to_view_updated_recent_records() throws InterruptedException
//    {
//        WebDriverUtils.clickViewUpdatedRecords();
//    }
//    @Then("Close updated recent records window")
//    public void close_updated_recent_records_window() throws InterruptedException
//    {
//        WebDriverUtils.closeUpdatedRecordsWindow();
//    }
//    @When("Hover on an account in Recent Records section")
//    public void hover_on_an_account_in_recent_records_section() throws InterruptedException
//    {
//        WebDriverUtils.hoverOnAccountInRecentRecord();
//    }
//    @Then("Refresh the browser window")
//    public void refresh_the_browser_window()
//    {
//        WebDriverUtils.refreshBrowserAfterHoverRecentRecords();
//    }
//    @When("Click on an account in Recent Records section")
//    public void click_on_an_account_in_recent_records_section()
//    {
//        WebDriverUtils.clickAccountInRecentRecord();
//    }
//    @When("Click on new contact button")
//    public void click_on_new_contact_button()
//    {
//        WebDriverUtils.createNewContactRecentRecords();
//    }
//    @When("Choose salutation to edit contact")
//    public void choose_salutation_to_edit_contact()
//    {
//        WebDriverUtils.salutationContactRecentRecords();
//    }
//    @When("Enter {string} lastname")
//    public void enter_lastname(String string)
//    {
//        WebDriverUtils.enterLastNameContactRecentRecords();
//    }
//    @When("Click on save button to save contact")
//    public void click_on_save_button_to_save_contact()
//    {
//        WebDriverUtils.clickSaveContactRecentRecords();
//    }
//    @When("Click on details tab")
//    public void click_on_details_tab()
//    {
//        WebDriverUtils.clickDetailsTabRecentRecords();
//    }
//    @When("Click on edit to edit mobile number")
//    public void click_on_edit_to_edit_mobile_number()
//    {
//        WebDriverUtils.editMobileContactRecentRecords();
//    }
//    @When("Enter mobile number {string}")
//    public void enter_mobile_number(String mobileNumber)
//    {
//        WebDriverUtils.enterMobileRecentRecords(mobileNumber);
//    }
//    @When("Click on save button to save mobile number")
//    public void click_on_save_button_to_save_mobile_number()
//    {
//        WebDriverUtils.clickSaveContact1RecentRecords();
//    }
//    @When("Close updated contact window")
//    public void close_updated_contact_window() throws InterruptedException
//    {
//        WebDriverUtils.closeUpdatedContactRecentRecords();
//    }
//    @Then("Quit updated contact window")
//    public void quit_updated_contact_window() throws InterruptedException
//    {
//        WebDriverUtils.quitUpdatedContactRecentRecords();
//    }
//    @Given("Click on Task Menu to go to Accounts page to search an account")
//    public void click_on_task_menu_to_go_to_accounts_page_to_search_an_account()
//    {
//        WebDriverUtils.clickTaskMenuAccountSearch();
//    }
//    @Given("Click on Accounts option to search accounts")
//    public void click_on_accounts_option_to_search_accounts()
//    {
//        WebDriverUtils.selectAccountOptionAccountSearch();
//    }
//    @Given("Search {string} for first account on Accounts page")
//    public void search_for_first_account_on_accounts_page(String firstAccountName)
//    {
//        WebDriverUtils.firstAccountSearch(firstAccountName);
//    }
//    @Given("Clear search text for first account")
//    public void clear_search_text_for_first_account()
//    {
//        WebDriverUtils.clearSearchFirstAccount();
//    }
//    @Given("Search {string} for second account on Accounts page")
//    public void search_for_second_account_on_accounts_page(String secondAccountName)
//    {
//        WebDriverUtils.secondAccountSearch(secondAccountName);
//    }
//    @Given("Clear search text for second account")
//    public void clear_search_text_for_second_account()
//    {
//        WebDriverUtils.clearSearchSecondAccount();
//    }
//    @Then("Refresh the browser to view all accounts")
//    public void refresh_the_browser_to_view_all_accounts()
//    {
//        WebDriverUtils.refreshBrowserAfterAccountSearch();
//    }
//    @When("Click on account check box")
//    public void click_on_account_check_box()
//    {
//        WebDriverUtils.clickAccountCheckBox1();
//    }
//    @When("Click on account edit section")
//    public void click_on_account_edit_section()
//    {
//        WebDriverUtils.openAccountDeleteSection();
//    }
//    @When("Click on delete button appeared to delete an account")
//    public void click_on_delete_button_appeared_to_delete_an_account()
//    {
//        WebDriverUtils.deleteAccountButton1();
//    }
//    @Then("Click on delete button again to delete an account")
//    public void click_on_delete_button_again_to_delete_an_account()
//    {
//        WebDriverUtils.deleteAccountButton2();
//    }
//    @When("Click on Task Menu to see Contacts option")
//    public void click_on_task_menu_to_see_contacts_option()
//    {
//        WebDriverUtils.clickTaskMenuToSeeContact();
//    }
//    @Then("Click on Contacts option to navigate to Contacts page")
//    public void click_on_contacts_option_to_navigate_to_contacts_page()
//    {
//        WebDriverUtils.clickContactOption();
//    }
//    @When("Refresh the browser on Contacts page")
//    public void refresh_the_browser_on_contacts_page()
//    {
//        WebDriverUtils.refreshBrowserContactsPage1();
//    }
//    @When("Click on create new contact button on Contacts page")
//    public void click_on_create_new_contact_button_on_contacts_page() throws InterruptedException
//    {
//        WebDriverUtils.clickCreateContacts();
//    }
//    @When("Choose salutation")
//    public void choose_salutation()
//    {
//        WebDriverUtils.salutationContacts();
//    }
//    @When("Enter {string} lastname on Contacts page")
//    public void enter_lastname_on_contacts_page(String lastName)
//    {
//        WebDriverUtils.enterLastNameContacts(lastName);
//    }
//    @When("Click on save button to save new contact")
//    public void click_on_save_button_to_save_new_contact()
//    {
//        WebDriverUtils.clickSaveContacts();
//    }
//    @When("Close new created contact window")
//    public void close_new_created_contact_window() throws InterruptedException
//    {
//        WebDriverUtils.closeUpdatedContactsWindow();
//    }
//    @Then("Refresh the browser to view new created contact")
//    public void refresh_the_browser_to_view_new_created_contact() throws InterruptedException
//    {
//        WebDriverUtils.refreshBrowserContactsPage2();
//    }
//    @When("Click on ListView button on Contacts window")
//    public void click_on_list_view_button_on_contacts_window() throws InterruptedException
//    {
//        WebDriverUtils.clickListView();
//    }
//    @Then("Click on IntelligenceView button on Contacts window")
//    public void click_on_intelligence_view_button_on_contacts_window() throws InterruptedException
//    {
//        WebDriverUtils.clickIntelligenceView();
//    }
//    @When("Click on mark contact icon on Contacts window")
//    public void click_on_mark_contact_icon_on_contacts_window() throws InterruptedException
//    {
//        WebDriverUtils.markContactsClick();
//    }
//    @Then("Click again on mark contact icon on Contacts window")
//    public void click_again_on_mark_contact_icon_on_contacts_window() throws InterruptedException
//    {
//        WebDriverUtils.unmarkContactsClick();
//    }
//    @Given("Click on edit section to edit contact")
//    public void click_on_edit_section_to_edit_contact()
//    {
//        WebDriverUtils.editContacts();
//    }
//    @Given("Click on edit button to edit contact")
//    public void click_on_edit_button_to_edit_contact()
//    {
//        WebDriverUtils.clickEditContacts();
//    }
//    @Given("Enter {string} in contact window to edit")
//    public void enter_in_contact_window_to_edit(String title)
//    {
//        WebDriverUtils.editContactsTitle(title);
//    }
//    @Then("Click on save button to save edited contact")
//    public void click_on_save_button_to_save_edited_contact()
//    {
//        WebDriverUtils.clickSaveContacts1();
//    }
//    @Given("Click on delete section to delete contact")
//    public void click_on_delete_section_to_delete_contact()
//    {
//        WebDriverUtils.openDeleteContactSection();
//    }
//    @Given("Click on delete button to delete contact")
//    public void click_on_delete_button_to_delete_contact()
//    {
//        WebDriverUtils.deleteContactButton1();
//    }
//    @Then("Click on next delete button to delete contact")
//    public void click_on_next_delete_button_to_delete_contact()
//    {
//        WebDriverUtils.deleteContactButton2();
//    }
//    @Given("Click on Logout image icon to switch to SalesForce Classic View")
//    public void click_on_logout_image_icon_to_switch_to_sales_force_classic_view()
//    {
//        WebDriverUtils.clickLogoutImageClassicView();
//    }
//    @Then("Click on switch to classic view")
//    public void click_on_switch_to_classic_view()
//    {
//        WebDriverUtils.switchToClassicView();
//    }
//    @Then("Click on switch to light view")
//    public void click_on_switch_to_light_view()
//    {
//        WebDriverUtils.switchToLightView();
//    }
//    @Given("Click on Logout image icon to logout from SalesForce application")
//    public void click_on_logout_image_icon_to_logout_from_sales_force_application() throws InterruptedException
//    {
//    WebDriverUtils.getLogoutImage();
//    }
//    @Then("Click on Logout link to logout from SalesForce application")
//    public void click_on_logout_link_to_logout_from_sales_force_application() throws InterruptedException
//    {
//    WebDriverUtils.getLogoutLink();
//    }
}


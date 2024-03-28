@Main
Feature: Validate SalesForce Commerce module functionality
  @Scenario1
  Scenario Outline: Validate SalesForce login functionality for valid user credentials
  Given Open browser and launch SalesForce application
  When Enter valid "<UserName>" and "<Password>"
  Then For valid credentials user should login into application
   Examples:
   |UserName|Password|
   |fawwaz123@gmail.com|fahad123|

    @Scenario2
    Scenario: Validate user's navigation to Commerce module
    When Click on hamberger menu
    And Click on View All link
    And Enter "Commerce" in search box
    Then Click on Commerce link

     @Scenario3
     Scenario: Validate user's navigation to Accounts section
     When Click on Task Menu to see Accounts option
     Then Click on Accounts option to navigate to Accounts page

      @Scenario4
      Scenario: Validate new account creation in Accounts section
      When Click on new button in Accounts section
      And Enter account name as "Dev1Account"
      And Click on save button to save new account
      And Close new created account window
      Then Refresh the browser to view new created account

       @Scenario5
       Scenario: Navigate to Home section to view all records in Recent Records section
       When Click on Task Menu to see Home option
       And Click on Home option to see all recent records
       And Click on View All Recent Records link on Home page to view recent records
       And Close Recent Records window
       And Click on Task Menu to view Accounts option
       Then Click on Accounts option to land on Accounts page

        @Scenario6
        Scenario: Validate account edit functionality in Accounts section
        When Click on account check box to select an account
        And Open account edit section to edit first existing account
        And Click on edit button to edit first existing account
        And Clear account text box to edit first existing account
        And Enter "Dev2Account" to edit first existing account
        And Click on save button to update first account
        And Click on new button to create second account
        And Enter "Dev3Account" to create second account
        And Click on save button to save second account
        And Close second account window
        And Click on new button to create third account
        And Enter "Dev4Account" to create third account
        And Click on save button to save third account
        And Close third account window
        Then Refresh the browser to view updated and new created accounts

      @Scenario7
      Scenario:Navigate to Home section to view updated records in Recent Records section
      When Click on Task Menu to see Home option so as to view updated recent records
      And Click on Home option to see all updated recent records
      And Click on View All Recent Records link to view updated recent records
      Then Close updated recent records window

      @Scenario8
      Scenario: View accounts' detail by hovering on a account in Recent Records section
      When Hover on an account in Recent Records section
      Then Refresh the browser window

      @Scenario9
      Scenario: View accounts' detail by clicking on a account in Recent Records section
      When Click on an account in Recent Records section
      And Click on new contact button
      And Choose salutation to edit contact
      And Enter "Fahad" lastname
      And Click on save button to save contact
      And Click on details tab
      And Click on edit to edit mobile number
      And Enter mobile number "987654321"
      And Click on save button to save mobile number
      And Close updated contact window
      Then Quit updated contact window

       @Scenario10
       Scenario: Validate account search functionality in Accounts section
       And Click on Task Menu to go to Accounts page to search an account
       And Click on Accounts option to search accounts
       And Search "Dev2Account" for first account on Accounts page
       And Clear search text for first account
       And Search "Dev3Account" for second account on Accounts page
       And Clear search text for second account
       Then Refresh the browser to view all accounts

       @Scenario11
       Scenario: Deletion of a account in Accounts section
       When Click on account check box
       And Click on account edit section
       And Click on delete button appeared to delete an account
       Then Click on delete button again to delete an account

      @Scenario12
      Scenario: Validate user's navigation to Contacts module
       When Click on Task Menu to see Contacts option
       Then Click on Contacts option to navigate to Contacts page

      @Scenario13
      Scenario: Validate creation of new contact in Contacts section
      When Refresh the browser on Contacts page
      When Click on create new contact button on Contacts page
      And Choose salutation
      And Enter "Firdous" lastname on Contacts page
      And Click on save button to save new contact
      And Close new created contact window
      Then Refresh the browser to view new created contact

      @Scenario14
      Scenario:Validate ListView and IntelligenceView display on Contacts window
      When Click on ListView button on Contacts window
      Then Click on IntelligenceView button on Contacts window

      @Scenario15
      Scenario: Mark a contact as important and unimportant in Contacts section
      When Click on mark contact icon on Contacts window
      Then Click again on mark contact icon on Contacts window

      @Scenario16
      Scenario: Edit a contact from Contacts section
      And Click on edit section to edit contact
      And Click on edit button to edit contact
      And Enter "TestTitle" in contact window to edit
      Then Click on save button to save edited contact

     @Scenario17
     Scenario: Delete a contact from Contacts section
     And Click on delete section to delete contact
     And Click on delete button to delete contact
     Then Click on next delete button to delete contact

     @Scenario18
     Scenario: Switch to SalesForce Classic View
     And Click on Logout image icon to switch to SalesForce Classic View
     Then Click on switch to classic view

      @Scenario19
      Scenario: Switch to SalesForce Lightning View
      Then Click on switch to light view

      @Scenario20
      Scenario: Logout from SalesForce application
      And Click on Logout image icon to logout from SalesForce application
      Then Click on Logout link to logout from SalesForce application





Feature: This Feature is for Account Opening

  Background:
    Given the user launches to huntington page
    When the user clicks on open an Account
    @account_opening_asterisk
    Scenario: Validate the Asterisk Free Checking account is visible
      And the user clicks on Apply for Asterisk-Free Checking
      Then the user validates the Asterisk-Free Checking is display on the page

    @account_opening_unlimited_Checking
    Scenario: Validate the Unlimited Checking account is opening
      And the user clicks on Unlimited Business Checking button
      Then the user should be on the Welcome page



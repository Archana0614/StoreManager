@StoreDashboard
Feature: Verify the store dashboard page
  I want to use this template for Verify the store dashboard page

  Background: 
    Given user on store manager page "https://store-manager-web-qa.azurewebsites.net/" link
    When user enter the credentail for login by Username as "amahadevaswamy@qwinix.io" and Password as "Parinith@0604"
    When user selected "Walmart" option
    When user click on search box and enter "1410" keyword

  Scenario: Verify the store dashboard page
    Given user on store dashboard
    When user get the option
      | Store Hours              |
      | Store Details            |
      | Smart Screen Information |
    Then user clicks on "Store Hours" link
    And user clicks on "Store Details" link
    And user clicks on "Smart Screen Information" link

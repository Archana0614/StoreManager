@storehours
Feature: Verify for the store hours page for non 24hrs
I want to use this template for Verify the store hours page 

  Background: 
    Given user on store manager page "https://store-manager-web-qa.azurewebsites.net/" link
    When user enter the credentail for login by Username as "amahadevaswamy@qwinix.io" and Password as "Parinith@0604"
    And user selected "Walmart" option
    Then user click on search box and enter "1410" keyword
   
    
    
    Scenario: Validate store hours page for non 24hrs format
    
    Given user on store dashboard
    When user clicks on "Store Hours" link
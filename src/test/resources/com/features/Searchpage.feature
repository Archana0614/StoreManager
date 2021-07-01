@searchByValidKeyword
Feature: search with valid keyword
  I want to test search functionallity with valid keyword

 @skip
  Scenario Outline: search with exact match keywords
    Given user on store manager page "https://store-manager-web-qa.azurewebsites.net/" link
    When user enter the credentail for login by Username as "amahadevaswamy@qwinix.io" and Password as "Parinith@0604"
    When user selected "<Retailer>" option
    When user click on search box and enter "<SearchWord>" keyword
    Then validate the outcomes is as per search result

 Examples: 
 |Retailer|SearchWord|
 |Walgreen|141|
 |Walmart|1410|

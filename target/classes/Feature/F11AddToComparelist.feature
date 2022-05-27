@regression

Feature: Add to comparelist
  Scenario: user add products to comparelist
    When user navigate to page and select catagory to put it in comparelist
    Then addtocomparelist and go to comparelist

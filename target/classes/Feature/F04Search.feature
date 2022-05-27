@regression

Feature: Search about product
  Scenario: Search about exist product
    When user enter the product in search bar or substring of product
    And choose from result of search the product
    And scroll to see the result

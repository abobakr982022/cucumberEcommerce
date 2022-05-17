@regression

Feature: Choose currency
  Scenario: user  Choose currency
    Given choose product from search
    And choose from result of search
    When user enter required currency
    And scroll down to see the price

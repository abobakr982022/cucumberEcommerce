@regression
Feature: user login
  Scenario: user login with valid data
Given user navigate to login page
    When user enter valid data
    Then login done

@regression
Feature: user should be register successfully

    Scenario: user register to website
    Given user navigate to registeration page
    When user enter data of registeration
    And user click on register button
    And user register successfully
    Then continue registeration

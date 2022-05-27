@regression

Feature: Reset password
  Scenario: Reset user password
    Given user navigate to login page to recover password
    When user press on forget password
    And Enter email to recover password
    And Press on Recover button
    Then confirm that this message is displayed "Email with instructions has been sent to you."
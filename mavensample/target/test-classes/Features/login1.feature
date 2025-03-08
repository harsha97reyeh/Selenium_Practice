Feature: feature to test facebook login

  Scenario: Check login is successful user details
    Given user is on facebook page
    When user enters login credientials
    And clicks on login button
    Then user is navigated to the facebook page

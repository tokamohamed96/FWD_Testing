Feature: user able to login
  Scenario: user able to login using valid data
    When user click on login button
    Then user enter valid data
    And user click on login
    Then user navigates to account
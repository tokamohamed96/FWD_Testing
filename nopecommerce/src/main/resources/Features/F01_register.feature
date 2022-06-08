Feature: user able to register
  Scenario: user able to register with valid data
    When user click on register button
    And user navigates to registration page
    Then user fill personal data
    And register
    Then user is registered successfully
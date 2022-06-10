Feature: User able to search for products

  Scenario: user able to search for products

    When user enter "Apple" in search field
    And navigates to search page
    Then Related Products Displayed

  Scenario: user able to search for products

    When user enter "AP_MBP_13" in search field
    And navigates to search page
    Then Related Products Displayed
    
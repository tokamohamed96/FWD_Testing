Feature: user able to add products to wishlist
  Scenario: validation message displayed after adding product to user's wishlist
    Given user check number of products
    When user click on which list button
    Then validation message displayed that product added
    And assert success message
    And wishlist products increased
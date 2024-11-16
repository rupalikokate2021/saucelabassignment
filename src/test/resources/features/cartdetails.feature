Feature: Cart details

@cartdetails
Scenario: Cart details
    Given I am on the Login Page
    When I enter valid username and password
    And I click on the Login button
    And I should see the landing page
    And I click on First item
    And I Add item to Cart
    And I should see the cart details
    Then I click on Cart Details

    


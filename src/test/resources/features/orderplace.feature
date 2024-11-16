Feature: order Placed

@singleitem
    Scenario: single item Order  place
    Given I am on the Login Page
    When I enter valid username and password
    And I click on the Login button
    And I should see the landing page
    And I click on First item
    And I Add item to Cart
    And I should see the cart details
    And I click on Cart Details
    And I click on Checkout
    And I enter valid firstname and lastname and zippostalcode
    And I click on continue
    And I click on finish

@multipleitem
 Scenario: multiple item Order  place
    Given I am on the Login Page
    When I enter valid username and password
    And I click on the Login button
    And I should see the landing page
    And I click on First item
    And I Add item to Cart
    And I add another item to cart
    And I should see the cart details
    And I click on Cart Details
    And I click on Checkout
    And I enter valid firstname and lastname and zippostalcode
    And I click on continue
    And I click on finish
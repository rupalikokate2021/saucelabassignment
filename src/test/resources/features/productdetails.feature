Feature: Product details

@Sortproduct
Scenario: add first item into cart details
    Given I am on the Login Page
    When I enter valid username and password
    And I click on the Login button
    And I should see the landing page
    Then I click on First item


@Sortproduct
Scenario: sorting product by price
    Given I am on the Login Page
    When I enter valid username and password
    And I click on the Login button
    And I should see the landing page
    Then I click on sort product by "<priceSortOrder>"

    Examples:
    | priceSortOrder      |
    | Name (A to Z)       |
    | Name (Z to A)       |
    | Price (low to high) |
    | Price (high to low) |
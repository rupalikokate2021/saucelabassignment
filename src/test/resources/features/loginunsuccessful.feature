 Feature: Login unsuccessful 
 
 @unsuccessful
  Scenario: Login unsuccessful
    Given I am on the Login Page
    When I enter invalid "<username>" and "<password>"
    And I click on the Login button
    Then I should see an error message

    Examples:
    | username                |      password      |
    | locked_out_user         |      secret_sauce  |
    | problem_user            |      secret_sauce1 |
    |                         |      secret_sauce  |
    | standard_user           |                    |
    |                         |                    |
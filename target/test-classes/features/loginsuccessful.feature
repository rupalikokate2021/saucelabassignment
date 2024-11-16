Feature: Login Successful

@successful
Scenario: Login Successful
    Given I am on the Login Page
    When I enter Valid "<username>" and "<password>"
    And I click on the Login button
    And I should see the landing page

Examples:
| username                |      password      |
| standard_user           |      secret_sauce  |
| problem_user            |      secret_sauce  |
| performance_glitch_user |      secret_sauce  |
Feature: Creating the new user/Validate the user creation


  Scenario: User creates a new account/user
    Given User is on the homepage
    When User clicks on Sign In
    And User creates new account
    Then New account is created
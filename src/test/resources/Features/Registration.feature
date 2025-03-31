@test
Feature: Registration Functionality
  
  @Register
  Scenario: User Sign Up successfully
    Given the user is on the Magento website
    When the user clicks on the create account link
    Then the user should be redirected to the create account page
    When the user fills in the generated details
    And the user clicks on the submit button
    Then the user should be successfully registered
    And the user signs out

    
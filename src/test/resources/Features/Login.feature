@test
Feature: Login Functionality
  
    @Login
  Scenario: User signs in successfully using valid credentials
    Given the user is on the Magento website
    When the user clicks on the Sign in link
    Then the user should be redirected to the Sign In page
    When the user enters the username and password
    And the user clicks on the Sign in button
    Then the user should be redirected to the homepage
    And the user signs out
    
     @Login
  Scenario: User signs in using invalid credentials
    Given the user is on the Magento website
    When the user clicks on the Sign in link
    Then the user should be redirected to the Sign In page
    When the user enters the invalid credentials
    And the user clicks on the Sign in button
    Then the user should see the error message
    
    @Login
  Scenario: User signs in using invalid email
    Given the user is on the Magento website
    When the user clicks on the Sign in link
    Then the user should be redirected to the Sign In page
    When the user enters the invalid email
    And the user clicks on the Sign in button
    Then the user should see the invalid email error message
    
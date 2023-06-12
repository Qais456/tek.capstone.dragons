@RetailSigIn/SignUpScenarios
Feature: Sign in/Sign Up Features

  Background: 
    Given User is on retail website
    When User click on Sign in option
    Then User should be logged in into Account

  @SignInRetail
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'Qaishaidari570@gmail.com' and password 'Parwan@123'
    And User click on login button

  @CreateAccountRetail
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email           | password        | confirmPassword |
      | Mcall | mcall@gmail.com | mcallmcall@1234 | mcallmcall@1234 |
    And User click on SignUp button

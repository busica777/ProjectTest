Feature: Login
  @sprint1   @regression  @t1
  Scenario: Verification of login functionality
   #Given user navigates to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in


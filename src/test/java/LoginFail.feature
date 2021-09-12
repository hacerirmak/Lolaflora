Feature: Login Fail

  Scenario: Login with incorrect email and password
    Given Navigate to login page
    And Enter the  user email
    And Enter the wrong pasword
    When Click login button
    Then Login failed
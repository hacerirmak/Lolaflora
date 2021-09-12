Feature:Login is Successful

  Scenario:Login with correct email and password
    Given Navigate to login page
    And Enter the  user email
    And Enter the user password
    When Click login button
    Then Successful login is check

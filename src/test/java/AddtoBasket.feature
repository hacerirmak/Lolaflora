Feature: Add to Basket

  Background: Login
    Given Navigate to login page
    And Enter the  user email
    And Enter the user password
    When Click login button
    Then Successful login is check

    Scenario Outline: Add to Basket
      Given Search for a district or a street
      And type "<city>"
      And select "<city>"
      And select gift and flower arrangemnets for Birthdays
      And select product
      And select the calender
      When Add to cart
      Then Product is added to cart

 Examples:
      | city |
      |Madrid, Spain|
@login
Feature: login
  As a user
  I want to see my home page

  @userA
  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter valid username
    And I enter valid password
    And I click login button
    Then I am on the home page

    @userB
    Scenario: As a user I can't login successfully
      Given I am on the login page
      When I enter invalid username
      And I enter valid password
      And I click login button
      Then I can see error message "Username and password do not match any user in this service"

  @userC
  Scenario: As a user I can't login successfully
    Given I am on the login page
    When I enter valid username
    And I enter invalid password
    And I click login button
    Then I can see error message "Username and password do not match any user in this service"

 @userD
 Scenario: As user successfully added product to cart
   Given I am on the login page
   When I enter valid username
   And I enter valid password
   And I click login button
   Then I am on the home page
   And I click product
   And I click add to cart


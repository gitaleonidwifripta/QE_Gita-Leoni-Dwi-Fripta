Feature: login ke sepulsa
As a user
In order to buy products
I want to login, select a product, and choose a payment method

Scenario: Login with valid credentials
Given I am on the login page
When I enter my valid email and password
And click on the login button
Then I should be redirected to the home page


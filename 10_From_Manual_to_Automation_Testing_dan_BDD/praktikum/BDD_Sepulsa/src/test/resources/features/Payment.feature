Feature: payment

Scenario: Select a payment method
  Given Considering I have added product then go to history page
  When I navigate to the checkout page
  And choose a payment method
  Then I have to look at the payment form as well as enter payment details and click the pay button

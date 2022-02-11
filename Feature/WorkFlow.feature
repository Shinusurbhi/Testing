
Feature: Workflow of demoblaze website

  @sanity 
  Scenario: Signup for the demoblaze website and try to place an order
    Given Signup for the demoblaze website with your credentials
    And Signin with the same credentials
    Then Click on a product of your choice for e.g "Sony vaio i5"
    Then Product page should get open with the product image 
    Then Click on the add to cart button
    
    



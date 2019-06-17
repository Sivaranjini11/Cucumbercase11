
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login as Admin and add HP Laptop
    Given I enter "Admin" as username
    And I enter "password456" as password
    When I click on login Button


    Scenario: Add to cart by User
    Given I enter "Lalitha" as credential for username
    And I enter "password123" as passwordcredential
    When I click on SignIn Button
    Then Home page is successfully displayed.
    When I enter headphone in search field and click on add to cart
    Then I  click on checkout
    Then I enter username and password for transaction
    And I fill all the description of the product
    Then the product is  added in the cart.
    
    
     Scenario: Adding Product Category by Admin
    When I enter Admin credentials admin page is displayed.
    Then I  click on Add Product
    Then I enter category name as "Electonics" 
    Then I entersubcategory name as "Headphone"
    Then I enter product name as "jabra11"
    Then I enter price as "$300"
    Then I enter quantity as "10"
    Then I enter brand name as "jabra"
    Then I enter description name as "Head Phone suitable for office"
    When I click on add product
    Then added by Admin successfully.
    
    
  
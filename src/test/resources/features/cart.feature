@Alexandru
Feature: Product description and Shopping Cart
Background: User launches the application url
  	Given User launches the application url

Scenario: Verify User can see empty cart without adding any product
  	When user clicks on the shopping cart
  	Then empty cart should be displayed

 Scenario: Verify User can see product description
  	When Enters the search term "Televizoare" in search box
  	Then products images should displayed after search
  	When user clicks on first product image
  	Then user can see the product description

Scenario: Verify User can add product to cart
  	When Enters the search term "mobile" in search box
  	Then products images should displayed after search
  	When user clicks on first product image
  	And user clicks on add to cart button
  	And click on the shopping cart icon
  	Then product should be added into the cart

Scenario: Verify User can delete product from the cart
  	When Enters the search term "Laptopuri" in search box
  	Then products images should displayed after search
  	When user clicks on first product image
  	When user clicks on add to cart button
  	And click on the shopping cart icon
  	Then product should be added into the cart
  	When user click on the delete product icon
  	Then product should be deleted from the cart
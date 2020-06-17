@asafeaniuc
Feature: WishLish functionality

  Background:
    Given user is on Home page
    And user clicks on 'electronics' Button and move to 'Category' page
    And user clicks on 'cell-phones' Button and move to 'SubCategory' page
    And user clicks on 'nokia-lumia-1020' Button and move to 'Product' page
    And user press on 'addToWish' Button
    And alert message is displayed
    And alert message is closed
    When user clicks on 'wishlist' HeaderButton and move to 'WishList' page


  Scenario: Add a product from to WishList
    When user press on 'addtocart' CheckBox
    And user press on 'addtocart' Button
    Then selected 'Nokia Lumia 1020' from Wishlist is added successfully to ShoppingCart

  Scenario Outline: Validate access to subcategory
    Given user is on Home page
    When user clicks on '<category>' Button and move to 'Category' page
    And user clicks on '<subcategory>' Button and move to 'SubCategory' page
    Then '<subcategoryName>' subcategory is displayed

    Examples:
      | category    | subcategory | subcategoryName |
      | electronics | cell-phones | Cell phones     |
      | apparel     | shoes       | Shoes           |
@asafeaniuc
Feature: WishLish functionality

#  Scenario: Remove a product from WishList
#    Given user is on Home page
#    And user clicks on 'cell-phones' Button and move to 'SubCategory' page
#    And user clicks on 'nokia-3310-3g' Button and move to 'Adauga in cos'
#    And user press on 'cos meu' Buttonv
#    When user press on 'remove'
#    Then product is removed successfully from list
#
#  Scenario: Add a product from WishList to Cart
#    Given user is on Home page
#    And user clicks on 'cell-phones' Button and move to 'SubCategory' page
#    And user clicks on 'nokia-3310-3g' Button and move to 'Adauga in cos'
#    And user press on 'cos meu' Buttonv
#    When user press on 'addtocart' CheckBox
#    And user fulfill requested information
#    Then user can press on 'buy' Button

  Scenario: Logo presence on OrangeHRM home Page
    Given I lounch chrome browser
    When I open zap hamepage
    Then I verify that the logo present on page
    And clouse browser


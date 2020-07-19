
Feature: howToCommand page verifications

Scenario: Verify User can navigate to howtoCommand page and change languages
  	Given User launches the application url
	When User clicks on the howtoCommand? icon
	Then User is redirected to the howtoCommand page
	Then the header of displayed page is "Cum comand"
	Then on the top of Cum_comang page is displayed the button changing the language
	Then on the bottom of Cum_comang page is displayed the button changing the language
  	When User clicks on changing language button from the top of page
	Then the header of displayed page is "Как заказать"
	When User clicks on changing language button from the bottom of page
	Then the header of displayed page is "Cum comand"

Scenario: Verify user can navigate to landing page from 'howtoCommand' page
	Given User launches the application url
	When User clicks on the howtoCommand? icon
	Then User is redirected to the howtoCommand page
	When User clicks on home logo
	Then User is redirected to the home page
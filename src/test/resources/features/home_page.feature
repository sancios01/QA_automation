@Olga
Feature: Home page verifications
	Background: User launches the application url
		Given User launches the application url

Scenario: Verify User can see contact links in footer
  	Then facebook link should be displayed footer
  	Then twitter link should be displayed in footer
  	Then contact email should displayed in footer
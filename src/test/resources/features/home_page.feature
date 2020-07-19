@regression
Feature: Home page verifications

Scenario: Verify User can see contact links in footer
  	Given User launches the application url
  	Then facebook link should be displayed footer
  	Then twitter link should be displayed in footer
  	Then contact email should displayed in footer
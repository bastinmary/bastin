Feature: Post on Facebook wall

Scenario: New Post on my wall
	Given User Launch chrome browser
	When user opens URL "http://Facebook.com/login"
	And user enters Email as "bastinmary@gmail.com" and Password as "Elshadah1"
	And Click on Login
	And Add posting "Stay Home Safe"
	And Close Browser
	
Scenario Outline: New Post on my wall
	Given User Launch chrome browser
	When user opens URL "http://Facebook.com/login"
	And user enters Email as "bastinmary@gmail.com" and Password as "Elshadah1"
	And Click on Login
	And Add posting "<m>"
	And Close Browser

Examples:
	|	msg	|
	|	Hi!	|
	|	Hello	|
	
Feature: Login

Scenario: Login into Facebook
	Given User Launch chrome browser
	When user opens URL "http://Facebook.com/login"
	And user enters Email as "bastinmary@gmail.com" and Password as "Elshadah1"
	And Click on Login
	When User Click on "Bastinmary Suresh"
	And Close Browser


Scenario Outline: Login into Facebook
	Given User Launch chrome browser
	When user opens URL "http://Facebook.com/login"
	And user enters Email as "<email>" and Password as "<pwd>"
	And Click on Login
	When User Click on "Bastinmary Suresh"
	And Close Browser


Examples:
	|	email	|	pwd	|	
	|	bastinmary@gmail.com	|	Elshadah1	|
	|	abc@gmail.com	|	xyz	|	

	
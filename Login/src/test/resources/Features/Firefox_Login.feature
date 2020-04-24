Feature: Login

Scenario: Login into Facebook
	Given User Launch FireFox browser
	When user opens URL "http://Facebook.com/login"
	And user enters Email as "bastinmary@gmail.com" and Password as "Elshadah1"
	And Click on Login
	When User Click on "Bastinmary Suresh"
	And Close Browser
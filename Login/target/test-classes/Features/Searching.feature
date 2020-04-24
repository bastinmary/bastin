Feature: Searching on Facebook wall

Scenario: Searching Name on FB
	Given User Launch chrome browser
	When user opens URL "http://Facebook.com/login"
	And user enters Email as "bastinmary@gmail.com" and Password as "Elshadah1"
	And Click on Login
	And Search on FB "Suresh"
	And Close Browser
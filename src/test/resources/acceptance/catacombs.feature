Feature: Katacombs
	"""
	Given I *arrange* things in a certain way
	When I *act* on the system
	Then I can *assert* that things are a certain way
	"""

	Scenario: Start-Up
		Given a new game
		When the game starts
		Then the user is at the start location

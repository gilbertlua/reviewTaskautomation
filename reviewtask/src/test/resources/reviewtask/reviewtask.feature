Feature: Review  Task

Scenario: Launch the login page
	Given Login to page "dhea.arvie@formulatrix.com" "123456"
	Then is success to dashboard page	

Scenario: Load the review task page
	When load to review task page
	Then the review task page loaded
Scenario: Select desired period
	When load to review task page
	And select the period
	Then the select period can be selected

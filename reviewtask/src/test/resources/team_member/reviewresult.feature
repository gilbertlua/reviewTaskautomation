Feature: Review result

Scenario: Launch the login page
	Given Login to page "dhea.arvie@formulatrix.com" "123456"
	Then is success to dashboard page	
Scenario: Load the review result page
    When load to review result page
	Then the review result page loaded  
Scenario: Select desired period in review result
	When load to review result page
	And select the period in review result
	Then the select period can be selected in review result
Scenario: Click review button in review result
	When load to review result page
	And select the period in review result
	And click the view button
	Then view button can be clicked and view page is loaded	
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
Scenario: Click review button
	When load to review task page
	And select the period
	And click the review button
	Then review button can be clicked and review page is loaded
Scenario: Review and fill all question
	When load to review task page
	And select the period
	And click the review button
	And fill score question
	And fill essay question "its use to fill question"
	And click next button
	And fill score question
	And fill essay question "its use to fill question"
	And click submit button
	Then success fill all question
Scenario: Reset all resettable questions	
	When load to review task page
	And select the period
	And click the review button
	And reset all resettable questions
	And click next button
	And reset all resettable questions
	And click next button
	And validate submit
	
Feature: Consolidation page

Scenario: Launch the login page
	Given Login to page "dhea.arvie@formulatrix.com" "123456"
	Then is success to dashboard page	
Scenario: Load the consolidation page
    When load to consolidation page
	Then the consolidation page loaded  
Scenario: View the consolidated review	
	When load to consolidation page
	And is have consolidated review then click the view button
Scenario: Generate pdf file
	When load to consolidation page
	And is have consolidated review then generate pdf file
	
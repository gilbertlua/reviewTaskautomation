Feature: Review task 
  Scenario: Login to page as peer
    Given load login page
    When login using "dhea.arvie@formulatrix.com" and "123456"
    Then dasboard page loaded

  Scenario: Load to review task
    When Load to review task page
    Then review task page can be loaded 
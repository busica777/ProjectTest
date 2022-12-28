Feature: Employee Job Details


 @t2
   Scenario:verify Job Details
   #Given user navigates to HRMS application
  When user enters valid username and valid password
   Then  user clicks on login button
    When user clicks on PIM option
  Then  user selects employee
    Then user clicks on job button
    And user clicks on Edit button
     And Job Title dropdown field is displayed and user can select values from there
     And Employment Status dropdown field is displayed and user can select values from there
     And Job Category dropdown field is displayed and user can select values from there
     And Joined Date calendar is displayed and user can pick values from there
     And Sub Unit dropdown field is displayed and user can select values from there
     And Location dropdown field is displayed and user can select values from there
     And Start Date calendar is displayed and user can pick values from there
     And End Date calendar is displayed and user can pick values from there
     And Contract Details file upload that accepts file up to 1MB
  Then user clicks on save button
  Then employees current job details are added sucessfully
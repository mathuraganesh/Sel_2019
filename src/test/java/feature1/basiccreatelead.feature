Feature: CreateLead for Leaftaps Application

Scenario: TC001_Positive_CreateLead_Flow
Given Launch the Browser
And Load the URL
And Maximise the Browser
And Set the Timeouts
And Enter Username as Demosalesmanager
And Enter Password as crmsfa
When Click on the Login Button
Given Click CRMSFA Link
And Click on the Leads Tab
And Click on the Create Lead Menu
And Enter the Company Name as IBM
And Enter the First Name as Mathura
And Enter the Last Name as Ganesh
When Click on the Create Lead Button
Then Verify Lead Creation is success
Then Close the Browser
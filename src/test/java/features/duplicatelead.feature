Feature: Duplicate the Lead

Background: 
Given Launch the Browser2
And Load the URL2
And Maximise the Browser2
And Set the Timeouts2

Scenario Outline: TC003_DuplicateLead
And Enter Username as Demosalesmanager2
And Enter Password as crmsfa2
When Click on the Login Button2
Given Click CRMSFA Link2
And Click on the Leads Tab2
And Click on the Find Lead Menu2
And Click on the Email Tab
And Enter the EmailID To Be Duplicate as <EmailID>
And Click on the Find Lead Button2
And Get the FirstName
And Click on the LeadID Link2
And Click the Duplicate Button
When Click on the Create Lead Button2
And Get the DuplicateName
Then Verify the DuplicateLead
Then Close the Browser2

Examples:
|EmailID|
|mathura@gmail.com|
|divya@gmail.com|
|bhagya@gmail.com|
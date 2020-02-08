Feature: Edit The Lead

Background:
Given Launch the Browser1
And Load the URL1
And Maximise the Browser1
And Set the Timeouts1

Scenario Outline: TC002_Positive_EditLead_Flow
And Enter Username as Demosalesmanager1
And Enter Password as crmsfa1
When Click on the Login Button1
Given Click CRMSFA Link1
And Click on the Leads Tab1
And Click on the Find Lead Menu
And Enter the First Name To Be Edit as <fname>
And Click on the Find Lead Button
And Click on the LeadID Link
And Click the Edit Button
And Enter Company Name To Be Update as <cname>
When Click on the Update Button
Then Verify the Company Name
Then Close the Browser1

Examples:
|fname|cname|
|Mathura|HCL|
|Divya|TCS|
|Bhagya|CTS|


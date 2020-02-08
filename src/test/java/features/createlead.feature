Feature: CreateLead for Leaftaps Application

Background:
Given Launch the Browser
And Load the URL
And Maximise the Browser
And Set the Timeouts


Scenario Outline: TC001_Positive_CreateLead_Flow
And Enter Username as Demosalesmanager
And Enter Password as crmsfa
When Click on the Login Button
Given Click CRMSFA Link
And Click on the Leads Tab
And Click on the Create Lead Menu
And Enter the Company Name as <cname>
And Enter the First Name as <fname>
And Enter the Last Name as <lname>
And Select the Source as <Source>
And Enter the EmailID as <EmailID>
And Enter the PhoneNO as <PhoneNO>
When Click on the Create Lead Button
Then Verify Lead Creation is success
Then Close the Browser

Examples:
|cname|fname|lname|Source|EmailID|PhoneNO|
|IBM|Mathura|Ganesh|LEAD_EMPLOYEE|mathura@gmail.com|9962066735|
|CGI|Divya|Lakshmi|LEAD_EMPLOYEE|divya@gmail.com|9003187314|
|Citi Bank|Bhagya|Lakshmi|LEAD_EMPLOYEE|bhagya@gmail.com|9003187314|

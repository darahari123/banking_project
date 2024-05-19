
Feature: validate functionalies of a bank Application


Scenario: Adding customer to a bank by a bank manager
Given bank manager should be on application
When click on bank manager login button
Then  page redirects to Add customer page
When  click on add customer button
When enter first name,last name and post code
When click on add customer
When selecting a registered customer name
And selecting a currency
And click on process button
When click on Customer button
And select cuctomer name to show customer details
And click on Home button
When click on customer login
And Select registerd customer name and click on login
And click on deposit button and enter amount and click on Deposit button
And click on withdrawl button and enter amipunt and select withdraw button
And click on Transactions button to see all transactions made by cuctomer
Then it is redirected to transaction page
And click on logout button
Then it is redirected to home page





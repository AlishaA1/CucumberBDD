Feature: Login Action
Scenario: Verify Login with valid data
Given user is on home page
When user clicks on sign in
Then Verify title in next page as Yahoo
When user enters user name and passdword clicks on submit button
Then Verify user and display message Login successful
And Logout

Feature: Login Action
Scenario: Verify Login with invalid data
Given user is on home page
When user clicks on sign in
Then Verify title in next page as Yahoo
When user enters invalid user name and passdword clicks on submit button
Then Verify user and display message Login failed
And Close

Feature: Login page test with all parameters
Scenario Outline:  login facebook
Given Login to sample process
When  User enter <username> and <Password> 
And Clicks on the login button
Then User landing on main page
Then clicks on the TSHIRTS Tab
And close the browser
Examples: 
|username|Password|
|ganesh11@gmail.com|god@1188|




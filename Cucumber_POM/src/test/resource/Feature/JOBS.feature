Feature: I am Automating OrangeHRM APP

Background: Common Steps

Given User launch the chrome browser
Then User Enter the URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: Job - I am creating a Job Record

When user enter Login id as "Admin" and Login password as "admin123"
And user Click the admin
Then user Enter the Jobs 
But user choose the Job tittle
Then click the Add data
When user enter the Job tittle as "Python10233" and Job Description "Python_Desc10233" and Job note "Python_Note10233"
And user enter the save data successfully
When user click the Profile 
Then click on logout
Then user close the browser

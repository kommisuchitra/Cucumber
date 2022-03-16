@tag
Feature: Admin Login

 i want to use this template to check admin login in orangeHRM application

@tag1
Scenario: check Admin Login

Given i open browser with url "https://opensource-demo.orangehrmlive.com/"
Then i should see login page
When i enter username as "Admin"
And i enter password as "admin123"
And i click login
Then i should see admin module
When i click on Logout
Then i should see login page
When i close browser
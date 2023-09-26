 Feature: To validate the login functionality of gmail application

Scenario: To validate login with valid email
Given To launch chrome browser and maximise window
When  To launch the url of the gmail application
And To pass the valid email in email field
And To check whether navigate to home page or not
Then To close the chrome browser

Scenario Outline:to validate the positive and negative combination of login Functionality
Given User has to launch the chrome browser and maximise window
When User has to launch the url of the gmail app
And User has to pass the valid data "<Emaildatas>" in email field
And User has to click next 
Then User has to close the chrome browser


Examples:
|         Emaildatas         |          
| Santhiya12345@gmail.com    |
| Prasanth301191@gmail.com   | 
| Prasanya20@gmail.com       |
| Hi309198@gmail.com         |









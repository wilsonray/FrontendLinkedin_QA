Feature: Login
  As QA Automation
  I want to test the login interface
  To validate the Frontend response

  Scenario: Login Successful
    Given that Wilson Join Linkedin
    When he enters the credentials
      |user                    |password |
      |nevermore-xd@hotmail.com|roflmao25|
    Then the user should see the name Welcome, Jenkins!
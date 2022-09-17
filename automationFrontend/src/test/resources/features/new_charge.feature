Feature: Enter position
  As QA Automation
  I want to enter a charge
  To update the profile

  Background: Login with the correct data
    Given that Wilson Join Linkedin
    When he enters the credentials
      |user                    |password |
      |nevermore-xd@hotmail.com|roflmao25|

    Scenario: Register a new charge
      When Add the new job
      |jobTitle|employmentType|companyName|location|startMonth|startYear|industry                            |profileHeadline|
      |Engineer|Full-time     |Google     |Peru    |5         |2021     |Technology, Information and Internet|IT             |
      Then I should see it in the profile
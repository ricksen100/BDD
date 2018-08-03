Feature: Github Login
  I want to login to github

  Scenario: Login into github
    Given I want to login into github
    When I check the login
    Then the result should be logged in

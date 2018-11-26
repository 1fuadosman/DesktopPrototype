Feature: LoginFeature
    This feature is responsible for testing all the scenarios for Login of application

  Scenario: Check Login with correct username and password
    Given I see application opened
    When I click login link
    And I enter UserName and Password
      | UserName | Password |
      | admin    | password |
    Then I click login button
    And I should see the username with hello

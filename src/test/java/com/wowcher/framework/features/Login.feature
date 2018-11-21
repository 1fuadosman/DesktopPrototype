Feature: LoginFeature
    This feature is responsible for testing all the scenarios for Login of application

  Scenario: Check Login with correct username and password
    Given I have navigated to the application
    And I see application opened
    Then I click logom link
    When I enter UserName and Password
      | UserName | Password |
      | admin    | password |
    Then I click login button
    Then I should see the username with hello

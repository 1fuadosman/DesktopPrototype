Feature: Employee
  Responsible for verifying benefits, create employee,
  Delete employee and check if the functionality works

  Scenario: Create Employee with all details
    Given I see application opened
    When I click login link
    And I enter UserName and Password
      | UserName | Password |
      | admin    | password |
    Then I click login button
    And I should see the username with hello
    And I click employeeLIst link
    Then I click create new button
    And I enter following details
      | Name     | Salary | DurationWorked | Grade | Email                   |
      | AutoUser | 4000   | 30             | 1     | fuadwowcherls@gmail.com |
    And I click create button
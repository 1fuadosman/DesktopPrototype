$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Employee.feature");
formatter.feature({
  "line": 1,
  "name": "Employee",
  "description": "Responsible for verifying benefits, create employee,\nDelete employee and check if the functionality works",
  "id": "employee",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14069363278,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Create Employee with all details",
  "description": "",
  "id": "employee;create-employee-with-all-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I see application opened",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click login link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter UserName and Password",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 10
    },
    {
      "cells": [
        "admin",
        "password"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the username with hello",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click employeeLIst link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click create new button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I enter following details",
  "rows": [
    {
      "cells": [
        "Name",
        "Salary",
        "DurationWorked",
        "Grade"
      ],
      "line": 17
    },
    {
      "cells": [
        "AutoUser",
        "4000",
        "30",
        "1"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click create button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iSeeApplicationOpened()"
});
formatter.result({
  "duration": 308736270,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginLink()"
});
formatter.result({
  "duration": 1112303129,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterUserNameAndPassword(DataTable)"
});
formatter.result({
  "duration": 96244621,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginButton()"
});
formatter.result({
  "duration": 758423852,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheUsernameWithHello()"
});
formatter.result({
  "duration": 17514451,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.iClickEmployeeLIstLink()"
});
formatter.result({
  "duration": 409932406,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.iClickCreatenewButton()"
});
formatter.result({
  "duration": 671085591,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.iEnterFollowingDetails(DataTable)"
});
formatter.result({
  "duration": 235081394,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.iClickCreateButton()"
});
formatter.result({
  "duration": 729803753,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "  This feature is responsible for testing all the scenarios for Login of application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12425024289,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Check Login with correct username and password",
  "description": "",
  "id": "loginfeature;check-login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I see application opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter UserName and Password",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 8
    },
    {
      "cells": [
        "admin",
        "password"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should see the username with hello",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iSeeApplicationOpened()"
});
formatter.result({
  "duration": 340536092,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginLink()"
});
formatter.result({
  "duration": 745026853,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterUserNameAndPassword(DataTable)"
});
formatter.result({
  "duration": 96398280,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginButton()"
});
formatter.result({
  "duration": 954956561,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheUsernameWithHello()"
});
formatter.result({
  "duration": 33170945,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking functionality",
  "description": "",
  "id": "hotel-booking-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "User login to the application",
  "description": "",
  "id": "hotel-booking-functionality;user-login-to-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user enter \"\u003cUsername\u003e\"  as username",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enter  \"\u003cPassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User validate the username and password",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "hotel-booking-functionality;user-login-to-the-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 21,
      "id": "hotel-booking-functionality;user-login-to-the-application;;1"
    },
    {
      "cells": [
        "AAA",
        "1234"
      ],
      "line": 22,
      "id": "hotel-booking-functionality;user-login-to-the-application;;2"
    },
    {
      "cells": [
        "BBB",
        "2222"
      ],
      "line": 23,
      "id": "hotel-booking-functionality;user-login-to-the-application;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7819264,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User login to the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"vinovicky\"  as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter  \"Jan@2020\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User validate the username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 15802768384,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinovicky",
      "offset": 12
    }
  ],
  "location": "stepdefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 313274880,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jan@2020",
      "offset": 13
    }
  ],
  "location": "stepdefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 122660352,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_validate_the_username_and_password()"
});
formatter.result({
  "duration": 1218159104,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User login to the application",
  "description": "",
  "id": "hotel-booking-functionality;user-login-to-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user enter \"AAA\"  as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enter  \"1234\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User validate the username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 371446784,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 12
    }
  ],
  "location": "stepdefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 123698176,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 13
    }
  ],
  "location": "stepdefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 82675712,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_validate_the_username_and_password()"
});
formatter.result({
  "duration": 776225280,
  "status": "passed"
});
formatter.after({
  "duration": 395776,
  "status": "passed"
});
formatter.before({
  "duration": 121344,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User login to the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"vinovicky\"  as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter  \"Jan@2020\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User validate the username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 363603456,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinovicky",
      "offset": 12
    }
  ],
  "location": "stepdefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 131471872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jan@2020",
      "offset": 13
    }
  ],
  "location": "stepdefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 92710912,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_validate_the_username_and_password()"
});
formatter.result({
  "duration": 753405952,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User login to the application",
  "description": "",
  "id": "hotel-booking-functionality;user-login-to-the-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user enter \"BBB\"  as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enter  \"2222\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User validate the username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 395609088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BBB",
      "offset": 12
    }
  ],
  "location": "stepdefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 111964160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2222",
      "offset": 13
    }
  ],
  "location": "stepdefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 80522752,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_validate_the_username_and_password()"
});
formatter.result({
  "duration": 765371392,
  "status": "passed"
});
formatter.after({
  "duration": 86528,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adopting_puppies.feature");
formatter.feature({
  "line": 2,
  "name": "Adopting puppies",
  "description": "",
  "id": "adopting-puppies",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@requires_browser"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Background:"
    },
    {
      "line": 5,
      "value": "#\tGiven I on app"
    },
    {
      "line": 6,
      "value": "#"
    },
    {
      "line": 7,
      "value": "#Scenario: Fill the form"
    },
    {
      "line": 8,
      "value": "#When I fill the form"
    },
    {
      "line": 9,
      "value": "#|username|password|"
    },
    {
      "line": 10,
      "value": "#|pranav|pass|"
    },
    {
      "line": 11,
      "value": "#Then able to login"
    },
    {
      "line": 12,
      "value": "#"
    },
    {
      "line": 13,
      "value": "#Scenario: Fill the form"
    },
    {
      "line": 14,
      "value": "#Given I navigated to home page"
    },
    {
      "line": 15,
      "value": "#When I fill the form"
    },
    {
      "line": 16,
      "value": "#|username|password|"
    },
    {
      "line": 17,
      "value": "#|pranav1|pass|"
    },
    {
      "line": 18,
      "value": "#Then not able to login"
    },
    {
      "line": 19,
      "value": "#"
    },
    {
      "line": 20,
      "value": "#Scenario: Fill the form"
    },
    {
      "line": 21,
      "value": "#Given I navigated to home page"
    },
    {
      "line": 22,
      "value": "#And I navigated to account page"
    },
    {
      "line": 23,
      "value": "#When I fill the form"
    },
    {
      "line": 24,
      "value": "#|username|password|"
    },
    {
      "line": 25,
      "value": "#|pranav1|pass|"
    },
    {
      "line": 26,
      "value": "#Then not able to login"
    },
    {
      "line": 29,
      "value": "#"
    },
    {
      "line": 30,
      "value": "#"
    },
    {
      "line": 31,
      "value": "#"
    },
    {
      "line": 32,
      "value": "#"
    },
    {
      "line": 33,
      "value": "#Scenario Outline: Fill the form"
    },
    {
      "line": 34,
      "value": "#Given I on app"
    },
    {
      "line": 35,
      "value": "#When I fill the form"
    },
    {
      "line": 36,
      "value": "#|username|password|"
    },
    {
      "line": 37,
      "value": "#|\u003cuser\u003e|\u003cpassword\u003e|"
    },
    {
      "line": 38,
      "value": "#Then \u003cflag\u003e able to login"
    },
    {
      "line": 39,
      "value": "#"
    },
    {
      "line": 40,
      "value": "#Examples:"
    },
    {
      "line": 41,
      "value": "#|user|password|flag|"
    },
    {
      "line": 42,
      "value": "#|pranav|password||"
    },
    {
      "line": 43,
      "value": "#|pranav1|password|not|"
    }
  ],
  "line": 46,
  "name": "Adopting a puppy",
  "description": "",
  "id": "adopting-puppies;adopting-a-puppy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 47,
  "name": "I am on the puppy adoption site \"\u003cBrowserName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "I select \"\u003cpuppy_name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "add the puppy to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I proceed to the checkout",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "enter \"\u003cname\u003e\" in the name field",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "enter \"\u003caddress\u003e\" in the address field",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "enter \"\u003cemail\u003e\" in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "select \"\u003cpay_type\u003e\" from the pay type",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click the Place Order button",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I should see \"Thank you for adopting a puppy!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "I get a puppy",
  "keyword": "And "
});
formatter.examples({
  "line": 59,
  "name": "",
  "description": "",
  "id": "adopting-puppies;adopting-a-puppy;",
  "rows": [
    {
      "cells": [
        "BrowserName",
        "name",
        "address",
        "email",
        "pay_type",
        "puppy_name"
      ],
      "line": 60,
      "id": "adopting-puppies;adopting-a-puppy;;1"
    },
    {
      "cells": [
        "chrome_42_VISTA",
        "Chrys",
        "123 Main",
        "chrys@example.com",
        "Credit card",
        "Brook"
      ],
      "line": 61,
      "id": "adopting-puppies;adopting-a-puppy;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 193949393,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "Adopting a puppy",
  "description": "",
  "id": "adopting-puppies;adopting-a-puppy;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@requires_browser"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "I am on the puppy adoption site \"chrome_42_VISTA\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "I select \"Brook\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "add the puppy to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I proceed to the checkout",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "enter \"Chrys\" in the name field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "enter \"123 Main\" in the address field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "enter \"chrys@example.com\" in the email field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "select \"Credit card\" from the pay type",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click the Place Order button",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I should see \"Thank you for adopting a puppy!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "I get a puppy",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome_42_VISTA",
      "offset": 33
    }
  ],
  "location": "Adopting_puppiesSteps.i_am_on_the_puppy_adoption_site(String)"
});
formatter.result({
  "duration": 11636113863,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brook",
      "offset": 10
    }
  ],
  "location": "Adopting_puppiesSteps.i_select(String)"
});
formatter.result({
  "duration": 497964914,
  "status": "passed"
});
formatter.match({
  "location": "Adopting_puppiesSteps.add_the_puppy_to_the_shopping_cart()"
});
formatter.result({
  "duration": 546275866,
  "status": "passed"
});
formatter.match({
  "location": "Adopting_puppiesSteps.i_proceed_to_the_checkout()"
});
formatter.result({
  "duration": 422729162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chrys",
      "offset": 7
    }
  ],
  "location": "Adopting_puppiesSteps.enter_in_the_name_field(String)"
});
formatter.result({
  "duration": 88846325,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123 Main",
      "offset": 7
    }
  ],
  "location": "Adopting_puppiesSteps.enter_in_the_address_field(String)"
});
formatter.result({
  "duration": 80546903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chrys@example.com",
      "offset": 7
    }
  ],
  "location": "Adopting_puppiesSteps.enter_in_the_email_field(String)"
});
formatter.result({
  "duration": 86340848,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credit card",
      "offset": 8
    }
  ],
  "location": "Adopting_puppiesSteps.select_from_the_pay_type(String)"
});
formatter.result({
  "duration": 275800564,
  "status": "passed"
});
formatter.match({
  "location": "Adopting_puppiesSteps.i_click_the_Place_Order_button()"
});
formatter.result({
  "duration": 456878326,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for adopting a puppy!",
      "offset": 14
    }
  ],
  "location": "Adopting_puppiesSteps.i_should_see(String)"
});
formatter.result({
  "duration": 99800896,
  "status": "passed"
});
formatter.match({
  "location": "Adopting_puppiesSteps.i_get_a_puppy()"
});
formatter.result({
  "duration": 164209,
  "status": "passed"
});
formatter.after({
  "duration": 1929879973,
  "status": "passed"
});
});
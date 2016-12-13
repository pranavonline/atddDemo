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
  "line": 4,
  "name": "Adopting a puppy",
  "description": "",
  "id": "adopting-puppies;adopting-a-puppy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the puppy adoption site \"\u003cBrowserName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select \"\u003cpuppy_name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "add the puppy to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I proceed to the checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter \"\u003cname\u003e\" in the name field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter \"\u003caddress\u003e\" in the address field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter \"\u003cemail\u003e\" in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select \"\u003cpay_type\u003e\" from the pay type",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click the Place Order button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see \"Thank you for adopting a puppy!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I get a puppy",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
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
      "line": 18,
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
      "line": 19,
      "id": "adopting-puppies;adopting-a-puppy;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 184379337,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
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
  "line": 5,
  "name": "I am on the puppy adoption site \"chrome_42_VISTA\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select \"Brook\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "add the puppy to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I proceed to the checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter \"Chrys\" in the name field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter \"123 Main\" in the address field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter \"chrys@example.com\" in the email field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select \"Credit card\" from the pay type",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click the Place Order button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see \"Thank you for adopting a puppy!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
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
  "duration": 14256599836,
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
  "duration": 546121560,
  "status": "passed"
});
formatter.match({
  "location": "Adopting_puppiesSteps.add_the_puppy_to_the_shopping_cart()"
});
formatter.result({
  "duration": 950838677,
  "status": "passed"
});
formatter.match({
  "location": "Adopting_puppiesSteps.i_proceed_to_the_checkout()"
});
formatter.result({
  "duration": 754645383,
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
  "duration": 155734540,
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
  "duration": 95259150,
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
  "duration": 146608624,
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
  "duration": 274128557,
  "status": "passed"
});
formatter.match({
  "location": "Adopting_puppiesSteps.i_click_the_Place_Order_button()"
});
formatter.result({
  "duration": 763010128,
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
  "duration": 88517664,
  "status": "passed"
});
formatter.match({
  "location": "Adopting_puppiesSteps.i_get_a_puppy()"
});
formatter.result({
  "duration": 201411,
  "status": "passed"
});
formatter.after({
  "duration": 2256835457,
  "status": "passed"
});
});
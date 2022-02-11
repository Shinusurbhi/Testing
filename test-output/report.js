$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/WorkFlow.feature");
formatter.feature({
  "line": 2,
  "name": "Workflow of demoblaze website",
  "description": "",
  "id": "workflow-of-demoblaze-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Signup for the demoblaze website and try to place an order",
  "description": "",
  "id": "workflow-of-demoblaze-website;signup-for-the-demoblaze-website-and-try-to-place-an-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Signup for the demoblaze website with your credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Signin with the same credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on a product of your choice for e.g \"Sony vaio i5\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Product page should get open with the product image",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on the add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "demoblazeStepDefinitions.signup_for_the_demoblaze_website_with_your_credentials()"
});
formatter.result({
  "duration": 785231000,
  "error_message": "java.lang.NoSuchMethodError: \u0027com.google.common.collect.ImmutableMap com.google.common.collect.ImmutableMap.of(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)\u0027\r\n\tat org.openqa.selenium.chrome.AddHasCasting.getAdditionalCommands(AddHasCasting.java:38)\r\n\tat org.openqa.selenium.chrome.ChromeDriver$ChromeDriverCommandExecutor.getExtraCommands(ChromeDriver.java:123)\r\n\tat org.openqa.selenium.chrome.ChromeDriver$ChromeDriverCommandExecutor.\u003cinit\u003e(ChromeDriver.java:118)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:106)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:93)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:48)\r\n\tat stepDefinitions.demoblazeStepDefinitions.signup_for_the_demoblaze_website_with_your_credentials(demoblazeStepDefinitions.java:32)\r\n\tat ✽.Given Signup for the demoblaze website with your credentials(./Feature/WorkFlow.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "demoblazeStepDefinitions.signin_with_the_same_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sony vaio i5",
      "offset": 43
    }
  ],
  "location": "demoblazeStepDefinitions.click_on_a_product_of_your_choice_for_e_g(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "demoblazeStepDefinitions.product_page_should_get_open_with_the_product_image()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "demoblazeStepDefinitions.click_on_the_add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
});
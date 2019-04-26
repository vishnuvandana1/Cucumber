$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/demowebshop.feature");
formatter.feature({
  "name": "DemoWebShop Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "RegisterScenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of the demowebshop",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterStepDef.url_of_the_demowebshop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the data for registration",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStepDef.user_enters_the_data_for_registration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDef.user_is_registered_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
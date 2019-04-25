$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/testmeapp.feature");
formatter.feature({
  "name": "TetsMeApp Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "AdminUser Scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of the TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "TestMeStepDef.url_of_the_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter admin as username",
  "keyword": "When "
});
formatter.match({
  "location": "TestMeStepDef.user_enter_admin_as_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Password456 as password",
  "keyword": "And "
});
formatter.match({
  "location": "TestMeStepDef.user_enter_Password_as_password(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in home page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestMeStepDef.user_is_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Product scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Select add product",
  "keyword": "Given "
});
formatter.match({
  "location": "TestMeStepDef.select_add_product()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using css selector\u003dbutton [type\u003d\u0027button\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BDC6-DX-3QH7N62\u0027, ip: \u002710.116.240.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat skeleton.TestMeStepDef.select_add_product(TestMeStepDef.java:53)\r\n\tat ✽.Select add product(file:src/test/resources/skeleton/testmeapp.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "admin enters the details",
  "keyword": "When "
});
formatter.match({
  "location": "TestMeStepDef.admin_enters_the_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "product is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "TestMeStepDef.product_is_successfully_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});
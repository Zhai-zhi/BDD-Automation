$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.features");
formatter.feature({
  "line": 1,
  "name": "Web Browsing Login",
  "description": "",
  "id": "web-browsing-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Scenario",
  "description": "",
  "id": "web-browsing-login;login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user to open home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to input username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user to click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user verify login successful",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.openHomePage()"
});
formatter.result({
  "duration": 16034594198,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.inputPasswordandUser()"
});
formatter.result({
  "duration": 818841253,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.submitButton()"
});
formatter.result({
  "duration": 946143267,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.verifyText()"
});
formatter.result({
  "duration": 210528286,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.closeBrowser()"
});
formatter.result({
  "duration": 797884055,
  "status": "passed"
});
});
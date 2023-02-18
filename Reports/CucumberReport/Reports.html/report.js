$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Elements.feature");
formatter.feature({
  "name": "Elements",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Text Box",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on elements page",
  "keyword": "Given "
});
formatter.match({
  "location": "TextBoxSteps.userIsOnElementsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click text box",
  "keyword": "And "
});
formatter.match({
  "location": "TextBoxSteps.userClickTextBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write full name",
  "keyword": "And "
});
formatter.match({
  "location": "TextBoxSteps.userWriteFullName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write email",
  "keyword": "And "
});
formatter.match({
  "location": "TextBoxSteps.userWriteEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write current address",
  "keyword": "And "
});
formatter.match({
  "location": "TextBoxSteps.userWriteCurrentAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click submit",
  "keyword": "When "
});
formatter.match({
  "location": "TextBoxSteps.userClickSubmit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check information",
  "keyword": "Then "
});
formatter.match({
  "location": "TextBoxSteps.userCheckInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
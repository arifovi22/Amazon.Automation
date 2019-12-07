$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/allResources/CucumberSmokeRun.feature");
formatter.feature({
  "name": "Amazon.com automation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "I am on the Amazon Home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the amazon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.i_am_on_the_amazon_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I am on the Amazon Home page and validate the logo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "I am on the amazon home page and validate the amazon logo",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberSteps.i_am_on_the_amazon_home_page_and_validate_the_amazon_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "I am on the Amazon Home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the amazon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.i_am_on_the_amazon_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I am searching on Amazon search box",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "name": "I am searching pen in the search box and click search button",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberSteps.i_am_searching_pen_in_the_search_box_and_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I landed on the search page I saw all the result of pen",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.i_saw_all_the_result_of_pen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/akile/Katalon Studio/OneCS/Include/features/OneCSWebIMS.feature");
formatter.feature({
  "name": "Sign In/Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "2.01 - verify the details displayed on the Sign In Welcome Screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "name": "user launch OneCS Portal Dasboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "OneCSWebStepDefs.user_launch_OneCS_Portal_Dasboard_page()"
});
formatter.result({
  "status": "passed"
});
});
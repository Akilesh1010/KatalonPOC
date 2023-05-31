$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/akile/git/KatalonMobileWeb/Include/features/OneCSIMSFivePoint.feature");
formatter.feature({
  "name": "Five Point Regression",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "E2E for Five Point",
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
formatter.step({
  "name": "user validates Five Point Health Fields",
  "keyword": "Then "
});
formatter.match({
  "location": "IMSPortalStepDefs.user_validates_Five_Point_Health_Fields()"
});
formatter.result({
  "status": "passed"
});
});
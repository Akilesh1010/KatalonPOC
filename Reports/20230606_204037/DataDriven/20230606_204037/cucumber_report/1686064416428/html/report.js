$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/akile/git/KatalonMobileWeb/Include/features/SecurePortalDataDriven.feature");
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
      "name": "@SecurePortal"
    }
  ]
});
formatter.step({
  "name": "user launch Secure Portal Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OneCSWebStepDefs.user_launch_Secure_Portal_Login_page()"
});
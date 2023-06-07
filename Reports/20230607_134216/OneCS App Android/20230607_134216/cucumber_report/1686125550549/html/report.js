$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/akile/git/KatalonMobileWeb/Include/features/Android_More.feature");
formatter.feature({
  "name": "More",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "8.01 - verify the details displayed on the Sign In Welcome Screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@More_Android"
    },
    {
      "name": "@8.01_Android"
    }
  ]
});
formatter.step({
  "name": "the user launches the OneCS Mobile app",
  "keyword": "Given "
});
formatter.match({
  "location": "Android_OneCSMobile.the_user_launches_the_OneCS_Mobile_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user validates the following for More Screen",
  "keyword": "And ",
  "doc_string": {
    "value": "user Clicks on \"SIGN_IN\" button\nuser enters \"Correct_Username\" and \"Correct_Password\"\nuser Clicks on \"Continue_Button\"\nuser enters the \"TWO_FA\" code in input box\nuser enters \"SIX_DIGIT\" pin in \"CREATE_YOUR_PIN_BOX\" for Android\nuser taps on \"STEP3_CONTINUE_BUTTON\" for Android\nuser enters \"SIX_DIGIT\" pin in \"CREATE_YOUR_PIN_BOX\" in step four for Android\nuser taps on \"CONFIRM_PIN\" button in step four of sigin screen for Android\nuser taps on \"MAY_BE_LATER\" option for Android\nuser Clicks on \"More_Option\" in Dashboard Screen for Android\nuser should see \"OneCS\" as tittle in more options Screen for Android\nThen no \"BACK_BUTTON\" should be displayed for the menu screen for Android\nThen under User Settings screen below options should be displayed with back option at right\n\t\t|Account settings|\n\t\t|Documents\t\t\t |\n\t\t|Pay money in\t\t |\nThen under Help \u0026 Suppport screen below options should be displayed with back option at right\n\t\t|Debug view\t\t\t\t |\n\t\t|FAQs \t\t\t\t\t\t |\n\t\t|Help centre\t\t\t |\t\n\t\t|What\u0027s new\t\t\t\t |\nThen user should see below four categories in more screen for Android\n\t\t|USER SETTINGS\t\t\t\t|\n\t\t|HELP \u0026 SUPPORT\t\t\t\t|\n\t\t|ABOUT CHARLES STANLEY|\nThen under About Charles Stanley screen below options should be displayed with back option at right\n\t\t|Contact details \t\t\t\t |\n\t\t|Important information\t |\t\n\t\t|Licensing information\t |\nThen user should see Sign Out button displayed at the bottom"
  }
});
formatter.match({
  "location": "MoreStepDefs.the_user_validates_the_following_for_More_Screen(String)"
});
formatter.result({
  "status": "passed"
});
});
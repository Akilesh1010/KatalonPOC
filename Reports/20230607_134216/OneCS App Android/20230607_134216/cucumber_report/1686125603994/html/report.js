$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/akile/git/KatalonMobileWeb/Include/features/Android_Registration.feature");
formatter.feature({
  "name": "Sign In",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "2.01 - verify the details displayed on the Sign In Welcome Screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SignIn_Android"
    },
    {
      "name": "@2.01_Android"
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
  "name": "the user validates the following for Sign In Welcome Screen",
  "keyword": "Then ",
  "doc_string": {
    "value": "User should see \"CHARLES_STANLEY\" logo in welcome screen for Android\nuser should see \"CREATE_SECURE\" text in welcome screen for Android\nuser verifies \"SIGN_IN\" button in welcome screen for Android\nuser should see \"Don\u0027t have an account?\" text on welcome screen for Android\nuser should verify \"CREATE_ONE_ON_OUR_WEBSITE\" text in welcome screen for Android\nuser taps on \"CREATE_ONE_ON_OUR_WEBSITE\" link on Android\nuser should be Navigated to the \"https://www.charles-stanley.co.uk/services/save\" website for Android\nuser clicks on Back Button for Android\nuser should be Navigated again to \"WELCOME_SCREEN\" for Android"
  }
});
formatter.match({
  "location": "SignInStepDefs.the_user_validates_the_following_for_Sign_In_Welcome_Screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "2.02 - verify the details displayed on the Sign In Welcome Screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SignIn_Android"
    },
    {
      "name": "@2.02_Android"
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
  "name": "the user validates the following for Sign In Registration",
  "keyword": "Then ",
  "doc_string": {
    "value": "user Clicks on \"SIGN_IN\" button\nuser should see \"Sign in step 1 of 4\" from Sign-in Screen for Android\nuser should see \"X_Button\" on the top left corner of the screen for Android\nuser should see progress bar as \"Step1_of_4\" in signin screen for Android\nuser should verify whether \"Username \u0026 password\" is present in sigin screen for Android\nuser should be able to see \"Please enter your username and password associated with your Charles Stanley account.\" on signin Screen For Android\nuser should see \"Username\" text inside the username box\nuser should see \"Password\"  text inside the Password box\nuser verifies username and password field is empty\nuser should see \"CLOSED_EYE\" symbol inside password box\nuser should see \"INFO_BUTTON\" encircled in pink in signin screen\nuser should see a link stating \"I\u0027ve forgotten my details\" in signin screen\nuser should verify continue button Disabled"
  }
});
formatter.match({
  "location": "SignInStepDefs.the_user_validates_the_following_for_Sign_In_Registration(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "2.04 - verify the details displayed on the Sign In Welcome Screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SignIn_Android"
    },
    {
      "name": "@2.04_Android"
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
  "name": "the user validates the following for Progress bar",
  "keyword": "Then ",
  "doc_string": {
    "value": "user Clicks on \"SIGN_IN\" button\nuser enters \"Correct_Username\" and \"Correct_Password\"\nuser should see \"Continue_Button\" enabled\nuser should see progress bar as \"Step1_of_4\" in signin screen for Android\nuser Clicks on \"Continue_Button\"\nuser should see progress bar as \"Step2_of_4\" in signin screen for Android\nuser clicks on Back Button for Android\nuser should see progress bar as \"Step1_of_4\" in signin screen for Android\nuser should see the entered username and password retained in sigin Screen for Android\nuser Clicks on \"Continue_Button\"\nuser should see \"TWO_FA\" screen"
  }
});
formatter.match({
  "location": "SignInStepDefs.the_user_validates_the_following_for_Progress_bar(String)"
});
formatter.result({
  "status": "passed"
});
});
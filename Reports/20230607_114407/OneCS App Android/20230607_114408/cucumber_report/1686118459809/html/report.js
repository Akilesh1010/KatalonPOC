$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/akile/git/KatalonMobileWeb/Include/features/OneCSMobile-SignIn_Registration.feature");
formatter.feature({
  "name": "Sign In / Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "2.01 - verify the details displayed on the Sign In Welcome Screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SignIn"
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
  "name": "the user validates the following for Sign in Module",
  "keyword": "And ",
  "doc_string": {
    "value": "-2.01-To verify the details displayed on the Sign In Welcome Screen\n-2.02-To verify the details displayed on the \"Sign In Registration\" Screens\n-2.03 To verify the Username/Password validation  on the \"Sign In Registration\" Screen\n-2.04 To verify the validation for the Progress bar present on the \"Registration\" and \"2FA\" Screen\n-2.05 Verify the \"I need help in entering details\" link\n-2.06-Verify the sign in step 2 of 4 screen details \u0026 validations [2FA Screen]\n-2.0 6 a) -Verify the navigation back to 2FA Screen from Sign 1 of 4 screen\n-2.07-To verify the Sign In process when Mobile number is linked to account 2FA\n-2.09 - To verify the \"Sign in step 3 of 4\" screen details\n-2.10 - To verify the \"Sign in step 3 of 4\" screen validations\n-2.11 - To verify the \"Sign in step 4 of 4\" screen details\n-2.12 - To verify the \"Sign in step 4 of 4\" screen validations\n-2.13 - To verify the Incorrect PIN validations on the  \"Sign in step 4 of 4\" screen\n-2.16-To verify whether the user is able to skip the Fingerprint/Face ID authentication during Registration - Maybe later\n-2.22 More - Verify the Sign out process for the PIN, Fingerprint and Face ID logins\n-2.24-To verify the \"Sign In\" Screen for  the new user login using 6 - digit PIN\n-2.27 - Verify the screen, when user close and invoke the OneCS application without making the choice between the following two options [Enable biometrics \u0026 Maybe later]"
  }
});
formatter.match({
  "location": "Android_OneCSMobile.the_user_validates_the_following_for_Sign_in_Module(String)"
});

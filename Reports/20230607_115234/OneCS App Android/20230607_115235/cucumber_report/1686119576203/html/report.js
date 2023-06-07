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
  "name": "2.02 - verify the details displayed on the Sign In Welcome Screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SignIn_Android"
    },
    {
      "name": "@2.03_Android"
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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Call Test Case \u0027Test Cases/Sign In/2.04_Android\u0027 failed\r\n\tat com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword$_callTestCase_closure1.doCall(CallTestCaseKeyword.groovy:63)\r\n\tat com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword$_callTestCase_closure1.call(CallTestCaseKeyword.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword.callTestCase(CallTestCaseKeyword.groovy:81)\r\n\tat com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword.execute(CallTestCaseKeyword.groovy:44)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.keyword.BuiltinKeywords.callTestCase(BuiltinKeywords.groovy:350)\r\n\tat SignInStepDefs.the_user_validates_the_following_for_Progress_bar(SignInStepDefs.groovy:66)\r\n\tat ✽.the user validates the following for Progress bar(C:/Users/akile/git/KatalonMobileWeb/Include/features/Android_Registration.feature:42)\r\nCaused by: com.kms.katalon.core.exception.StepFailedException: Actual text \u0027\u0027 and expected text \u0027onecsapps\u0027 of test object \u0027Object Repository/Android Objects/Usernamefiled\u0027 are NOT matched.\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.stepFailed(KeywordMain.groovy:51)\r\n\tat com.kms.katalon.core.mobile.keyword.internal.MobileKeywordMain.stepFailed(MobileKeywordMain.groovy:40)\r\n\tat com.kms.katalon.core.mobile.keyword.builtin.VerifyElementTextKeyword$_verifyElementText_closure1.doCall(VerifyElementTextKeyword.groovy:56)\r\n\tat com.kms.katalon.core.mobile.keyword.builtin.VerifyElementTextKeyword$_verifyElementText_closure1.call(VerifyElementTextKeyword.groovy)\r\n\tat com.kms.katalon.core.mobile.keyword.internal.MobileKeywordMain.runKeyword(MobileKeywordMain.groovy:21)\r\n\tat com.kms.katalon.core.mobile.keyword.builtin.VerifyElementTextKeyword.verifyElementText(VerifyElementTextKeyword.groovy:62)\r\n\tat com.kms.katalon.core.mobile.keyword.builtin.VerifyElementTextKeyword.execute(VerifyElementTextKeyword.groovy:39)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords.verifyElementText(MobileBuiltInKeywords.groovy:2901)\r\n\tat com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords$verifyElementText$1.call(Unknown Source)\r\n\tat 2.04_Android.run(2.04_Android:16)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.main.TestCaseMain.runTestCase(TestCaseMain.java:144)\r\n\tat com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword$_callTestCase_closure1.doCall(CallTestCaseKeyword.groovy:59)\r\n\tat com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword$_callTestCase_closure1.call(CallTestCaseKeyword.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword.callTestCase(CallTestCaseKeyword.groovy:81)\r\n\tat com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword.execute(CallTestCaseKeyword.groovy:44)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.keyword.BuiltinKeywords.callTestCase(BuiltinKeywords.groovy:350)\r\n\tat SignInStepDefs.the_user_validates_the_following_for_Progress_bar(SignInStepDefs.groovy:66)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:70)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:52)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat SignIn Module.run(SignIn Module:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:369)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:369)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:369)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1686118955939.run(TempTestSuite1686118955939.groovy:36)\r\n",
  "status": "failed"
});
});
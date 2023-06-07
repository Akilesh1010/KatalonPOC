Feature: Sign In

  @SignIn_Android @2.01_Android
  Scenario: 2.01 - verify the details displayed on the Sign In Welcome Screen
    Given the user launches the OneCS Mobile app
    Then the user validates the following for Sign In Welcome Screen
      """
      User should see "CHARLES_STANLEY" logo in welcome screen for Android
      user should see "CREATE_SECURE" text in welcome screen for Android
      user verifies "SIGN_IN" button in welcome screen for Android
      user should see "Don't have an account?" text on welcome screen for Android
      user should verify "CREATE_ONE_ON_OUR_WEBSITE" text in welcome screen for Android
      user taps on "CREATE_ONE_ON_OUR_WEBSITE" link on Android
      user should be Navigated to the "https://www.charles-stanley.co.uk/services/save" website for Android
      user clicks on Back Button for Android
      user should be Navigated again to "WELCOME_SCREEN" for Android
      """

  @SignIn_Android @2.02_Android
  Scenario: 2.02 - To verify the details displayed on the "Sign In Registration" Screens
    Given the user launches the OneCS Mobile app
    Then the user validates the following for Sign In Registration
      """
      user Clicks on "SIGN_IN" button
      user should see "Sign in step 1 of 4" from Sign-in Screen for Android
      user should see "X_Button" on the top left corner of the screen for Android
      user should see progress bar as "Step1_of_4" in signin screen for Android
      user should verify whether "Username & password" is present in sigin screen for Android
      user should be able to see "Please enter your username and password associated with your Charles Stanley account." on signin Screen For Android
      user should see "Username" text inside the username box
      user should see "Password"  text inside the Password box
      user verifies username and password field is empty
      user should see "CLOSED_EYE" symbol inside password box
      user should see "INFO_BUTTON" encircled in pink in signin screen
      user should see a link stating "I've forgotten my details" in signin screen
      user should verify continue button Disabled
      """

  @SignIn_Android @2.04_Android
  Scenario: 2.04 - To verify the validation for the Progress bar present on the "Registration" and "2FA" Screen
    Given the user launches the OneCS Mobile app
    Then the user validates the following for Progress bar
      """
    user Clicks on "SIGN_IN" button
    user enters "Correct_Username" and "Correct_Password"
    user should see "Continue_Button" enabled
    user should see progress bar as "Step1_of_4" in signin screen for Android
    user Clicks on "Continue_Button"
    user should see progress bar as "Step2_of_4" in signin screen for Android
    user clicks on Back Button for Android
    user should see progress bar as "Step1_of_4" in signin screen for Android
    user should see the entered username and password retained in sigin Screen for Android
    user Clicks on "Continue_Button"
    user should see "TWO_FA" screen
      """

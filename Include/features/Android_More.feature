Feature: More

  @More_Android @8.01_Android
  Scenario: 8.01 - verify the details displayed on the Sign In Welcome Screen
    Given the user launches the OneCS Mobile app
    And the user validates the following for More Screen
      """
      user Clicks on "SIGN_IN" button
      user enters "Correct_Username" and "Correct_Password"
      user Clicks on "Continue_Button"
      user enters the "TWO_FA" code in input box
      user enters "SIX_DIGIT" pin in "CREATE_YOUR_PIN_BOX" for Android
      user taps on "STEP3_CONTINUE_BUTTON" for Android
      user enters "SIX_DIGIT" pin in "CREATE_YOUR_PIN_BOX" in step four for Android
      user taps on "CONFIRM_PIN" button in step four of sigin screen for Android
      user taps on "MAY_BE_LATER" option for Android
      user Clicks on "More_Option" in Dashboard Screen for Android
      user should see "OneCS" as tittle in more options Screen for Android
      Then no "BACK_BUTTON" should be displayed for the menu screen for Android
      Then under User Settings screen below options should be displayed with back option at right
      		|Account settings|
      		|Documents			 |
      		|Pay money in		 |
      Then under Help & Suppport screen below options should be displayed with back option at right
      		|Debug view				 |
      		|FAQs 						 |
      		|Help centre			 |	
      		|What's new				 |
      Then user should see below four categories in more screen for Android
      		|USER SETTINGS				|
      		|HELP & SUPPORT				|
      		|ABOUT CHARLES STANLEY|
      Then under About Charles Stanley screen below options should be displayed with back option at right
      		|Contact details 				 |
      		|Important information	 |	
      		|Licensing information	 |
      Then user should see Sign Out button displayed at the bottom
      """

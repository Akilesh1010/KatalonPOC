import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Mobile.verifyElementExist(findTestObject('Object Repository/Android Objects/logo'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android Objects/Create a secure'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Sign in Button'), 'Sign in')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Dont have an account'), 
    'Don\'t have an account?')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Create one on our website'), 
    'Create one on our website')

Mobile.tap(findTestObject('Object Repository/Android Objects/Create one on our website'), 0)

Bool = Mobile.verifyElementExist(findTestObject('Object Repository/Android Objects/android.widget.Button - Accept All'), 
    10)

if (Bool == true) {
    Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.Button - Accept All'), 0)
}

continuebutton = Mobile.getText(findTestObject('Object Repository/Android Objects/weburl'), 0)

Assert.assertEquals(continuebutton, 'charles-stanley.co.uk/services/save')

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/logo'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/Sign in Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in step 1 of 4'), 
    'Sign in step 1 of 4')

Mobile.verifyElementExist(findTestObject('Object Repository/Android Objects/X_Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Username  password'), 
    'Username & password')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Please enter your username and password associated with your Charles Stanley account'), 
    'Please enter your username and password associated with your Charles Stanley account.')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), '')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '')

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/eyebuttoninsignin'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob', 0)

Mobile.clearText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Pass123$', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••')

Mobile.tap(findTestObject('Object Repository/Android Objects/closebutton'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/logo'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/Sign in Button'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob', 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'pass123$', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••')

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Continue'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Android Objects/android.widget.TextView - Details incorrect'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Details incorrect'), 
    'Details incorrect')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Please check the details youve entered are correct'), 
    'Please check the details you\'ve entered are correct.')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Edit details'), 'Edit details')

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Edit details'), 0)

Mobile.verifyElementNotExist(findTestObject('Object Repository/Android Objects/android.widget.TextView - Details incorrect'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in step 1 of 4'), 
    'Sign in step 1 of 4')

//Continue button enabled
continuebutton = Mobile.getAttribute(findTestObject('Object Repository/Android Objects/Continue_Button'), 'enabled', 0)

Assert.assertEquals(continuebutton, 'true')

Mobile.tap(findTestObject('Object Repository/Android Objects/closebutton'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/logo'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/Sign in Button'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bobs', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bobs')

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Pass123$', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••')

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Continue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Details incorrect'), 
    'Details incorrect')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Please check the details youve entered are correct'), 
    'Please check the details you\'ve entered are correct.')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Edit details'), 'Edit details')

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Edit details'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in step 1 of 4'), 
    'Sign in step 1 of 4')

Mobile.verifyElementNotExist(findTestObject('Object Repository/Android Objects/android.widget.TextView - Details incorrect'), 
    0)

continuebutton = Mobile.getAttribute(findTestObject('Object Repository/Android Objects/Continue_Button'), 'enabled', 0)

Assert.assertEquals(continuebutton, 'true')

Mobile.clearText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 0)

Mobile.clearText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'A', 0)

continuebutton = Mobile.getAttribute(findTestObject('Object Repository/Android Objects/Continue_Button'), 'enabled', 0)

Assert.assertEquals(continuebutton, 'true')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'A')

Mobile.clearText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'P', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '•')

continuebutton = Mobile.getAttribute(findTestObject('Object Repository/Android Objects/Continue_Button'), 'enabled', 0)

Assert.assertEquals(continuebutton, 'true')

Mobile.tap(findTestObject('Object Repository/Android Objects/closebutton'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/Sign in Button'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Pass123$', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••')

Mobile.tap(findTestObject('Object Repository/Android Objects/eyebuttoninsignin'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Pass123$')

Mobile.tap(findTestObject('Object Repository/Android Objects/closebutton'), 0)

//appended
Mobile.tap(findTestObject('Object Repository/Android Objects/Sign in Button'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bobs', 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'pass123$', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bobs')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Details incorrect'), 'Details incorrect')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Please check the details youve entered are correct'), 
    'Please check the details you\'ve entered are correct.')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Edit details'), 'Edit details')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Edit details'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/closebutton'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob', 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Pass123$', 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/Continue_Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 2 of 4'), 'Sign in step 2 of 4')

Mobile.tap(findTestObject('Object Repository/SignIn/chevron button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Ive forgotten my details'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Recover details'), 'Recover details')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Forgot sign in details Not to worry. Just tap the relevant button below to fix this'), 
    'Forgot sign in details? Not to worry. Just tap the relevant button below to fix this.')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Forgot username'), 'Forgot username')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Forgot password'), 'Forgot password')

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/recoverdeatilsclose'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/recoverdeatilsclose'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 1 of 4'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Ive forgotten my details'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Forgot username'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.Button - Close'), 0)

//Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.EditText - httpswww.charles-stanley-direct.co.ukappforgotten-username'), 
//    'https://www.charles-stanley-direct.co.uk/app/forgotten-username')
Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.view.View - Date Of Birth'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.view.View - Account Number'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.Button - Request username by post'), 
    0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/Usernamefiled'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Ive forgotten my details'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Forgot password'), 0)

//Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.EditText - httpswww.charles-stanley-direct.co.ukappreset-password'), 
//    'https://www.charles-stanley-direct.co.uk/app/reset-password')
Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.view.View - Username'), 'Username')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.Button - Next'), 'Next')

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in step 1 of 4'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••')

Mobile.tap(findTestObject('Object Repository/Android Objects/Continue_Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 2 of 4'), 'Sign in step 2 of 4')

Mobile.verifyElementExist(findTestObject('Object Repository/SignIn/backbuttoninstep2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Verify your account'), 'Verify your account')

//Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Please enter the 6-digit verification code we have sent to the account mobile number'), 
//    'Please enter the 6-digit verification code we have sent to the account mobile number.')
Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - I need help verifying my account'), 
    'I need help verifying my account')

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/Code to type'), 0)

Mobile.setText(findTestObject('Object Repository/SignIn/SIX_DIGIT_INPUT_BOX'), '1', 0)

Mobile.setText(findTestObject('Object Repository/SignIn/SIX_DIGIT_INPUT_BOX'), '12', 0)

Mobile.setText(findTestObject('Object Repository/SignIn/SIX_DIGIT_INPUT_BOX'), '123', 0)

Mobile.setText(findTestObject('Object Repository/SignIn/SIX_DIGIT_INPUT_BOX'), '1234', 0)

Mobile.setText(findTestObject('Object Repository/SignIn/SIX_DIGIT_INPUT_BOX'), '12345', 0)

twofa = Mobile.getText(findTestObject('Object Repository/Android Objects/Code to type'), 0)

Mobile.setText(findTestObject('Object Repository/SignIn/SIX_DIGIT_INPUT_BOX'), twofa, 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 3 of 4'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in step 1 of 4'), 
    0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob', 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Pass123$', 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/Continue_Button'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Android Objects/CodeotpBox'), 10)

Mobile.setText(findTestObject('Object Repository/Android Objects/CodeotpBox'), '123456', 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Incorrect code'), 'Incorrect code')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Please check the details youve entered are correct'), 
    'Please check the details you\'ve entered are correct.')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Edit details'), 'Edit details')

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Edit details'), 0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/SignIn/android.widget.TextView - Incorrect code'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 2 of 4'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/backbuttoninstep2'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/Continue_Button'), 0)

oldtwofa = Mobile.getText(findTestObject('Object Repository/Android Objects/Code to type'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/backbuttoninstep2'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue'), 0)

newtwofa = Mobile.getText(findTestObject('Object Repository/Android Objects/Code to type'), 0)

Assert.assertNotEquals(oldtwofa, newtwofa)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - I need help verifying my account'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Recover details'), 'Recover details')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Struggling to verify your account Not to worry. Just tap the relevant button below to get back on track'), 
    'Struggling to verify your account? Not to worry. Just tap the relevant button below to get back on track.')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Resend 6-digit code'), 'Resend 6-digit code')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Check mobile number'), 'Check mobile number')

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/recoverdetailsclose'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Check mobile number'), 0)

//Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.EditText - httpswww.charles-stanley-direct.co.ukapploginReturnUrl2FMy_Dashboard2FMy_Direct_Accounts2FMy_Profile2FPersonalInformation'), 'https://www.charles-stanley-direct.co.uk/app/login?ReturnUrl=%2FMy_Dashboard%2FMy_Direct_Accounts%2FMy_Profile%2FPersonalInformation')
Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.view.View - Username (1)'), 'Username')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.view.View - Password'), 'Password')

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.Button - Login'), 0)

Mobile.pressBack()

WebUI.verifyElementNotPresent(findTestObject('Object Repository/SignIn/android.widget.TextView - Recover details'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 2 of 4'), 0)

twofa1 = Mobile.getText(findTestObject('Object Repository/Android Objects/Code to type'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/CodeotpBox'), twofa1, 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 3 of 4'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.ProgressBar - 0.75'), '0.75')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Create your PIN'), 'Create your PIN')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Youll use this 6-digit PIN to sign in to the app securely if Biometrics are not enabled'), 
    'You\'ll use this 6-digit PIN to sign in to the app securely if Biometrics are not enabled')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '')

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Createpinstep3'), 'abcdef', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '')

Mobile.setText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '258036', 0)

//'cont enabled and disabled after entering'
//WebUI.acceptAlert()
Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 4 of 4'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.ProgressBar - 1.0'), '1.0')

//'cont enabled and disabled after entering'
//WebUI.acceptAlert()
Mobile.setText(findTestObject('Object Repository/Android Objects/Confirmpin6digit'), '258036', 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Confirm your PIN'), 'Confirm your PIN')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Youll use this 6-digit PIN to sign in to the app securely if Biometrics are not enabled'), 
    'You\'ll use this 6-digit PIN to sign in to the app securely if Biometrics are not enabled')

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/step4back'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/step4back'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '')

//Mobile.verifyElementVisible(findTestObject(''), 0)
//
//Mobile.tap(findTestObject('Object Repository/SignIn/step4back'), 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 3 of 4'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '258036', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue'), 0)

//'confirm pin disalbed'
//WebUI.acceptAlert()
Mobile.setText(findTestObject('Object Repository/Android Objects/Confirmpin6digit'), '258036', 0)

//'enabled'
//WebUI.acceptAlert()
Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Confirm PIN'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Secure Sign in'), 'Secure Sign in')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Enable biometrics'), 'Enable biometrics')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Maybe later'), 'Maybe later')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Maybe later'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - More'), 0)

Mobile.scrollToText('Sign out')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign out'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob', 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Pass123$', 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Continue'), 0)

key = Mobile.getText(findTestObject('Object Repository/Android Objects/Code to type'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/CodeotpBox'), key, 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '258036', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Confirmpin6digit'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Confirm PIN'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Incorrect PIN'), 'Incorrect PIN')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Sorry, your PIN does not match. Please try again'), 
    'Sorry, your PIN does not match. Please try again.')

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Edit details'), 'Edit details')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Edit details'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '258036', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Confirmpin6digit'), '258036', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Confirm PIN'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Maybe later'), 'Maybe later')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Maybe later'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/PortfolioDash'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - More'), 0)

Mobile.scrollToText('Sign out')

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign out'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'bob', 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Pass123$', 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/android.widget.TextView - Continue'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 2 of 4'), 0)

key2 = Mobile.getText(findTestObject('Object Repository/Android Objects/Code to type'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/CodeotpBox'), key2, 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 3 of 4'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '258036', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 4 of 4'), 0)

//'conpirm pin disabled\r\n'
//WebUI.acceptAlert()
Mobile.tap(findTestObject('Object Repository/SignIn/step4back'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Create your PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Createpinstep3'), '258036', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Continue'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 4 of 4'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Confirmpin6digit'), '258036', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.TextView - Confirm PIN'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Secure Sign in'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - You can sign in with facial recognition or your fingerprint'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Enable biometrics'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Maybe later'), 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/MAY_BE_LATER'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/PortfolioDash'), 0)

MobileDriverFactory.getDriver().closeApp()

MobileDriverFactory.getDriver().activateApp('com.charlesstanley.android.qa')

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Please enter your 6-digit PIN'), 
    0)

Mobile.setText(findTestObject('Object Repository/SignIn/RevokenappPinbox'), '258036', 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/PortfolioDash'), 0)

MobileDriverFactory.getDriver().closeApp()

MobileDriverFactory.getDriver().quit()

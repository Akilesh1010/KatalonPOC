import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable
Mobile.startApplication(GlobalVariable.bsApp, true)

Mobile.tap(findTestObject('Object Repository/Android Objects/Sign in Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Sign in step 1 of 4'),
	'Sign in step 1 of 4')
Mobile.verifyElementExist(findTestObject('Object Repository/Android Objects/X_Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Username  password'),
	'Username & password')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Please associated with your Charles Stanley account'),
	'Please enter your username and password associated with your Charles Stanley account.')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), '')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '')

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/eyebuttoninsignin'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignIn/android.widget.TextView - Ive forgotten my details'), 0)

MobileDriverFactory.getDriver().closeApp()

MobileDriverFactory.getDriver().quit()
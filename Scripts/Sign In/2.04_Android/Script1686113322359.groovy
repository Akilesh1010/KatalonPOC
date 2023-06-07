import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

Mobile.tap(findTestObject('Object Repository/Android Objects/Sign in Button'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'onecsapps', 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/Passwordfiled'), 'Cupholder1', 0)

Mobile.tap(findTestObject('Object Repository/Android Objects/Continue_Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Sign in step 2 of 4'), 'Sign in step 2 of 4')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Usernamefiled'), 'onecsapps')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Passwordfiled'), '••••••••••')

Mobile.tap(findTestObject('Object Repository/Android Objects/Continue_Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SignIn/android.widget.TextView - Verify your account'), 'Verify your account')

MobileDriverFactory.getDriver().closeApp()

MobileDriverFactory.getDriver().quit()

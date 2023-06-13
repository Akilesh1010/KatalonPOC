import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable

Mobile.startApplication(GlobalVariable.bsApp, true)

Mobile.verifyElementExist(findTestObject('Object Repository/Android Objects/logo'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android Objects/Create a secure'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/Sign in Button'), 'Sign in')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Dont have an account'), 
    'Don\'t have an account?')

Mobile.verifyElementText(findTestObject('Object Repository/Android Objects/android.widget.TextView - Create one on our website'), 
    'Create one on our website')

Mobile.tap(findTestObject('Object Repository/Android Objects/Create one on our website'), 0)

continuebutton = Mobile.getText(findTestObject('Object Repository/Android Objects/weburl'), 0)

Assert.assertEquals(continuebutton, 'charles-stanley.co.uk/services/save')

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Object Repository/Android Objects/logo'), 0)

MobileDriverFactory.getDriver().closeApp()

MobileDriverFactory.getDriver().quit()

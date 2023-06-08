import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.bsApp, true)

Mobile.takeScreenshotAsCheckpoint('logoScreen')

Mobile.tap(findTestObject('Object Repository/Ui Testing/android.widget.TextView - Sign in'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Ui Testing/android.widget.EditText'),
	0)

Mobile.takeScreenshotAsCheckpoint('SignIn')

Mobile.setText(findTestObject('Object Repository/Ui Testing/android.widget.EditText'), 'bob', 0)

Mobile.setText(findTestObject('Object Repository/Ui Testing/android.widget.EditText (1)'), 'Pass123$', 0)

Mobile.takeScreenshotAsCheckpoint('UsernmaePassword')

Mobile.tap(findTestObject('Object Repository/Ui Testing/android.widget.TextView - Continue'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Ui Testing/android.widget.TextView - Verify your account'), 
    0)

Mobile.takeScreenshotAsCheckpoint('2FA')


MobileDriverFactory.getDriver().closeApp()

MobileDriverFactory.getDriver().quit()


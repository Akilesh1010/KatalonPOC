import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.bsiOSapp, true)

Mobile.verifyElementExist(findTestObject('Object Repository/iOS_POC/CS LOGO'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/iOS_POC/Sign In Button'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/iOS_POC/Dont Have ACC'), 0)

Mobile.tap(findTestObject('Object Repository/iOS_POC/Dont Have ACC'), 0)

//WebText = Mobile.getText(findTestObject('Object Repository/iOS_POC/Create Web URL'),0)
//
//text=WebText.replaceAll("\\p{C}", "");
//
//Assert.assertEquals(text, 'charles-stanley.co.uk, secure')
MobileDriverFactory.getDriver().terminateApp(GlobalVariable.BundleID)

MobileDriverFactory.getDriver().activateApp(GlobalVariable.BundleID)

Mobile.verifyElementVisible(findTestObject('Object Repository/iOS_POC/CS LOGO'), 0)

MobileDriverFactory.getDriver().closeApp()

MobileDriverFactory.getDriver().quit()




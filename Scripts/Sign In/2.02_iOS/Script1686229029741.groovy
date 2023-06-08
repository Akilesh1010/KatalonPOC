import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.bsiOSapp, true)

Mobile.tap(findTestObject('Object Repository/iOS_POC/Sign In Button'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/iOS_POC/Sign in step 1 of 4'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/iOS_POC/close cross'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/iOS_POC/Username_password_Text'), 'Username & password')

Mobile.verifyElementText(findTestObject('Object Repository/iOS_POC/Please enter your username'), 'Please enter your username and password associated with your Charles Stanley account.')

Mobile.verifyElementVisible(findTestObject('Object Repository/iOS_POC/Eye show'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/iOS_POC/Ive forgotten my details'), 'I\'ve forgotten my details')

Mobile.verifyElementVisible(findTestObject('Object Repository/iOS_POC/Continue Button'), 0)

Mobile.closeApplication()
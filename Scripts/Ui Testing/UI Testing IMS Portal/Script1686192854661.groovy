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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kdx03:Servehugematch93!@clientsupport.sit.charles-stanley.co.uk/app/')

WebUI.click(findTestObject('Object Repository/Ui Testing/Page_Dashboard/button_Create new'))

WebUI.takeElementScreenshotAsCheckpoint('Application Selection', findTestObject('Object Repository/Ui Testing/Page_Dashboard/Application Service Type Selection'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Ui Testing/Page_Dashboard/select_Select Service IMS OneStep - Five-po_f58547'), 
    '3', true)

WebUI.takeElementScreenshotAsCheckpoint('Retirement Planning', findTestObject('Object Repository/Ui Testing/Page_Dashboard/Application Service Type Selection'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Create new'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Ui Testing/Page_Dashboard/span_Business getter code_anchor'),0)

WebUI.takeFullPageScreenshotAsCheckpoint('Summary')

WebUI.click(findTestObject('Object Repository/Ui Testing/Page_Dashboard/span_Business getter code_anchor'))

WebUI.click(findTestObject('Object Repository/Ui Testing/Page_Dashboard/li_MRL - Aaron Murphy'))

WebUI.takeFullPageScreenshotAsCheckpoint('Businessgettercode')

WebUI.click(findTestObject('Object Repository/Ui Testing/Page_Dashboard/span_Client Details'))

WebUI.waitForElementVisible(findTestObject('Page_Dashboard/input_First names_client1firstnames'),0)


WebUI.takeFullPageScreenshotAsCheckpoint('ClientDetails')


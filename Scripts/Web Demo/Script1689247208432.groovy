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

WebUI.navigateToUrl('http://kdx03:Servehugematch93!@clientsupport-csl.charles-stanley.co.uk/app/')

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/button_Create new'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Clientdetails/Page_Dashboard/select_Select Service IMS OneStep - Five-po_f58547'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/button_Create new'))

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/span_Business getter code_anchor'))

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/li_MRL - Aaron Murphy'))

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/span_Client Details'))

WebUI.verifyElementText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/legend_Personal information'), 'Personal information')

WebUI.selectOptionByValue(findTestObject('Object Repository/Clientdetails/Page_Dashboard/select_Select titleMrMsMrsMissDrOther'), 
    '1: Mr', true)

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_First names_client1firstnames'), 'katalon')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Last name_client1lastname'), 'Studio')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Date of birth_client1dob'), '10/10/1993')

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Gender_gender1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Clientdetails/Page_Dashboard/select_Please selectSingleMarriedSeparatedD_f061ed'), 
    'Divorced', true)

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/a_Or enter address manually'))

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Address line 1_addressLine1'), 'xyz')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Address line 2_addressLine2'), 'wer')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Address line 3_addressLine3'), 'awqer')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_TownCity_town'), 'Newyork')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_County_county'), 'US')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Postcode_postcode'), 'nw87qj')

WebUI.selectOptionByValue(findTestObject('Object Repository/Clientdetails/Page_Dashboard/select_United KingdomAlbaniaAlgeriaAmerican_c00340'), 
    'Albania', true)

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Email address_client1email'), 'abcd@gmail.om')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Home telephone_client1hometelephone'), 
    '123456789')

WebUI.setText(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Mobile telephone_client1mobiletelephone'), 
    '1234567')

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Communication and Marketing Preferenc_8fce92'))

WebUI.click(findTestObject('Object Repository/Clientdetails/Page_Dashboard/input_Communication and Marketing Preferenc_b744b6'))

WebUI.closeBrowser()


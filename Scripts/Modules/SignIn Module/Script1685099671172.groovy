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

'2.01-To verify the details displayed on the Sign In Welcome Screen\r\n2.02-To verify the details displayed on the "Sign In Registration" Screens\r\n2.03 To verify the Username/Password validation  on the "Sign In Registration" Screen\r\n2.04 To verify the validation for the Progress bar present on the "Registration" and "2FA" Screen\r\n2.05 Verify the "I need help in entering details" link\r\n2.06-Verify the sign in step 2 of 4 screen details & validations [2FA Screen]\r\n2.0 6 a) -Verify the navigation back to 2FA Screen from Sign 1 of 4 screen\r\n2.07-To verify the Sign In process when Mobile number is linked to account 2FA\r\n2.09 - To verify the "Sign in step 3 of 4" screen details\r\n2.10 - To verify the "Sign in step 3 of 4" screen validations\r\n2.11 - To verify the "Sign in step 4 of 4" screen details\r\n2.12 - To verify the "Sign in step 4 of 4" screen validations\r\n2.13 - To verify the Incorrect PIN validations on the  "Sign in step 4 of 4" screen\r\n2.16-To verify whether the user is able to skip the Fingerprint/Face ID authentication during Registration - Maybe later\r\n2.22 More - Verify the Sign out process for the PIN, Fingerprint and Face ID logins\r\n2.24-To verify the "Sign In" Screen for  the new user login using 6 - digit PIN\r\n2.27 - Verify the screen, when user close and invoke the OneCS application without making the choice between the following two options [Enable biometrics & Maybe later]'
CucumberKW.runFeatureFile('Include/features/OneCSMobile-SignIn_Registration.feature')


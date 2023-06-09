import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.nio.charset.StandardCharsets as StandardCharsets
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable
import io.appium.java_client.MobileElement as MobileElement
import java.util.Base64;

Mobile.startApplication(GlobalVariable.bsApp, true)

Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - Sign in'), 0)

Mobile.setText(findTestObject('Object Repository/NetworkCheck/android.widget.EditText'), 'onecsapps', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/NetworkCheck/android.widget.EditText (1)'), 'kcCFLyWPDWbFPddzBbsULw==', 
    0)

Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - Continue'), 0)

key = Mobile.getText(findTestObject('Object Repository/NetworkCheck/Code to type'), 0)

Mobile.setText(findTestObject('Object Repository/Android Objects/CodeotpBox'), key, 0)

Mobile.setText(findTestObject('Object Repository/NetworkCheck/android.widget.EditText (2)'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - Continue (1)'), 0)

Mobile.setText(findTestObject('Object Repository/NetworkCheck/android.widget.EditText (3)'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - Confirm PIN'), 0)

Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - Maybe later'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - Welcome back'), 0)

Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - Investments'), 0)

Mobile.setText(findTestObject('Object Repository/NetworkCheck/Investmentsearch'), 'vodafone', 0)

//Mobile.toggleAirplaneMode("yes")
sessionid = MobileDriverFactory.getDriver().getSessionId()

String apiUrl = ('https://api-cloud.browserstack.com/app-automate/sessions/' + sessionid) + '/update_network.json'

String username = 'akileshs_Jit0Ln'

String accessKey = 'XL3oy1yprCJD24apFpHu'

String requestBody = '{"networkProfile":"no-network"}'

URL url = new URL(apiUrl)

HttpURLConnection connection = ((url.openConnection()) as HttpURLConnection)

connection.setRequestMethod('PUT')

connection.setRequestProperty('Content-Type', 'application/json')

String auth = (username + ':') + accessKey

String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes(StandardCharsets.UTF_8))

connection.setRequestProperty('Authorization', 'Basic ' + encodedAuth)

connection.setDoOutput(true)

connection.getOutputStream().write(requestBody.getBytes(StandardCharsets.UTF_8))

int responseCode = connection.getResponseCode()

BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))

StringBuilder response = new StringBuilder()

String line

while ((line = reader.readLine()) != null) {
    response.append(line)
}

reader.close()

System.out.println('Response Code: ' + responseCode)

System.out.println('Response Body: ' + response.toString())

connection.disconnect()

Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.Button'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - An error occurred'), 
    0)

sessionid1 = MobileDriverFactory.getDriver().getSessionId()

String apiUrl1 = ('https://api-cloud.browserstack.com/app-automate/sessions/' + sessionid1) + '/update_network.json'

String username1 = 'akileshs_Jit0Ln'

String accessKey1 = 'XL3oy1yprCJD24apFpHu'

String requestBody1 = '{"networkProfile":"reset"}'

URL url1 = new URL(apiUrl1)

HttpURLConnection connection1 = ((url.openConnection()) as HttpURLConnection)

connection1.setRequestMethod('PUT')

connection1.setRequestProperty('Content-Type', 'application/json')

String auth1 = (username1 + ':') + accessKey1

String encodedAuth1 = Base64.getEncoder().encodeToString(auth1.getBytes(StandardCharsets.UTF_8))

connection1.setRequestProperty('Authorization', 'Basic ' + encodedAuth1)

connection1.setDoOutput(true)

connection1.getOutputStream().write(requestBody.getBytes(StandardCharsets.UTF_8))

int responseCode1 = connection1.getResponseCode()

BufferedReader reader1 = new BufferedReader(new InputStreamReader(connection1.getInputStream()))

StringBuilder response1 = new StringBuilder()

//String line1
//
//while ((line1 = reader1.readLine()) != null) {
//	response.append(line1)
//}
//reader.close()
//System.out.println('Response Code: ' + responseCode1)
//
//System.out.println('Response Body: ' + response1.toString())
connection1.disconnect()

Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.TextView - OK (1)'), 0)

//Mobile.toggleAirplaneMode('no')
Mobile.tap(findTestObject('Object Repository/NetworkCheck/android.widget.Button'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/NetworkCheck/android.view.View'), 0)

//Mobile.closeApplication()
MobileDriverFactory.getDriver().closeApp()

MobileDriverFactory.getDriver().quit()
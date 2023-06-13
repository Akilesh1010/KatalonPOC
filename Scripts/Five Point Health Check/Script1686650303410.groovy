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

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Create new Button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Select Service IMS OneStep Five Point'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Create new Button'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Business getter code_anchor'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Aaron Murphy'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Client Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Select titleMrMsMrsMissDrOther'), 
    '1: Mr', true)

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/client1firstnames'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/client1lastname'), 'Studio')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Date of birth_client1dob'), '10/10/1993')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Gender_gender1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Marital Status'), 'Married', true)

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Enter address manually'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Address line 1'), 'New york')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Address line 2'), 'No 5')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/County'), 'United Kingdom')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Postcode'), 'nw87qj')

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Country Dropdown'), 'United Kingdom', 
    true)

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Email address_client1email'), 'katalon@gmail.com')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Home telephone_client1hometelephone'), '1234567890')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Mobile telephone_client1mobiletelephone'), '8954632147')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Work telephone_client1worktelephone'), '123456789')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Communication and Marketing Preferenc'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Communication and Marketing Preferenc2'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/CD_Save application'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Risk Questions'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/To achieve financial success'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/I would take more financial risk'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Strongly disagree_riskQuestionsClient_22bd57'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Disagree_riskQuestionsClient123Answer90'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Neither agree nor disagree_riskQuesti_383527'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Disagree_riskQuestionsClient125Answer100'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Neither agree nor disagree_riskQuesti_ed657b'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Neither agree nor disagree_riskQuesti_dc54dc'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Neither agree nor disagree_riskQuesti_e7e2e1'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Neither agree nor disagree_riskQuesti_ea1343'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Strongly disagree_riskQuestionsClient_8728d7'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Agree_riskQuestionsClient131Answer132'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Slightly concerned_riskQuestionsClien_c6fb42'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Opportunity_riskQuestionsClient133Answer140'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/I often take risks_riskQuestionsClien_73261d'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/li_3 Additional Client Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/select_Select NationalityBritishAfghaniAlba_eb0c08'), 
    'American', true)


WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d'), 
    'United Kingdom', true)

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/input_Yes_isPoliticallyExposedPerson1'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/input_Passport_verificationIdType1'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Driving licence number_client1'), 'sdfhjk,mhgnbfggf')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/div_Back to all applicationsDraft applicati_f80e92'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Driving licence number_client1'), 'ASFSFFHFHGFHFBCVNV')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Expiry date_client1-expiry-date'), '10/12/2036')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Employement Type'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Expected retirement age_client1'), '55')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/OccupationJob title_client1'), 'Testing')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Name of employer Company name_client1'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Nature of business employment_client1'), 'Private')

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/CountryofIncorporation'), 'United Kingdom', 
    true)

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Investment Experience'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Occupational Qualifications'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/FinancialDependents1'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/span_Financial Details'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Inv Currently Held box'), '22')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Add_Withdraw_No'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Investment_Elsewhere box'), '24')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Cash Deposits'), '33')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Native_Savings'), '456')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/VCT_IES'), '123')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Other_Inv'), '22')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Pesnsion Funds'), '22')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Pension Fund Held Elsewhere'), '23')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Pension_Withdraw'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/pensionFundsAddWithdraw'), '20')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/DefinedBenefitsOrFinalSalaryScheme1'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/marketValueMainResidence'), '12')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/otherProperty'), '21')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/personalEffectsOrContents'), '123')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/businessInterests'), '122')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/otherSignificantAssets'), '221')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/borrowingSecuredOnMainHome'), '221')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Anticipated payoff date'), '10/10/1993')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/otherBorrowing'), '12')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Anticipated payoff date'), '10/10/1997')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/earnedIncomeBeforeTax'), '12')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/bonusAmount'), '21')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/isBonusDiscretionary1'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/dividendAmount'), '234')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/otherTaxableInvestmentIncome'), '321')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/otherNonTaxableInvestmentIncome'), '112')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/rentalIncome'), '223')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/bankBuildingSocietyInterest'), '334')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/pensionIncomePrivate'), '234')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/pensionIncomeState'), '112')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/otherIncome client1Name'), '123')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/totalNetAnnualIncome'), '221')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/annualRegularExpenditure'), '222')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/NetAnnualIncomeChangeIn'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/textarea_No_mt-l form-control ng-untouched _ef02f5'), 
    'Katalon Studio')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/isOtherFinancialInformationAvailable1'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/span_Five Point Health Check'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/How would you describe your health'))

WebUI.verifyElementText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/How would you describe your health text'), 
    'How would you describe your health?')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/div_How much money would you like to set as_a31bc6'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/pay 3-6 month'), '123')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/continueToReceiveIncomeInillness'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/provisionForFamilyInCaseOfDeath'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Unsure_liabilitiesInCaseOfDeath'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/textarea_Please provide further details bel_ff7668'), 
    'Katalon')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/HaveUptodateWill'))

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Have you set-up a Power of Attorney'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Outstanding mortgage'), '221')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/monthly repayments'), '122')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/applicable type'))

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/What is the interest rate'), '222')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/mortgageRepaidYear'), '2022')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/spending plan details'), 'katalon')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Amount Spending plans'), '2224')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Target date year'), '2025')

WebUI.setText(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/anyOtherInformation'), 'Katalon')

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/span_Summary'))

WebUI.waitForElementPresent(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Publish settings (1)'), 0)

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Publish settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/clientDetailsStatus'), '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/additionalDetailsStatus'), '1: 1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/financialDetailsStatus'), '1: 1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/riskQuestionsStatus'), '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/riskQuestionsStatus'), '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/fivePointHealthCheckStatus'), '1: 1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/fivePointHealthCheckStatus'), '1: 1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/fivePointHealthCheckStatus'), '1: 1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/declarationStatus'), '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/declarationStatus'), '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/declarationStatus'), '1: 1', true)

WebUI.click(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/button_Save changes'))

WebUI.waitForElementVisible(findTestObject('Object Repository/FivePointE2E/Page_Dashboard/Publish settings'), 0)


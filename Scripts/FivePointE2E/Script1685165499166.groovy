import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
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

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/button_Create new'))

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Select Service IMS OneStep - Five-po_f58547'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Create new'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Business getter code_anchor'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/li_MRL - Aaron Murphy'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Client Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Select titleMrMsMrsMissDrOther'), 
    '1: Mr', true)

WebUI.setText(findTestObject('Page_Dashboard/input_First names_client1firstnames'), 'AutoTest')

WebUI.setText(findTestObject('Page_Dashboard/input_Last name_client1lastname'), 'AutoLast')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Date of birth_client1dob'), '10/10/1993')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Gender_gender1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectSingleMarriedSeparatedD_f061ed'), 
    'Single', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectSingleMarriedSeparatedD_f061ed'), 
    'Single', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectSingleMarriedSeparatedD_f061ed'), 
    'Single', true)

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/a_Or enter address manually'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Address line 1_addressLine1'), 'fsdfdsgfd')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Address line 2_addressLine2'), 'gfadsgdfgfdg')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Address line 3_addressLine3'), 'gfdgfdgdf')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_TownCity_town'), 'gdfgfdgdaf')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_County_county'), 'gdfgfdg')

WebUI.setText(findTestObject('Page_Dashboard/input_Postcode_postcode'), 'NW87QJ')

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_United KingdomAlbaniaAlgeriaAmerican_c00340'), 
    'Argentina', true)

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Email address_client1email'), 'auotestkat@gmail.com')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Home telephone_client1hometelephone'), 
    '123454567')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Mobile telephone_client1mobiletelephone'), 
    '85462323')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Work telephone_client1worktelephone'), 
    '234356567')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Communication and Marketing Preferenc_8fce92'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Communication and Marketing Preferenc_b744b6'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Risk Questions'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Disagree_riskQuestionsClient120Answer75'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Strongly disagree_riskQuestionsClient_869c13'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Neither agree nor disagree_riskQuesti_b96afd'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Strongly disagree_riskQuestionsClient_f3727a'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Agree_riskQuestionsClient124Answer97'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Disagree_riskQuestionsClient125Answer100'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Agree_riskQuestionsClient126Answer107'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Agree_riskQuestionsClient127Answer112'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Disagree_riskQuestionsClient128Answer115'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Disagree_riskQuestionsClient129Answer120'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Agree_riskQuestionsClient130Answer127'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_When considering investing, I would d_f9f055'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_I would regret deciding not to take a_6fba81'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_The term I most closely associate wit_3dfdd1'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_I take risks at every opportunity_ris_ad1f78'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/textarea_Any further notes about the questi_bff76a'), 
    'Hi verifiying katalon POC')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Additional Client Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Select NationalityBritishAfghaniAlba_eb0c08'), 
    'British', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Select NationalityBritishAfghaniAlba_eb0c08'), 
    'British', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d'), 
    'United Kingdom', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d'), 
    'United Kingdom', true)

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Based on this description, do you thi_bdfd1b'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/textarea_Details_client1-politically-exposed-text'), 
    'gfdhfjgjkgkghkghjgh')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Passport_verificationIdType1'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Driving licence number_client1-drivin_e255d6'), 
    'fsdfgdaghfdh234')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Expiry date_client1-expiry-date'), '10/12/2036')

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectFull-Time EmployedPart-_fbbedb'), 
    'null', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectFull-Time EmployedPart-_fbbedb'), 
    'null', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectFull-Time EmployedPart-_fbbedb'), 
    'Full-Time Employed', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectFull-Time EmployedPart-_fbbedb'), 
    'Full-Time Employed', true)

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Expected retirement age_client1-emplo_dac0ea'), 
    '45')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_OccupationJob title_client1-employed-_f9375d'), 
    'Fishing')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Name of employer Company name_client1_eaba97'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Nature of business employment_client1_ffa724'), 
    'Private')

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d_1'), 
    'null', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d_1'), 
    'null', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d_1'), 
    'United Kingdom', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d_1'), 
    'United Kingdom', true)

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Under 2 years'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Under 2 years_hasQualifications1'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/textarea_Education details_client1-qualific_f35bc7'), 
    'fsdfdgdah')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Yes_hasFinancialDependents1'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Financial Details'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty'), 
    '234')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Add'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1'), 
    '234')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2'), 
    '456')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3'), 
    '123')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4'), 
    '678')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5'), 
    '456')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6'), 
    '100')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7'), 
    '222')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8'), 
    '111')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Withdraw'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9'), 
    '234')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Are you a member of a Defined Benefit_824ca8'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10'), 
    '222')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11'), 
    '111')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '234')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    '444')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    '321')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    '456')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    '234')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid n_6110fe'), 
    '256')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Anticipated payoff date_undefined'), '12/12/1980')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    '111')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid n_6110fe_1'), 
    '345')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Anticipated payoff date_undefined_1'), 
    '11/11/1964')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    '343')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    '345')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-valid ng-touched ng-dirty'), 
    '111')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'), 
    '333')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21'), 
    '222')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22'), 
    '456')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23'), 
    '123')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24'), 
    '456')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25'), 
    '888')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26'), 
    '222')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27'), 
    '222')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28'), 
    '111')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Yes_willNetAnnualIncomeChangeInNext12Months1'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Yes_isOtherFinancialInformationAvailable1'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Five Point Health Check'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/button_Save application'))

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_How would you describe your health'), 
    'How would you describe your health?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Please select an option'), 'Please select an option')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_How much money would you like to set _e99e76'), 
    'How much money would you like to set aside for emergencies? (enough money to pay 3-6 months worth of expenses)?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_In the event you cant work due to inj_2e7536'), 
    'In the event you can’t work due to injury or illness, would you continue to receive income from your employer or an insurance policy that you have?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_In the event of your death, is there _bc5d02'), 
    'In the event of your death, is there any provision for your family/dependents from your employer or an insurance policy that you have?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_In the event of your death, will ther_b3c401'), 
    'In the event of your death, will there be any outstanding liabilities like critical regular expenses, mortgage or loan repayments?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Do you have an up to date will'), 
    'Do you have an up to date will?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Have you set-up a Power of Attorney'), 
    'Have you set-up a Power of Attorney?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_How much is outstanding'), 'How much is outstanding?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_How much are the monthly repayments'), 
    'How much are the monthly repayments?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Please select the applicable type'), 
    'Please select the applicable type:')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_What is the interest rate'), 
    'What is the interest rate?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_What year will the mortgage be repaid'), 
    'What year will the mortgage be repaid?')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Please list any significant future sp_19701b'), 
    'Please list any significant future spending goals that you are planning? (Please consider any near, medium and longer term goals).')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Please provide any other information _e49286'), 
    'Please provide any other information you feel may be relevant to enable us to provide guidance and/or advice that is suitable for your needs.')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_ok_healthCondition1'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/textarea_Please provide further details bel_579585'), 
    'HI this is Katalon')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control dark-control ng-untouch_3b60e3'), 
    '222')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Please select an option_continueToRec_a41e6b'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/textarea_Please provide further details bel_ff7668'), 
    'Hi this is Katalaon')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Yes_provisionForFamilyInCaseOfDeath'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_No_liabilitiesInCaseOfDeath'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Yes_haveUptodateWill'))

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Health and Welfare Lasting Power of Attorney'), 
    'Health and Welfare Lasting Power of Attorney')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Power and Financial Affairs Lasting P_f970d7'), 
    'Power and Financial Affairs Lasting Power of Attorney')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Enduring Power of Attorney (if set-up_b88b61'), 
    'Enduring Power of Attorney (if set-up before 2007)')

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/label_Other type of Power of Attorney (plea_03612b'), 
    'Other type of Power of Attorney (please provide further details below)')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Or Please tick all applicable_five-po_b5c783'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/textarea_Other type of Power of Attorney (p_79955f'), 
    'Hi this is Katalon')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control dark-control ng-untouch_636786'), 
    '222')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control dark-control ng-untouch_636786_1'), 
    '123')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_What is the interest rate_form-contro_764aad'), 
    '444')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_What year will the mortgage be repaid_749b19'), 
    '2020')

WebUI.verifyElementPresent(findTestObject('Object Repository/IMS Objects/Page_Dashboard/a_Add spending plan'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/a_Add spending plan'), 'Add spending plan')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/a_Add spending plan'))

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input_Target date (Year)_form-control dark-_5177ce'), 
    'Shipping')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control dark-control ng-untouch_3b60e3_1'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/input__form-control ng-untouched ng-pristin_178ccb'), 
    '2013')

WebUI.verifyElementPresent(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Remove'), 0)

WebUI.setText(findTestObject('Object Repository/IMS Objects/Page_Dashboard/textarea_Additional Information_five-point-_69f99e'), 
    'Hi This is Katalon')

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/button_Save application'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/span_Summary'))

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/button_Publish settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMS Objects/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5'), 
    '1: 1', true)

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/button_Save changes'))

WebUI.waitForElementVisible(findTestObject('Object Repository/IMS Objects/Page_Dashboard/button_Publish settings'), 0)

WebUI.closeBrowser()


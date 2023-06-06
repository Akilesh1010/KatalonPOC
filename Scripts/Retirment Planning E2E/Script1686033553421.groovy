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

WebUI.navigateToUrl(GlobalVariable.base_url)

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/button_Create new'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/select_Select Service IMS OneStep - Five-po_f58547'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Create new'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Business getter code_anchor'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/li_MRL - Aaron Murphy'))

//
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

WebUI.click(findTestObject('Object Repository/IMS Objects/Page_Dashboard/RiskQuestionSave'))

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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectFull-Time EmployedPart-_fbbedb'), 
    'Full-Time Employed', true)

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Expected retirement age_client1-emplo_dac0ea'), '45')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_OccupationJob title_client1-employed-_f9375d'), 'IT')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Name of employer Company name_client1_eaba97'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Nature of business employment_client1_ffa724'), 'Private')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d_1'), 
    'null', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d_1'), 
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

//
WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Retirement Planning'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/a_Add Defined contribution Pension'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/a_Add Final Salary Pension'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/button_Save application'))

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_When would you like to retire'), 
    'When would you like to retire? *')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please enter a retirement date'), 
    'Please enter a retirement date')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Do you plan to retire gradually'), 
    'Do you plan to retire gradually?')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_No'), 'No')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Unsure'), 'Unsure')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/legend_Target annual expenditure'), 
    'Target annual expenditure')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Basic This is the minimum you can spe_c008ae'))

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please enter target basic annual expenditure'), 
    'Please enter target basic annual expenditure')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Comfortable These are the more enjoya_28c8d2'))

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please enter target comfortable annual_b934b4'), 
    'Please enter target comfortable annual expenditure')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Luxury These are the nice to haves th_d3b946'))

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please enter target luxury expenditure'), 
    'Please enter target luxury expenditure')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Please tell us about your one-off spe_f63bbb'))

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Is there anything else you think we s_725b0f'), 
    'Is there anything else you think we should know about your plans?')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_how would you describe your health'), 
    'how would you describe your health? *')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please select how would you describe y_b06300'), 
    'Please select how would you describe your health')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_good'), 'good')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_ok'), 'ok')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_bad'), 'bad')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/legend_Details of Pensions'), 
    'Details of Pensions')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Defined contribution'), 
    'Defined contribution')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Provider'), 'Provider')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Value ()'), 'Value (£)')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Any guarantees'), 'Any guarantees?')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Last contributed (Year)'))

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Final average salary'), 
    'Final average salary')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Employer'), 'Employer')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Annual Income ()'), 'Annual Income (£)')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/th_Date starts (NRD)'), 'Date starts (NRD)')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_How much are you paying into your pens_8024f2'), 
    'How much are you paying into your pension each year? *')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please enter amount paying into your pension'), 
    'Please enter amount paying into your pension')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_How much is your employer paying into _e4bd8e'), 
    'How much is your employer paying into your pension each year? *')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please enter amount employer paying in_79be7b'), 
    'Please enter amount employer paying into your pension')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Will you receive the full state pension'), 
    'Will you receive the full state pension? *')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please enter do you receive full state_43377c'), 
    'Please enter do you receive full state pension')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/legend_Additional information'), 
    'Additional information')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Please provide any other information _e49286'))

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Please enter a retirement date_retire_cb1b07'), 
    '10/10/1993')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Is this date flexible'), 
    'Is this date flexible? *')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please enter is this date flexible'), 
    'Please enter is this date flexible')

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Please enter is this date flexible_is_f29831'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Yes_isRetirementDateFlexible'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_No_isRetirementDateFlexible'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Do you plan to retire gradually_planT_c71e57'))

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/label_Please provide further details below'), 
    'Please provide further details below *')

WebUI.verifyElementText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please provide further details'), 
    'Please provide further details')

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Yes_planToRetireGradually'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_No_planToRetireGradually'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Do you plan to retire gradually_planT_c71e57'))

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/textarea_Please provide further details bel_ff7668'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__form-control dark-control ng-untouch_c1e2ce'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__form-control dark-control ng-dirty n_94f312'), 
    '345')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__form-control dark-control ng-untouch_c1e2ce_1'), 
    '555')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/textarea_When_form-control ng-valid ng-dirt_ca0f2e'), 
    'abdsfghdgdgfd')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/textarea_Is there anything else you think w_d212ca'), 
    'sdfgdgdfghfh')

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Please select how would you describe _06cde4'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_good_healthCondition1'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_ok_healthCondition1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/span_Please provide further details below'))

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/textarea_Please provide further details bel_579585'), 
    'Katalonsfd')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Pension 1_client1pension-provider0'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__client1pension-value0'), '1234')

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__guarantee10'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Yes_guarantee10'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Yes_guarantee10'))

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Unsure_retirementplanning-client2-pen_0ea17e'), 
    '2022')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Pension 1_form-control dark-control n_b239e2'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__form-control dark-control ng-untouch_636786'), 
    '2011')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__retirementplanning-client1-pension1S_123f85'), 
    '10/10/2022')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__form-control dark-control ng-untouch_c1e2ce_1_2'), 
    '222')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__form-control dark-control ng-untouch_c1e2ce_1_2_3'), 
    '333')

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Please enter do you receive full stat_7c95a5'))

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input_Yes_receiveFullStatePension1'))

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/input__form-control dark-control ng-untouch_636786_1'), 
    '222')

WebUI.setText(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/textarea_Additional information_anyother-in_b8ad97'), 
    'Katalon')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Save application'))

WebUI.waitForElementPresent(findTestObject('Object Repository/IMS Objects/Page_Dashboard/AppnowSaved'), 0)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Summary'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Publish settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/select_UnpublishedPublishSigned off_1'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/select_UnpublishedPublishSigned off'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/select_UnpublishedPublishSigned off_1_2'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5'), 
    '1: 1', true)

WebUI.click(findTestObject('Object Repository/Retirement Planning/Page_Dashboard/RP/Page_Dashboard/button_Save changes'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Dashboard/button_Publish settings'), 0)

WebUI.closeBrowser()


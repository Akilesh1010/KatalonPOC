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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://kdx03:Servehugematch93!@clientsupport.sit.charles-stanley.co.uk/app/')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Create new'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Select Service IMS OneStep - Five-po_f58547'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Create new'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Business getter code_anchor'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/li_MRL - Aaron Murphy'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Client Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Select titleMrMsMrsMissDrOther'), '1: Mr', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_First names_client1firstnames'), 'Arun')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Last name_client1lastname'), 'Last')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Preferred name_client1PreferredName'), 'aka')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Date of birth_client1dob'), '10/10/1993')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Gender_gender1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectSingleMarriedSeparatedD_f061ed'), 
    'Single', true)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Or enter address manually'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Address line 1_addressLine1'), 'fdsfsdfds')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Address line 2_addressLine2'), 'fsdfdsfds')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Address line 2_addressLine2'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Address line 3_addressLine3'), 'eefsdfds')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_TownCity_town'), 'fsdfdsfds')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_County_county'), 'fsdfdsfs')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Postcode_postcode'), 'fgvgbnb')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_United KingdomAlbaniaAlgeriaAmerican_c00340'), 
    'Angola', true)

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Email address_client1email'), 'arun@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Home telephone_client1hometelephone'), '3455667')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Mobile telephone_client1mobiletelephone'), '767537635')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Work telephone_client1worktelephone'), '65465464645654')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Communication and Marketing Preferenc_8fce92'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Communication and Marketing Preferenc_b744b6'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Risk Questions'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_To achieve financial success, I would_75bff1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_I would take more financial risk if t_c577f4'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_I am the kind of person who takes fin_ee299f'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Strongly disagree_riskQuestionsClient_f3727a'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Disagree_riskQuestionsClient124Answer95'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Neither agree nor disagree_riskQuesti_d0bb82'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Agree_riskQuestionsClient126Answer107'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Strongly disagree_riskQuestionsClient_d938cf'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Disagree_riskQuestionsClient128Answer115'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Disagree_riskQuestionsClient129Answer120'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Disagree_riskQuestionsClient130Answer125'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Disagree_riskQuestionsClient131Answer130'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Not concerned_riskQuestionsClient132A_1f2b3f'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Opportunity_riskQuestionsClient133Answer140'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_I sometimes take risks_riskQuestionsC_03ac78'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Additional Client Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Select NationalityBritishAfghaniAlba_eb0c08'), 
    'American', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d'), 
    'Armenia', true)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_isPoliticallyExposedPerson1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Passport_verificationIdType1'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Driving licence number_client1-drivin_e255d6'), '4567890-bkhvbjvcj')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Expiry date_client1-expiry-date'), '10/11/1984')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectFull-Time EmployedPart-_fbbedb'), 
    'null', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectFull-Time EmployedPart-_fbbedb'), 
    'Full-Time Employed', true)

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Expected retirement age_client1-emplo_dac0ea'), '80')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_OccupationJob title_client1-employed-_f9375d'), 'fishing')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Name of employer Company name_client1_eaba97'), 'oruvan tech')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Nature of business employment_client1_ffa724'), 'fun')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d_1'), 
    'null', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectUnited KingdomAlbaniaAl_f3487d_1'), 
    'Australia', true)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/label_Under 2 years'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_hasQualifications1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Does client have any financial depend_717934'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Name_client1-financial-dependents-name0'), 'akash')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectSpouseEx-spouseChildRel_684a2e'), 
    'null', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_Please selectSpouseEx-spouseChildRel_684a2e'), 
    'Spouse', true)

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Year of birth_client1-financial-depen_e0587e'), '1995')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Financial Details'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty'), '223')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/label_Add'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1'), '234')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2'), 
    '334')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3'), 
    '345')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4'), 
    '222')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5'), 
    '678')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6'), 
    '234')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8'), 
    '343')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/label_Withdraw'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9'), 
    '2354')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_isMemberOfDefinedBenefitsOrFinalS_81c75e'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-valid ng-touched ng-dirty'), '2312')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-valid ng-dirty ng-touched'), '1233')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-valid ng-dirty ng-touched_1'), '345')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-valid ng-dirty ng-touched_1_2'), '567')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-valid ng-dirty ng-touched_1_2_3'), 
    '222')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11'), 
    '333')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid n_6110fe'), '222')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Anticipated payoff date_undefined'), '10/10/1993')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '999')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid n_6110fe_1'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Anticipated payoff date_undefined_1'), '11/11/1995')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    '222')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    '444')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_isBonusDiscretionary1'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    '1234')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    '345')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    '3245')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    '456')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'), 
    '4567')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21'), 
    '234')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22'), 
    '567')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23'), 
    '234')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-valid ng-dirty_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24'), 
    '234')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_willNetAnnualIncomeChangeInNext12Months1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_isOtherFinancialInformationAvailable1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Five Point Health Check'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_How would you describe your health_he_9bfa41'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control dark-control ng-untouch_636786'), '245')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_continueToReceiveIncomeInillness'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_provisionForFamilyInCaseOfDeath'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Yes_liabilitiesInCaseOfDeath'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Do you have an up to date will_haveUp_45cd25'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Have you set-up a Power of Attorney_f_b54f70'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Or Please tick all applicable_five-po_b5c783'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Health and Welfare Lasting Power of A_f44e7f'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Power and Financial Affairs Lasting P_88d934'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Enduring Power of Attorney (if set-up_98d3eb'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control dark-control ng-untouch_636786_1'), '567')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control dark-control ng-untouch_636786_1_2'), 
    '3456')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Interest only_mortgageType'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_What is the interest rate_form-contro_764aad'), '234')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_What year will the mortgage be repaid_749b19'), '2015')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Add spending plan'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Target date (Year)_form-control dark-_5177ce'), 'Onion')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control dark-control ng-untouch_3b60e3'), '250')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input__form-control ng-untouched ng-pristin_178ccb'), '2015')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Save application'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Summary'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Publish settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5_6'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5_6'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5_6_7'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5_6_7'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5_6_7_8'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5_6_7_8'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5_6_7_8_9'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dashboard/select_UnpublishedPublishSigned off_1_2_3_4_5_6_7_8_9'), 
    '1: 1', true)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Save changes'))


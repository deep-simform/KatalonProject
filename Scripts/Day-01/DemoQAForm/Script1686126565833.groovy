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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.verifyTextPresent("Practice Form", false)

WebUI.setText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/input_Name_firstName'), 'Deep')

WebUI.setText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/input_Name_lastName'), 'Patel')

WebUI.setText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/input_Email_userEmail'), 'deep@gmail.com')

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/input_(10 Digits)_userNumber'), '1234567891')

WebUI.setText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), 
    '05 Jun 2023')

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2000', true)

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/div_22'))

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/input_Subjects_subjectsInput'), 'e')

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/div_English'))

WebUI.setText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/input_Subjects_subjectsInput'), 'm')

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/label_Reading'))

WebUI.setText(findTestObject('Day-01/Practice Form Demo QA/Page_DEMOQA/input_Select picture_uploadPicture'), '/home/deep/Pictures/Wallpapers/Simform_Wallpaper4.png')

WebUI.setText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/textarea_Current Address_currentAddress'), 
    'Ahmedabad')

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/div_NCR'))

WebUI.click(findTestObject('Day-01/Practice Form Demo QA/Page_DEMOQA/div_NCR (1)'))

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/div_Select City'))

WebUI.click(findTestObject('Day-01/Practice Form Demo QA/Page_DEMOQA/div_Delhi (1)'))

WebUI.click(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_Deep Patel'), 'Deep Patel')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_deepgmail.com'), 'deep@gmail.com')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_Male'), 'Male')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_1234567891'), '1234567891')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_22 December,2000'), '22 December,2000')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_English, Maths'), 'English, Maths')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_Sports, Reading'), 'Sports, Reading')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_Simform_Wallpaper4.png'), 
    'Simform_Wallpaper4.png')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_Ahmedabad'), 'Ahmedabad')

WebUI.verifyElementText(findTestObject('Object Repository/Day-01/Practice Form Demo QA/Page_DEMOQA/td_NCR Delhi'), 'NCR Delhi')

WebUI.click(findTestObject('Day-01/Practice Form Demo QA/Page_DEMOQA/button_Close'))

WebUI.closeBrowser()
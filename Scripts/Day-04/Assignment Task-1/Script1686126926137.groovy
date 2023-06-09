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

WebUI.navigateToUrl('https://www.plus2net.com/javascript_tutorial/form-submit-demo.php')

WebUI.setText(findTestObject('Day-04/Tesk1/input_First Name_FirstName'), firstName)

String male_object = 'Object Repository/Day-04/Tesk1/input_MaleFemale_gender'

String female_object = 'Object Repository/Day-04/Tesk1/input_MaleFemale_gender (1)'

CustomKeywords.'com.FormFillDay4.fillGender'(male_object, female_object, gender)

WebUI.selectOptionByValue(findTestObject('Object Repository/Day-04/Tesk1/select_Select OneFootBallTenisCricket'),
	'Tenis', true)

WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_Terms  Condition_agree'))


//WebUI.setText(findTestObject('Object Repository/Day-04/Tesk1/input_First Name_FirstName'), 
//    'Deep')
//
//WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/td_Male Female'))
//
//WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_MaleFemale_gender'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Day-04/Tesk1/select_Select OneFootBallTenisCricket'), 
//    'Tenis', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Day-04/Tesk1/select_Select OneFootBallTenisCricket'), 
//    'Tenis', true)
//
//WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_Terms  Condition_agree'))
//
//WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_Terms  Condition_btnSignUp'))
//
//WebUI.doubleClick(findTestObject('Object Repository/Day-04/Task-1 (1)/h1_Disable enable form submit button'))
//
//WebUI.click(findTestObject('Object Repository/Day-04/Task-1 (1)/h1_Disable enable form submit button'))
try {

//    CustomKeywords.'com.FormFillDay4.ClickSignUP'()
	WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_Terms  Condition_btnSignUp'))
}
catch (Exception e) {
    WebUI.refresh()
} 
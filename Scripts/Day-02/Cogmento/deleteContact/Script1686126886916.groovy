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

//WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)
String username_object =  'Object Repository/Day-02/Cogmento/createContact/input_Login_email'
String password_object =  'Object Repository/Day-02/Cogmento/createContact/input_Login_password'
String loginBtn_object =  'Object Repository/Day-02/Cogmento/createContact/div_Login'

CustomKeywords.'com.LoginCogmento.Login'(username_object,password_object,loginBtn_object,GlobalVariable.username,GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/deleteContact/i_Calendar_users icon'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/deleteContact/i_deepgmail.com_trash icon'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/deleteContact/button_Delete'))

//WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/deleteContact/td'))

//WebUI.closeBrowser()
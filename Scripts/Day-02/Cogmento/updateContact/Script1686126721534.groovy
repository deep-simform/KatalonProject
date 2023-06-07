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

WebUI.navigateToUrl('https://ui.cogmento.com/')

CustomKeywords.'com.LoginCogmento.Login'(GlobalVariable.username, GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/a_Deep Patel'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/button_Deep Patel_ui icon button'))

WebUI.clearText(findTestObject('Object Repository/Day-02/Cogmento/updateContact/input_Middle Name(s)_middle_name'))

WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/updateContact/input_Middle Name(s)_middle_name'), 'Rakeshbhai')

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/i_Public_unlock icon'))

WebUI.sendKeys(findTestObject('Object Repository/Day-02/Cogmento/updateContact/input_Tags_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/div_testerNo results found'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/label_Do not Call'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/label_Do not Email'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/button_Save'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/div_AccessOnly you can see this record'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/div_Do not CallYes'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/div_Do not Text'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/updateContact/div_Do not Email'))

WebUI.closeBrowser()


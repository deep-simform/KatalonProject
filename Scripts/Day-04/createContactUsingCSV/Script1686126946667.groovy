import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.BeforeTestSuite as BeforeTestSuite
import com.kms.katalon.core.annotation.SetUp as SetUp
import com.kms.katalon.core.annotation.TearDown as TearDown
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Day-04/Create Contact with CSV/i_Calendar_users icon'))

WebUI.click(findTestObject('Object Repository/Day-04/Create Contact with CSV/button_Create'))

WebUI.setText(findTestObject('Object Repository/Day-04/Create Contact with CSV/input_First Name_first_name'), FirstName)

WebUI.setText(findTestObject('Object Repository/Day-04/Create Contact with CSV/input_Last Name_last_name'), LastName)

WebUI.click(findTestObject('Object Repository/Day-04/Create Contact with CSV/button_Save'))

//WebUI.click(findTestObject('Object Repository/Day-04/Create Contact with CSV/i_Calendar_users icon_1'))
try {
    WebUI.verifyTextPresent((FirstName + ' ') + LastName, false)
}
catch (Exception e) {
    WebUI.refresh()

    WebUI.verifyTextPresent((FirstName + ' ') + LastName, false)
} 

@com.kms.katalon.core.annotation.SetUp
void login() {
    WebUI.navigateToUrl(GlobalVariable.URL)

    CustomKeywords.'com.LoginCogmento.Login'('deep.p@simformsolutions.com', 'Deep@123')
}

@com.kms.katalon.core.annotation.TearDown
void logout() {
    try {
        WebUI.waitForPageLoad(5)

        WebUI.click(findTestObject('Object Repository/Day-04/Create Contact with CSV/i_Free account_settings icon'))

        WebUI.click(findTestObject('Object Repository/Day-04/Create Contact with CSV/span_Log Out'))

        WebUI.waitForPageLoad(5)

        WebUI.verifyTextPresent('Forgot your password?', false)
    }
    catch (Exception e) {
        WebUI.click(findTestObject('Object Repository/Day-04/Create Contact with CSV/i_Free account_settings icon'))

        WebUI.click(findTestObject('Object Repository/Day-04/Create Contact with CSV/span_Log Out'))

        WebUI.verifyTextPresent('Forgot your password?', false)
    } 
}


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

import com.kms.katalon.core.annotation.Keyword
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

import groovy.swing.factory.ComboBoxFactory
import internal.GlobalVariable

import org.apache.http.auth.UsernamePasswordCredentials
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

CustomKeywords.'com.LoginCogmento.Login'(GlobalVariable.username,GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/i_Calendar_users icon'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/button_Create'))

WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/input_First Name_first_name'), firstName)

WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/input_Last Name_last_name'), lastName)


WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/input_Company_search'), company)

WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/input_Email_value'), mailId)

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/div_SelectLeadCustomerContactAffiliate'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/div_Customer'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/div_SelectNewActiveInactiveOn HoldTerminatedHot'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/div_New'))

//
//WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/textarea_d'), 'd')
//
//WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/textarea_de'), 'de')
//
//WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/textarea_dee'), 'dee')
WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/textarea_deep'), firstName+" "+lastName)

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/label_Do not Text'))

WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/input_Birthday_day'), '22')

WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/input_December_year'), '2002')

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/div_Month JanuaryFebruaryMarchAprilMayJuneJ_b508fe'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/span_December'))

WebUI.setText(findTestObject('Object Repository/Day-02/Cogmento/createContact/input_Image_image'), '/home/deep/Pictures/Wallpapers/Simform_Wallpaper4.png')

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/input_Identifier_identifier'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/button_Save'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/i_Home_home icon'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/a_Deep Patel'))

WebUI.click(findTestObject('Object Repository/Day-02/Cogmento/createContact/div_Record meta data'))

WebUI.closeBrowser()


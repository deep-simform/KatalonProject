package com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class FormFillDay4 {
	@Keyword
	void fillFirstName(String name)
	{
		WebUI.setText(findTestObject('Object Repository/Day-04/Tesk1/input_First Name_FirstName'),name)
	}
	@Keyword
	void fillGender(String gender)
	{
		if (gender=='Male')
			{				
			WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_MaleFemale_gender'))
			}
		else
		{
			WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_MaleFemale_gender (1)'))
		}	
	}
	@Keyword
	void fillGamePlayed()
	{
			WebUI.selectOptionByValue(findTestObject('Object Repository/Day-04/Tesk1/select_Select OneFootBallTenisCricket'),
			'Tenis', true)	
	}
	@Keyword
	void CheckTCBtn()
	{	
		WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_Terms  Condition_agree'))
	}
	@Keyword
	void ClickSignUP()
	{	
		WebUI.click(findTestObject('Object Repository/Day-04/Tesk1/input_Terms  Condition_btnSignUp'))	
	}
}
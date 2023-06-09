package com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.apache.poi.hssf.record.PageBreakRecord.Break

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

public class alertVisible {
	//	@Keyword
	//	visible(int number) {
	//		int a=0
	//		while(a<number) {
	//			a++
	//			WebUI.delay(0.001)
	//			println(WebUI.verifyAlertPresent(0))
	//			if(WebUI.verifyAlertPresent(0)==true) {
	//				println("Visible")
	//				//				break
	//			}
	//			else {
	//				println("Not Visible")
	//	//			break
	//			}
	//		}
	//	}

	@Keyword
	acceptalert() {
		WebUI.waitForAlert(0)
		WebUI.acceptAlert()
	}

	@Keyword
	alertText(String text) {
		WebUI.waitForAlert(0)
		WebUI.setAlertText(text)
		WebUI.acceptAlert()
	}
}

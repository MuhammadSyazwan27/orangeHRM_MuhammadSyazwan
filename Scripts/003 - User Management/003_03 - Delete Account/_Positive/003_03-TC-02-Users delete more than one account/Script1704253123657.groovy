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

WebUI.callTestCase(findTestCase('001 - Login/_Positive/001-TC-01-User successfully login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('003-TC-User Management/003_02-TC-01-Users_successfully_add_new_user/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('003-TC-User Management/003_03-TC-01-user_Delete_Account/Page_OrangeHRM/button_Enabled_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('003-TC-User Management/003_03-TC-01-user_Delete_Account/Page_OrangeHRM/button_Yes, Delete'))

WebUI.click(findTestObject('003-TC-User Management/003_03-TC-01-user_Delete_Account/Page_OrangeHRM/button_Enabled_oxd-icon-button oxd-table-cell-action-space (1)'))

WebUI.click(findTestObject('003-TC-User Management/003_03-TC-01-user_Delete_Account/Page_OrangeHRM/button_Yes, Delete'))


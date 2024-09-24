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

WebUI.openBrowser('https://web-ded.uta.edu/wconnect/CourseStatus.awp1?&Course=oshhom')

StatusResponse = WS.sendRequestAndVerify(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/200 S-H page'))

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/img_English_mainimg'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/img_Order CFRs_mainimg'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Authorized SH Trainer Program'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Click here'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Course Schedules'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Digital Badging'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_EveningSaturday Classes'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Free Training'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Live Webcasts'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Online Training'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Order CFRs'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/a_Spanish Classes'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/h2_Sign up for Updates'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_S-H Homepage - UTA EEC Division for Enterprise Development/img_SH-Fundamentals-Logo'), 
    0)

WebUI.closeBrowser()


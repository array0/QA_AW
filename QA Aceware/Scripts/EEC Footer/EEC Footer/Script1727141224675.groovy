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

WebUI.openBrowser('https://web-ded.uta.edu/wconnect/ace/index.aspx')

StatusResponse = WS.sendRequestAndVerify(findTestObject('Page_UTA EEC Home Page/200 Home page'))

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/a_(817) 272-2556'), 0)

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/a_(817) 272-2581'), 0)

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/a_1-866-906-9190'), 0)

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/a_140 W. MITCHELLARLINGTON, TX 76010'), 0)

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/a_2024 UNIVERSITY OF TEXAS ARLINGTON'), 0)

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/a_CEDQUESTIONSUTA.EDU'), 0)

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/a_Legal  Privacy'), 0)

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/a_Site Policies'), 0)

WebUI.verifyElementPresent(findTestObject('UTA EEC Footer/img Footer UTA logo'), 0)

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

StatusResponse = WS.sendRequestAndVerify(findTestObject('Links_UTA ECC Catalogs/200 Catalogs'))

WebUI.maximizeWindow()

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/img_Catalogs_CE Catalog Spring 2024 cover'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/img_Catalogs_ETI Catalog 2024 cover'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/img_Catalogs_Professional CE Catalog 2023 cover'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Links_UTA ECC Catalogs/img_Catalogs_S H Catalog 2024 Cover'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/img_Catalogs_PWI Catalog cover'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/img_Catalogs_Health Careers Catalog cover'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/img_Catalogs_S H Spanish Catalog 2024 cover'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/a_Website'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/a_Website_1'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/a_Website_1_2'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/a_Website_1_2_3_4_5'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/a_Website_1_2_3'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/a_Website_1_2_3_4'))

WebUI.navigateToUrl('https://web-ded.uta.edu/wconnect/ace/catalogs.aspx')

WebUI.enhancedClick(findTestObject('Object Repository/Links_UTA ECC Catalogs/a_Website_1'))

WebUI.closeBrowser()


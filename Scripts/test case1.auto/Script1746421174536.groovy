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

WebUI.navigateToUrl('https://etrieveqa.data-play.ai/login')

WebUI.setText(findTestObject('man/Page_eTrieve/input_Back_flex h-10 rounded border-grey border-2 bg-white px-3 py-2 text-base ring-offset-white fileborder-0 filebg-transparent filetext-sm filefont-medium filetext-neutral-950 placeholdertext-neutral-500 focus-visibleo'), 
    'sagi')

WebUI.setEncryptedText(findTestObject('Object Repository/test case.auto1/Page_eTrieve/input_Back_password'), 'q8n0twRgfUNPznngzx3A+A==')

WebUI.click(findTestObject('Object Repository/test case.auto1/Page_eTrieve/button_Sign In'))

WebUI.click(findTestObject('Object Repository/test case.auto1/Page_eTrieve/a_Lab Reports'))

WebUI.click(findTestObject('Object Repository/test case.auto1/Page_eTrieve/svg_Job Location Name_lucide lucide-play te_b323da'))

WebUI.click(findTestObject('Object Repository/test case.auto1/Page_eTrieve/svg_Job Location Name_lucide lucide-play te_b323da'))

WebUI.click(findTestObject('Object Repository/test case.auto1/Page_eTrieve/th_Lab Reference'))

WebUI.click(findTestObject('Object Repository/test case.auto1/Page_eTrieve/polygon'))

WebUI.closeBrowser()


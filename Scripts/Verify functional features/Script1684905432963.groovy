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

Mobile.comment('Open mobile application')

Mobile.startApplication('C:\\Users\\adizon\\Documents\\Projects\\AEON\\ACSP\\rgtc-acsp-mobile-android\\mobile\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    false)

Mobile.comment('Wait until login screen is opened')

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.Button - Login Via PIN'), 30)

Mobile.comment('Press Login Via PIN and input password')

Mobile.tap(findTestObject('android.widget.Button - Login Via PIN'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.EditText - Enter PIN'), 30)

Mobile.setText(findTestObject('android.widget.EditText - Enter PIN'), '111111', 0)

Mobile.comment('Wait untill Remaining Active Balance appeared')

'Get time for dashboard retreival'
Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Remaining Active Balance'), 0)

Mobile.comment('Direct to My Account Screen')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - My Account'), 0)

'Get time for my account retrieval\r\n'
Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView - Personal Information'), 0)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('android.widget.TextView - Remaining Active Balance'), 30)

Mobile.comment('Press Installament Loan to record time')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - Installment Loan'), 0)

'Press regular application to direct to loan form\r\n'
Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - Regular Application'), 5)

Mobile.comment('Wait until loan form has done loading')

'Get time for Appliance Loan to load '
Mobile.waitForElementPresent(findTestObject('android.widget.TextView - Personal Information'), 0)

Mobile.comment('Redirect to dashboard for other functionalities')

Mobile.pressBack()

'Press Yes button once dialogue box pop up\r\n'
Mobile.tap(findTestObject('Object Repository/android.widget.Button - YES'), 5)

Mobile.waitForElementPresent(findTestObject('android.widget.TextView - Remaining Active Balance'), 0)

Mobile.comment('Press AEON Code and verify if working')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - AEON Code'), 0)

'Get status as working if AEON Code exist\r\n'
Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.EditText - Enter code for AEON Code'), 5)

Mobile.comment('Redirect to dashboard for other functionalities')

Mobile.pressBack()

Mobile.comment('Press Store Locator and verify if working')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - Store Locator'), 5)

'Get status as working if Store Locator Website exist'
Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.Image - AEON-LOGO'), 0)

Mobile.pressBack()

Mobile.comment('Press FAQ and verify if working')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - FAQ'), 0)

'Get status as working if FAQ redirect to website'
Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView - FREQUENTLY ASKED QUESTIONS (FAQS)'), 
    0)

Mobile.comment('Redirect to dashboard for other functionalities')

Mobile.pressBack()

Mobile.comment('Verify Fingerprint Login')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - Fingerprint Login'), 5)

Mobile.tap(findTestObject('Object Repository/android.widget.Switch - Fingerprint Login Disable'), 0)

Mobile.comment('Wait till terms & conditions appear')

Mobile.waitForElementPresent(findTestObject('android.widget.TextView - Introduction for Terms and Conditions'), 30)

Mobile.scrollToText('SUBMIT')

'Checked Terms and Conditions before submitting\r\n'
Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox - Agree for Terms and Conditions'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SUBMIT for Terms and Conditions'), 0)

'Get status as working if this step is completed'
Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView - Fingerprint login has been successfully enabled'), 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK for fingerprint success message'), 0)

Mobile.comment('Turn Off fingerprint again')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - Fingerprint Login'), 5)

Mobile.tap(findTestObject('Object Repository/android.widget.Switch - Fingerprint Login Enable'), 5)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - YES in Fingerprint Login'), 5)

Mobile.comment('Verify Email Us')

Mobile.tap(findTestObject('android.widget.ImageButton - Email Us'), 5)

'Get status as working if this step is completed'
Mobile.verifyElementText(findTestObject('Object Repository/android.widget.Button - customercareaeonphilippines.com.ph'), 
    'customercare@aeonphilippines.com.ph')

Mobile.pressBack()

Mobile.pressBack()



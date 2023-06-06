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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.apache.commons.lang.time.StopWatch as StopWatch

StopWatch stopwatch = new StopWatch()

Mobile.startApplication('C:\\Users\\jgallego\\Documents\\APK\\419.apk', false)

Mobile.tap(findTestObject('Object Repository/Ochin/android.widget.Button - Login Via PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Ochin/android.widget.EditText'), '111111', 0)

Mobile.comment('LOGIN USER')
stopwatch.start()
Mobile.verifyElementExist(findTestObject('Ochin/android.widget.ImageView'), 0)
stopwatch.stop()
long login_user = stopwatch.getTime() / 1000
Mobile.comment('DASHBOARD')

stopwatch.reset()
stopwatch.start()
Mobile.verifyElementExist(findTestObject('Object Repository/Ochin/android.widget.TextView - Remaining Active Balance'), 
    0)
stopwatch.stop()
long dashboard = stopwatch.getTime() / 1000

Mobile.tap(findTestObject('Ochin/android.widget.TextView - My Account'), 1)

Mobile.comment('MY ACCOUNT')
stopwatch.reset()
stopwatch.start()
Mobile.verifyElementExist(findTestObject('Ochin/android.widget.TextView - Personal Information'), 0)
stopwatch.stop()
long my_account = stopwatch.getTime() / 1000
Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Ochin/android.widget.TextView - Remaining Active Balance'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.LinearLayout - Installment Loan button'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.ImageButton - Regular Application'), 0)

Mobile.comment('LOAN APPLICATION')
stopwatch.reset()
stopwatch.start()
Mobile.verifyElementExist(findTestObject('Ochin/android.widget.TextView - Personal Information Loan'), 50)
stopwatch.stop()
long loan_application = stopwatch.getTime()/ 1000
Mobile.pressBack()

Mobile.tap(findTestObject('Ochin/android.widget.Button - YES - Back from loan'), 0)

Mobile.verifyElementExist(findTestObject('Ochin/android.widget.TextView - Remaining Active Balance'), 0)

Mobile.comment('FINGERPRINT LOGIN...')

Mobile.tap(findTestObject('Ochin/android.widget.LinearLayout - Fingerprint Login button'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.Switch - Fingerprint Login Disable'), 0)

Mobile.scrollToText('I agree by the Terms and Conditions')

Mobile.checkElement(findTestObject('Ochin/android.widget.CheckBox TandC'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.Button - SUBMIT - TandC'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.Button - OK - Successfull Fingerprint'), 0)

Mobile.verifyElementExist(findTestObject('Ochin/android.widget.TextView - Remaining Active Balance'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.LinearLayout - Fingerprint Login button'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.Switch - Fingerprint Login Enable'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.Button - YES - Fingerprint disabled'), 0)

Mobile.comment('FINGERPRINT LOGIN...SUCCESS')

Mobile.verifyElementExist(findTestObject('Ochin/android.widget.TextView - Remaining Active Balance'), 0)

Mobile.comment('AEON CODE...')

Mobile.tap(findTestObject('Ochin/android.widget.LinearLayout - AEON Code Button'), 0)

Mobile.verifyElementExist(findTestObject('Ochin/Enter Code'), 0)

Mobile.pressBack()

Mobile.comment('STORE LOCATOR')

Mobile.tap(findTestObject('Ochin/android.widget.LinearLayout - Store Locator Button'), 0)

Mobile.verifyElementExist(findTestObject('Ochin/android.view.View - Store Locator Browser'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Ochin/android.widget.TextView - Remaining Active Balance'), 0)

Mobile.comment('FAQ')

Mobile.tap(findTestObject('Ochin/android.widget.LinearLayout - FAQ Button'), 0)

Mobile.tap(findTestObject('Ochin/android.view.View - FAQ Browser'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Ochin/android.widget.TextView - Remaining Active Balance'), 0)

Mobile.tap(findTestObject('Ochin/android.widget.TextView - LOANS EMAIL US'), 0)

Mobile.verifyElementExist(findTestObject('Ochin/android.widget.EditText - Aeon Customer Concern EMAIL'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.comment("\n USER LOGIN: ${login_user} \n DASHBOARD: ${dashboard} \n MY ACCOUNT: ${my_account} \n LOAN FORM: ${loan_application} \n Use AEON Code: Working \n Email Us: Working \n Store Location: Working \n FAQ: Working \n Fingerprint Login: Working \n")

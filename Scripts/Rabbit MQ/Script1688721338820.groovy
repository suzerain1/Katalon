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

//For Production
WebUI.navigateToUrl('http://192.168.50.47:15672/#/queues/%2F/acsp-mobile-events-queue')

WebUI.setText(findTestObject('Web for RabbitMQ/Page_RabbitMQ Management/input_Username_username'), 'acsph_queue')

WebUI.setText(findTestObject('Web for RabbitMQ/Page_RabbitMQ Management/input_Password_password'), 'ITMISISD)(*&')

//For Staging
//WebUI.navigateToUrl('http://192.168.50.48:15672/#/queues/%2F/acsp-mobile-events-queue')
//WebUI.setText(findTestObject('Web for RabbitMQ/Page_RabbitMQ Management/input_Username_username'), 'acsph')
//WebUI.setText(findTestObject('Web for RabbitMQ/Page_RabbitMQ Management/input_Password_password'), 'password123')
WebUI.click(findTestObject('Web for RabbitMQ/Page_RabbitMQ Management/input_submit'))

WebUI.delay(1)

acsp_mobile_events_queue = 0
acsp_mobile_events_queue_consumer = 0

if (WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom')) != '0') {
    acsp_mobile_events_queue = WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom'))
}

if (WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count')) != '0') {
	acsp_mobile_events_queue_consumer = WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count'))
}


WebUI.delay(1)

//WebUI.navigateToUrl('http://192.168.50.47:15672/#/queues/%2F/processedListUpdated')
//
//processedListUpdated = 0
//processedListUpdated_consumer = 0
//
//if (WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom')) != '0') {
//	processedListUpdated = WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom'))
//}
//
//if (WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count')) != '0') {
//	processedListUpdated_consumer = WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count'))
//}
//
//WebUI.delay(1)

WebUI.navigateToUrl('http://192.168.50.47:15672/#/queues/%2F/queue-send-sms')

queue_send_sms = 0
queue_send_sms_consumer = 0

if (WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom')) != '0') {
	queue_send_sms = WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom'))
}

if (WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count')) != '0') {
	queue_send_sms_consumer = WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count'))
}

WebUI.delay(1)

WebUI.navigateToUrl('http://192.168.50.47:15672/#/queues/%2F/queue-send-otp')

queue_send_otp = 0
queue_send_otp_consumer = 0

if (WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom')) != '0') {
	queue_send_otp = WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom'))
}

if (WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count')) != '0') {
	queue_send_otp_consumer = WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count'))
}

WebUI.delay(1)

WebUI.navigateToUrl('http://192.168.50.47:15672/#/queues/%2F/queue-pushnotif-request')

queue_pushnotif_request = 0
queue_pushnotif_request_consumer = 0

if (WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom')) != '0') {
	queue_pushnotif_request = WebUI.getText(findTestObject('Web for RabbitMQ/prod ready bottom'))
}

if (WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count')) != '0') {
	queue_pushnotif_request_consumer = WebUI.getText(findTestObject('Page_RabbitMQ Management/consumers_count'))
}

WebUI.comment("\n\n\nacsp_mobile_events_queue:\n  Ready:${acsp_mobile_events_queue} \n  Consumers:${acsp_mobile_events_queue_consumer} \nqueue_send_sms: \n  Ready: ${queue_send_sms} \n  Consumers: ${queue_send_sms_consumer} \nqueue_send_otp: \n  Ready: ${queue_send_otp} \n  Consumers: ${queue_send_otp_consumer} \nqueue_pushnotif_request: \n  Ready: ${queue_pushnotif_request} \n  Consumers: ${queue_pushnotif_request_consumer}\n\n")
WebUI.closeBrowser()


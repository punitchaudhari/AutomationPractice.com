package com.AutomationFramework.companyName.automationEcommerce.helper.alert;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;
/*import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;
*/
public class AlertHelper {
	Logger log = LoggerHelper.getLogger(AlertHelper.class);
	private WebDriver driver;

	// constructor of AlertHelper class
	public AlertHelper(WebDriver driver) {
		this.driver = driver;
		log.info("AlertHelper class Object created");
		TestBase.test.log(Status.INFO,	 "AlertHelper class Object created");
	}

	/**
	 * this method checks that if ALERT is present or not if present it returns
	 * Boolean True else False
	 * 
	 * @return
	 */
	public Boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			log.info("Alert is Present");
			TestBase.test.log(Status.INFO, "Alert is Present");
			return true;
		} catch (NoAlertPresentException e) {
			log.info("Alert is not present because = " + e.getCause());
			TestBase.test.log(Status.INFO,"Alert is not present because = " + e.getCause() );
			return false;
		}
	}

	/**
	 * this method ACCEPTS the ALERT
	 */
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	/**
	 * this method DISMISSES the alert
	 */
	public void dismissAlert() {
		driver.switchTo().alert().accept();
	}

	/**
	 * this method ACCEPTS the ALERT if its Present
	 */
	public void acceptAlertIfPresent() {
		if (isAlertPresent()) {
			driver.switchTo().alert().accept();
		}
	}

	/**
	 * this method DISMISSES the ALERT if its Present
	 */
	public void dismissAlertIfPresent() {
		if (isAlertPresent()) {
			driver.switchTo().alert().dismiss();
		}
	}

	/**
	 * this method gets alert TEXT if its present
	 */
	public void getAlertTextIfAlertIsPresent() {
		if (isAlertPresent()) {
			log.info("Alert text is = " + driver.switchTo().alert().getText());
			TestBase.test.log(Status.INFO,"Alert text is = " + driver.switchTo().alert().getText());
			
		}
	}

}

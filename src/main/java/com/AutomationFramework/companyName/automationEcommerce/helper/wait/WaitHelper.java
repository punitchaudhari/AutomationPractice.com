package com.AutomationFramework.companyName.automationEcommerce.helper.wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;
/*import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;
*/
public class WaitHelper {

	// initializing object of logger helper class helpful for printing messages
	// on console
	Logger log = LoggerHelper.getLogger(WaitHelper.class);
	WebDriver driver;
	private WebElement element;

	public WaitHelper(WebDriver driver) {
		this.driver = driver;
		log.info("WaitHelper Class Object Created");
		
	}

	/**
	 * this method waits for given amount of seconds for page to get
	 * loaded,until then all further executions are paused
	 * 
	 * @param timeOutInSeconds
	 */
	public void setPageLoadTimeout(long timeOutInSeconds) {
		driver.manage().timeouts().pageLoadTimeout(timeOutInSeconds, TimeUnit.SECONDS);
		log.info("Pageload timeout set to = " + timeOutInSeconds + " seconds");
		TestBase.test.log(Status.INFO,"Pageload timeout set to = " + timeOutInSeconds + " seconds");		

	}

	/**
	 * this methods sets implicit wait in seconds, which means webdriver waits until all page elements gets loaded
	 * then further commands are executed by the webdriver
	 * 
	 * @param timeOutInSeconds
	 */
	public void setImpliciteWait(long timeOutInSeconds) {
		driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
		log.info("Implicit wait set to = " + timeOutInSeconds + " seconds");
		TestBase.test.log(Status.INFO,"Implicit wait set to = " + timeOutInSeconds + " seconds");		

	}

	/**
	 * this methods waits for element to be visible on screen
	 * 
	 * NOTE for later: return type is webelement which returns appeared
	 * webelement so in calling script verify that provided element is same as
	 * visible/appered webelement.hint= compare both element
	 * 
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryMilliSec
	 * @return 
	 */
	public  void waitForElementToBeVisible(WebElement element, long timeOutInSeconds, long pollingEveryMilliSec) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.pollingEvery(Duration.ofMillis(pollingEveryMilliSec));
		wait.ignoring(NoSuchElementException.class);
		log.info("Waiting for " + element.toString() + " element for " + timeOutInSeconds + " Seconds To Be visible");
		TestBase.test.log(Status.INFO,"Waiting for " + element.toString() + " element for " + timeOutInSeconds + " Seconds To Be visible");		
		  wait.until(ExpectedConditions.visibilityOf(element));
		log.info("element is visible now");
		TestBase.test.log(Status.INFO,"element is visible now");		

	}

	/**
	 * this method waits for element to go invisible NOTE for later :return type
	 * is boolean here so form calling script verify that if its TRUE then
	 * element is visible else its still no visible
	 * 
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryMilliSec
	 * @return
	 */
	public Boolean waitForElementToBeInVisible(WebElement element, long timeOutInSeconds, long pollingEveryMilliSec) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.pollingEvery(Duration.ofMillis(pollingEveryMilliSec));
		log.info("Waiting for " + element.toString() + " element for" + timeOutInSeconds + " Seconds To Be Invisible");
		TestBase.test.log(Status.INFO,"Waiting for " + element.toString() + " element for" + timeOutInSeconds + " Seconds To Be Invisible");		
		Boolean status = wait.until(ExpectedConditions.invisibilityOf(element));
		log.info("waiting for element to be invisible");
		TestBase.test.log(Status.INFO,"waiting for element to be invisible");		
		return status;
	}

	/**
	 * this method waits for given amount of seconds for element to be clickable
	 * NOTE for later: return type is webelement which returns appeared
	 * webelement so in calling script verify that provided element is same as
	 * visible/appeared webelement.hint= compare both element
	 * 
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryMilliSec
	 * @return
	 */
	public WebElement waitForElementToBeClickable(WebElement element, long timeOutInSeconds,
			long pollingEveryMilliSec) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.pollingEvery(Duration.ofMillis(pollingEveryMilliSec));
		log.info("Waiting for " + element.toString() + "element for " + timeOutInSeconds + "To Be Clickable");
		TestBase.test.log(Status.INFO,"Waiting for " + element.toString() + "element for " + timeOutInSeconds + "To Be Clickable");	
		this.element = wait.until(ExpectedConditions.elementToBeClickable(element));
		return this.element;

	}

}

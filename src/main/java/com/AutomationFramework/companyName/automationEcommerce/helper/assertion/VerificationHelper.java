package com.AutomationFramework.companyName.automationEcommerce.helper.assertion;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;
/*import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;
*/
public class VerificationHelper {
	Logger log = LoggerHelper.getLogger(VerificationHelper.class);
	private WebDriver driver;

	// constructor of verification helper class
	public VerificationHelper(WebDriver driver) {
		this.driver = driver;
		log.info("VericationHelper class Object created");
		 TestBase.test.log(Status.INFO,"VericationHelper class Object created");	 
	}

	/**
	 * this method is used to verify that if provided element is displayed
	 * 
	 * @param element
	 * @return
	 */
	public Boolean verifyIsElementDisplayed(WebElement element) {

		try {
			element.isDisplayed();
			log.info("element is Displayed");
			TestBase.test.log(Status.INFO,"element is Displayed"); 
			return true;
		}

		catch (Exception e) {
			log.info("element is not Displayed");
			TestBase.test.log(Status.INFO,"element is not Displayed"); 	
			log.error(e.getCause());
			TestBase.test.log(Status.ERROR, e.getCause());
			return false;
		}

	}

	/**
	 * this method is used to verify and ensure that provided element is not
	 * displayed
	 * 
	 * @param element
	 * @return
	 */
	public Boolean verifyIsElementNotDisplayed(WebElement element) {

		try {
			element.isDisplayed();
			log.error(element.getText() + " is Displayed");
			TestBase.test.log(Status.ERROR,element.getText() + " is Displayed");
			
			return false;
		}

		catch (Exception e) {
			log.info(element.getText() + " is not Displayed");
			TestBase.test.log(Status.INFO,element.getText() + " is not Displayed");		
			return true;

		}

	}

	/**
	 * this method is used to get and read the text of provided element
	 * 
	 * @param element
	 * @return
	 */
	public String getTextFromElement(WebElement element) {
		if (element == null) {
			log.info("Webelement is null");
			TestBase.test.log(Status.INFO,"Webelement is null");	
			return null;
		}
		Boolean status = verifyIsElementDisplayed(element);
		if (status) {
			log.info("element text is =" + element.getText());
			TestBase.test.log(Status.INFO,"element text is =" + element.getText());
			return element.getText();
		} else {
			return null;
		}
	}

	/**
	 * this method checks if both element are same and returns boolean
	 * 
	 * @param element1
	 * @param element2
	 * @return
	 */
	public Boolean verifySameElement(WebElement element1, WebElement element2) {
		if (element1 == element2) {
			return true;

		} else {
			return false;
		}
	}
	
	
	/**
	 * this method verify's 2 strings are equals if they are equal test
	 * Passes...
	 * 
	 * @param s1
	 * @param s2
	 */
	public  Boolean verifyTextEquals(String s1, String s2) {
		log.info("verifying if text is equals of '"+s1+"' with '"+s2+"'");
		TestBase.test.log(Status.INFO,"verifying if text is equals of '"+s1+"' with '"+s2+"'");		
		if(s1.equals(s2)){
			return true;
		}
		else{
			return false;
		}
	}



	public Boolean verifyContains(String string1, String string2) {
		log.info("verifying that='"+string1+"' contains text= '"+string2+"'");
		TestBase.test.log(Status.INFO, "verifying that='"+string1+"' contains text= '"+string2+"'");
		return string1.contains(string2);
	}
	

}

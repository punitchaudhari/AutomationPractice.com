package com.AutomationFramework.companyName.automationEcommerce.helper.select;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;
/*import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;
*/
public class DropdownHelper {

	Logger log = LoggerHelper.getLogger(DropdownHelper.class);
	private WebDriver driver;
	String arr[];

	/**
	 * constructor of DropdownHelper class
	 * 
	 * @param driver
	 */
	public DropdownHelper(WebDriver driver) {
		this.driver = driver;
		log.info("DropDownHelper Class Object Created");
		TestBase.test.log(Status.INFO,"DropDownHelper Class Object Created");

	}

	/**
	 * this method Selects option form dropdown list by using provided visible
	 * text
	 * 
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element, String text) {
		Select dropdownElement = new Select(element);
		log.info("Selecting Option by using visibleText = " + text);
		TestBase.test.log(Status.INFO,"Selecting Option by using visibleText = " + text);		
		dropdownElement.selectByVisibleText(text);

	}

	/**
	 * this method DeSelects option form dropdown list by using provided visible
	 * text
	 * 
	 * @param element
	 * @param text
	 */
	public void deSelectByVisibleText(WebElement element, String text) {
		Select dropdownElement = new Select(element);
		log.info("DeSelecting Option by using visibleText = " + text);
		TestBase.test.log(Status.INFO,"DeSelecting Option by using visibleText = " + text);	
		dropdownElement.deselectByVisibleText(text);

	}

	/**
	 * this method Selects option form dropdown list by using provided value
	 * attribute of element
	 * 
	 * @param element
	 * @param value
	 */

	public void selectByValue(WebElement element, String value) {
		Select dropdownElement = new Select(element);
		log.info("Selecting Option by using selectByValue = " + value);
		TestBase.test.log(Status.INFO,"Selecting Option by using selectByValue = " + value);		
		dropdownElement.selectByValue(value);

	}

	/**
	 * this method DeSelects option form dropdown list by using provided value
	 * attribute of element
	 * 
	 * @param element
	 * @param value
	 */
	public void deSelectByValue(WebElement element, String value) {
		Select dropdownElement = new Select(element);
		log.info("DeSelecting Option by using deSelectByValue = " + value);
		TestBase.test.log(Status.INFO, "DeSelecting Option by using deSelectByValue = " + value);		
		dropdownElement.deselectByValue(value);
	}

	/**
	 * this method Selects option form dropdown list by using provided index of
	 * element
	 * 
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select dropdownElement = new Select(element);
		log.info("Selecting Option by using SelectByIndex = " + index);
		TestBase.test.log(Status.INFO,"Selecting Option by using SelectByIndex = " + index);		
		dropdownElement.selectByIndex(index);
	}

	/**
	 * this method DeSelects option form dropdown list by using provided index
	 * of element
	 * 
	 * @param element
	 * @param index
	 */
	public void deSelectByIndex(WebElement element, int index) {
		Select dropdownElement = new Select(element);
		log.info("DeSelecting Option by using deSelectByIndex = " + index);
		TestBase.test.log(Status.INFO,"DeSelecting Option by using deSelectByIndex = " + index);	
		dropdownElement.deselectByIndex(index);
	}

	/**
	 * this method returns a readable LinkedList which contains all options
	 * available in dropdown list
	 * 
	 * @param element
	 * @return
	 */

/*	
	public LinkedList<String> getAllDropDownData(WebElement element) {

		Select dropdownElement = new Select(element);
		List<WebElement> alloptions = dropdownElement.getOptions();
		LinkedList<String> valuelist = new LinkedList<String>();
		log.info("Starting to get all options from dropdown list");
		for (WebElement option : alloptions) {
			log.info(option.getText());
			valuelist.add(option.getText());
		}
		return valuelist;
	}

	*/
	
	public List<WebElement> getAllDropDownData(WebElement element) {

		Select dropdownElement = new Select(element);
		List<WebElement> alloptions = dropdownElement.getOptions();
		
		log.info("Starting to get all options from dropdown list");
		TestBase.test.log(Status.INFO,"Starting to get all options from dropdown list");		
		for (WebElement option : alloptions) {
			log.info(option.getText());
			TestBase.test.log(Status.INFO,option.getText());			
		}
		return alloptions;
	}

	
	/**
	 * this method returns the FIRST SELECTED option of dropdown list
	 * 
	 * @param dropdownelement
	 * @return
	 */
	public String getSelectedText(WebElement dropdownelement) {
		Select dropdownElement = new Select(dropdownelement);
		WebElement selectedText = dropdownElement.getFirstSelectedOption();
		return selectedText.getText().trim();

	}

}

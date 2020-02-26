package com.AutomationFramework.companyName.automationEcommerce.helper.action;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.AutomationFramework.companyName.automationEcommerce.helper.alert.AlertHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class ActionHelper {
	Logger log = LoggerHelper.getLogger(ActionHelper.class);
	private WebDriver driver;

	// constructor of AlertHelper class
	public ActionHelper(WebDriver driver) {
		this.driver = driver;
		log.info("ActionHelper class Object created");
		TestBase.test.log(Status.INFO,	 "ActionHelper class Object created");
	}
	/**
	 * moves mouse pointer to specified webelement
	 * @param element
	 */
	public void moveToElement(WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		log.info("moved mouse pointer to webElement");
		TestBase.test.log(Status.INFO, "moved mouse pointer to webElement");
	}
	/**
	 * moves mouse pointer to specified webelement and performs click action
	 * @param element
	 */
	public void moveToElementAndClick(WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		log.info("moved mouse pointer to webElement and clicked");
		TestBase.test.log(Status.INFO, "moved mouse pointer to webElement and clicked");
	}
	/**
	 * performs double click action on specified webelement
	 * @param element
	 */
	public void doubleClick(WebElement element){
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		log.info("performed double click on the element");
		TestBase.test.log(Status.INFO, "performed double click on the element");
	}
	/**
	 * performs contextclick(right mouse click) on specified webelement
	 * @param element
	 */
	public void contextClick(WebElement element){
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
		log.info("performed context click on the element");
		TestBase.test.log(Status.INFO, "performed context click on the element");
	}
	/**
	 * performs drag and drop action from source webelement to destination webelement
	 * @param sourceElement
	 * @param destinationElement
	 */
	public void dragAndDrop(WebElement sourceElement,WebElement destinationElement){
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, destinationElement).build().perform();
		log.info("performed drag and drop action");
		TestBase.test.log(Status.INFO, "performed drag and drop action");
	}
	
	
	

}

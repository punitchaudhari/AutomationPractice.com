package com.AutomationFramework.companyName.automationEcommerce.helper.action;

import java.awt.Window;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class JavaScriptHelper {
	Logger log = LoggerHelper.getLogger(JavaScriptHelper.class);
	private WebDriver driver;

	public JavaScriptHelper(WebDriver driver) {
		this.driver = driver;
		log.info("JavaScriptHelper class Object created");
		TestBase.test.log(Status.INFO, "JavaScriptHelper class Object created");
	}

	/**
	 * this method scrolls DOWN page by supplied number of pixels in argument
	 * 
	 * @param NumberOfpixels
	 */
	public void ScrollDownByPixels(int NumberOfpixels) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + NumberOfpixels + ")");
		log.info("Scrolled Down the page by = '" + NumberOfpixels + "' pixels");
		TestBase.test.log(Status.INFO, "Scrolled Down the page by = '" + NumberOfpixels + "' pixels");

	}

	/**
	 * this method scrolls UP page by supplied number of pixels in argument
	 * 
	 * @param NumberOfpixels
	 */
	public void ScrollUpByPixels(int NumberOfpixels) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-" + NumberOfpixels + ")");
		log.info("Scrolled UP the page by = '" + NumberOfpixels + "' pixels");
		TestBase.test.log(Status.INFO, "Scrolled Up the page by = '" + NumberOfpixels + "' pixels");
	}

	/**
	 * this mehtod scrolls page until supplied webelemnt is visible into
	 * browsers window
	 * 
	 * @param element
	 */
	public void ScrollUntilVisibilityOfElement(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		log.info("Scrolled page until provided element is visible in browsers window");
		TestBase.test.log(Status.INFO, "Scrolled page until provided element is visible in browsers window");
	}

	/**
	 * this method scrolls DOWN page to its BOTTOM
	 */
	public void ScrollToBottomOfPage() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		log.info("Scrolled page to its bottom");
		TestBase.test.log(Status.INFO, "Scrolled page to its bottom");
	}

}

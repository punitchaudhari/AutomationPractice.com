package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.select.DropdownHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_stores {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_stores.class);

	public Page_stores(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		log.info("Page_stores Class Object Created");
		TestBase.test.log(Status.INFO, "Page_stores Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='columns']/div[1]")
	public WebElement txt_PageInfoBar;

	@FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
	public WebElement lbl_ourStores1;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_ourStores2;

	@FindBy(xpath = "//*[@id='addressInput']")
	public WebElement txt_yourLocation;

	@FindBy(xpath = "//*[@id='radiusSelect']")
	public WebElement dd_radius;

	@FindBy(xpath = "//*[@id='center_column']/div[2]/div[3]/button")
	public WebElement btn_search;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' image  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' image  ");
		return new Page_index(driver);
	}

	public void setYourLocation(String yourLocation) {
		txt_yourLocation.clear();
		txt_yourLocation.sendKeys(yourLocation);
		log.info("Typed= '" + yourLocation + "' on 'your location' feild ");
		TestBase.test.log(Status.INFO, "Typed= '" + yourLocation + "' on 'your location' feild ");
	}

	public void selectRadius(String optionToBeSelected) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_radius, optionToBeSelected);
	}

	public void clkSearch() {
		btn_search.click();
		log.info("Clicked on 'Search' button ");
		TestBase.test.log(Status.INFO, "Clicked on 'Search' button ");
	}
}

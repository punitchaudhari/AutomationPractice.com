package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_aboutUs {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_aboutUs.class);

	public Page_aboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_aboutUs Class Object Created");
		TestBase.test.log(Status.INFO, "Page_aboutUs Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='center_column']/div/h1")
	public WebElement lbl_aboutUs;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[1]/div/h3")
	public WebElement lbl_ourCompany;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[2]/div/h3")
	public WebElement lbl_ourTeam;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/div/h3")
	public WebElement lbl_testimonials;

}

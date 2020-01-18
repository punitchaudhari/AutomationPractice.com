package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_manufacturer {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_manufacturer.class);

	public Page_manufacturer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_manufacturer Class Object Created");
		TestBase.test.log(Status.INFO, "Page_manufacturer Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
	public WebElement lbl_manufacturers;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_brandAndThereIsBrand;

	@FindBy(xpath = "//*[@id='manufacturers_list']/li/div/div/div[1]/div/a")
	public WebElement img_manufacturerImage;

	@FindBy(xpath = "//*[@id='manufacturers_list']/li/div/div/div[2]/h3/a")
	public WebElement link_manufacturerName;

	@FindBy(xpath = "//*[@id='manufacturers_list']/li/div/div/div[3]/div/p/a")
	public WebElement link_products;

	@FindBy(xpath = "//*[@id='manufacturers_list']/li/div/div/div[3]/div/a")
	public WebElement btn_viewProducts;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public Page_fashionManufacturer clkManufacturerImage() {
		img_manufacturerImage.click();
		log.info("Clicked on 'manufacturer' image");
		TestBase.test.log(Status.INFO, "Clicked on 'manufacturer' image");
		return new Page_fashionManufacturer(driver);

	}

	public Page_fashionManufacturer clkFashionManufacturer() {
		link_manufacturerName.click();
		log.info("Clicked on 'Fashion manufacturer' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Fashion manufacturer' link");
		return new Page_fashionManufacturer(driver);
	}

	public Page_fashionManufacturer clkProducts() {
		link_products.click();
		log.info("Clicked on 'products' link");
		TestBase.test.log(Status.INFO, "Clicked on 'products' link");
		return new Page_fashionManufacturer(driver);
	}

	public Page_fashionManufacturer clkViewProducts() {
		btn_viewProducts.click();
		log.info("Clicked on 'view products' button");
		TestBase.test.log(Status.INFO, "Clicked on 'view products' button");
		return new Page_fashionManufacturer(driver);
	}

}

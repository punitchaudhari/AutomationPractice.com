package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_supplier {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_supplier.class);

	@FindBy(xpath = "	//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
	public WebElement lbl_suppliers;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_suppliersAndThereIsSupplier;

	@FindBy(xpath = "//*[@id='suppliers_list']/li/div/div/div[1]/div/a")
	public WebElement img_supplierImage;

	@FindBy(xpath = "//*[@id='suppliers_list']/li/div/div/div[2]/h3/a")
	public WebElement link_supplierName;

	@FindBy(xpath = "//*[@id='suppliers_list']/li/div/div/div[3]/div/p/a")
	public WebElement link_products;

	@FindBy(xpath = "//*[@id='suppliers_list']/li/div/div/div[3]/div/a")
	public WebElement btn_viewProducts;

	public Page_supplier(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		log.info("Page_supplier Class Object Created");
		TestBase.test.log(Status.INFO, "Page_supplier Class Object Created");
	}

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' image  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' image  ");
		return new Page_index(driver);
	}

	public Page_fashionSupplier clksupplierImage() {
		img_supplierImage.click();
		log.info("Clicked on 'fashion supplier' image");
		TestBase.test.log(Status.INFO, "Clicked on 'fashion supplier' image");
		return new Page_fashionSupplier(driver);

	}

	public Page_fashionSupplier clkFashionSupplier() {
		link_supplierName.click();
		log.info("Clicked on 'fashion supplier name' link");
		TestBase.test.log(Status.INFO, "Clicked on 'fashion supplier name' link");
		return new Page_fashionSupplier(driver);
	}

	public Page_fashionSupplier clkProducts() {
		link_products.click();
		log.info("Clicked on 'products' link");
		TestBase.test.log(Status.INFO, "Clicked on 'products' link");
		return new Page_fashionSupplier(driver);
	}

	public Page_fashionSupplier clkViewProducts() {
		btn_viewProducts.click();
		log.info("Clicked on 'view products' button");
		TestBase.test.log(Status.INFO, "Clicked on 'view products' button");
		return new Page_fashionSupplier(driver);
	}

}

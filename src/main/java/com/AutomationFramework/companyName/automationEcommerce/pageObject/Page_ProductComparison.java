package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_ProductComparison {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_ProductComparison.class);

	public Page_ProductComparison(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_ProductComparison Class Object Created");
		TestBase.test.log(Status.INFO, "Page_ProductComparison Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
	public WebElement lbl_productComparison1;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_productComparison2;

	@FindBy(xpath = "//*[@id='social-share-compare']/p[2]/button[1]")
	public WebElement btn_tweeter;

	@FindBy(xpath = "//*[@id='social-share-compare']/p[2]/button[2]")
	public WebElement btn_facebookShare;

	@FindBy(xpath = "//*[@id='social-share-compare']/p[2]/button[3]")
	public WebElement btn_googlePlus;

	@FindBy(xpath = "//*[@id='social-share-compare']/p[2]/button[4]")
	public WebElement btn_pinterest;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/div[1]/a")
	public List<WebElement> btn_removeProduct;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/div[2]/a")
	public List<WebElement> img_productImage;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/h5/a")
	public List<WebElement> link_productName;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/div[3]/span[1]")
	public List<WebElement> lbl_productPrice;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/div[3]/span[2]")
	public List<WebElement> lbl_productOldPrice;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/div[3]/span[3]")
	public List<WebElement> lbl_productDiscountPercentage;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/div[4]")
	public List<WebElement> lbl_productDescription;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/div[5]/div/div/a[1]")
	public List<WebElement> btn_addToCart;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[1]/td/div[5]/div/div/a[2]")
	public List<WebElement> btn_view;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[2]//*[@class='comparison_feature_odd feature-name']/following-sibling::td")
	public List<WebElement> lbl_row_properties;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[3]//*[@class='comparison_feature_even feature-name']//following-sibling::td")
	public List<WebElement> lbl_row_styles;

	@FindBy(xpath = "//*[@id='product_comparison']/tbody/tr[4]//*[@class='comparison_feature_odd feature-name']/following-sibling::td")
	public List<WebElement> lbl_row_compositions;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/a")
	public WebElement btn_continueShopping;

	public Page_index clkHomeIcon1() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public void clkTweet() {
		btn_tweeter.click();
		log.info("Clicked on 'Tweeter' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Tweeter' button");
	}

	public void clkShare() {
		btn_facebookShare.click();
		log.info("Clicked on 'Share' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Share' button");
	}

	public void clkGooglePlus() {
		btn_googlePlus.click();
		log.info("Clicked on 'Google plus' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Google plus' button");
	}

	public void clkPinterest() {
		btn_pinterest.click();
		log.info("Clicked on 'Pinterest' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Pinterest' button");
	}

	public void clkRemoveProduct(int productNumber) {
		btn_removeProduct.get(productNumber - 1).click();
		log.info("Clicked on remove product button of product number= '" + productNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on remove product button of product number= '" + productNumber + "'");
	}

	public Page_product clkProductImage(int productNumber) {
		img_productImage.get(productNumber - 1).click();
		log.info("Clicked on product image number ='" + productNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on product image number ='" + productNumber + "'");
		return new Page_product(driver);
	}

	public Page_product clkProductName(int productNumber) {
		link_productName.get(productNumber - 1).click();
		log.info("Clicked on '" + link_productName.get(productNumber - 1).getText() + "'");
		TestBase.test.log(Status.INFO, "Clicked on '" + link_productName.get(productNumber - 1).getText() + "'");
		return new Page_product(driver);
	}

	public void clkAddToCart(int productNumber) {
		btn_addToCart.get(productNumber - 1).click();
		log.info("Clicked on 'add to cart' button of product named as '"
				+ link_productName.get(productNumber - 1).getText() + "'");
		TestBase.test.log(Status.INFO, "Clicked on 'add to cart' button of product named as '"
				+ link_productName.get(productNumber - 1).getText() + "'");
	}

	public Page_product clkView(int productNumber) {
		btn_view.get(productNumber - 1).click();
		log.info("Clicked on 'view' button of product named as '" + link_productName.get(productNumber - 1).getText()
				+ "'");
		TestBase.test.log(Status.INFO, "Clicked on 'view' button of product named as '"
				+ link_productName.get(productNumber - 1).getText() + "'");
		return new Page_product(driver);
	}

	public Page_index clkContinueShopping() {
		btn_continueShopping.click();
		log.info("Clicked on 'coninue shopping' button");
		TestBase.test.log(Status.INFO, "Clicked on 'coninue shopping' button");
		return new Page_index(driver);
	}

}

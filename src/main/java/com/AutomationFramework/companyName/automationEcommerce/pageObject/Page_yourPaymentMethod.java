package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_yourPaymentMethod {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_yourPaymentMethod.class);

	public Page_yourPaymentMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_yourPaymentMethod Class Object Created");
		TestBase.test.log(Status.INFO, "Page_yourPaymentMethod Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id="columns"]/div[1]/span[2]")
	public WebElement lbl_yourPaymentMethod;

	@FindBy(xpath = "//*[@id="center_column"]/h1")
	public WebElement lbl_pleaseChooseYourPaymentMethod;

	@FindBy(xpath = "//*[@id="order_step"]/li[1]/a")
	public WebElement link_summury;

	@FindBy(xpath = "//*[@id="order_step"]/li[2]/a")
	public WebElement link_signIn;

	@FindBy(xpath = "//*[@id="order_step"]/li[3]/a")
	public WebElement link_address;

	@FindBy(xpath = "//*[@id="order_step"]/li[4]/a")
	public WebElement link_shipping;

	@FindBy(xpath = "//*[@id="step_end"]/span")
	public WebElement lbl_payment;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[1]/a")
	public List<WebElement> img_product_productImage;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[2]/p/a")
	public List<WebElement> link_description_productName;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[2]/small[1]")
	public List<WebElement> lbl_description_sku;

	@FindBy(xpath = "//*[@id="cart_summary"]/tbody/tr/td[2]/small/a")
	public List<WebElement> link_description_colorSize;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[3]/span")
	public List<WebElement> lbl_avail_stock;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[4]/span/span[1]")
	public List<WebElement> lbl_unitPrice_productPrice;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[4]/span/span[2]")
	public List<WebElement> lbl_unitPrice_productDiscountPercentage;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[4]/span/span[3]")
	public List<WebElement> lbl_unitPrice_productOldPrice;

	@FindBy(xpath = "//*[@id="cart_summary"]/tbody/tr/td[5]/span")
	public List<WebElement> lbl_qty_productQuantity;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[6]/span")
	public List<WebElement> lbl_total_totalPrice;

	@FindBy(xpath = "//*[@id='total_product']")
	public WebElement lbl_totalProductsPrice;

	@FindBy(xpath = "//*[@id='total_shipping']")
	public WebElement lbl_totalShipping;

	@FindBy(xpath = "//*[@id="total_price"]")
	public WebElement lbl_total;

	@FindBy(xpath = "//*[@id="HOOK_PAYMENT"]/div[1]/div/p/a")
	public WebElement btn_payByBankWire;

	@FindBy(xpath = "//*[@id="HOOK_PAYMENT"]/div[2]/div/p/a")
	public WebElement btn_payByCheck;

	@FindBy(xpath = "//*[@id="center_column"]/div/p/a")
	public WebElement link_continueShopping;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public Page_yourShoppingCart clkSummary() {
		link_summury.click();
		log.info("Clicked on '01.summary' link");
		TestBase.test.log(Status.INFO, "Clicked on 'summary' link");
		return new Page_yourShoppingCart(driver);
	}

	public Page_checkout_addresses clkSignIn() {
		link_signIn.click();
		log.info("Clicked on '02.sign in' link");
		TestBase.test.log(Status.INFO, "Clicked on 'sign in' link");
		return new Page_checkout_addresses(driver);
	}

	public Page_checkout_addresses clkAddress() {
		link_address.click();
		log.info("Clicked on '03.address' link");
		TestBase.test.log(Status.INFO, "Clicked on 'address' link");
		return new Page_checkout_addresses(driver);
	}

	public Page_shipping clkShipping() {
		link_shipping.click();
		log.info("Clicked on '04.shipping' link");
		TestBase.test.log(Status.INFO, "Clicked on '04.shipping' link");
		return new Page_shipping(driver);
	}

	public Page_product clkProductImage(int productImageNumber) {
		img_product_productImage.get(productImageNumber - 1).click();
		log.info("Clicked on product image number = " + (productImageNumber - 1));
		TestBase.test.log(Status.INFO, "Clicked on product image number = " + (productImageNumber - 1));
		return new Page_product(driver);
	}

	public Page_product clkProductName(String productName) {
		Iterator<WebElement> itr = link_description_productName.iterator();
		while (itr.hasNext()) {
			WebElement element = itr.next();
			if (element.getText().trim().equals(productName)) {
				element.click();
				log.info("Clicked on ='" + productName + "' link");
				TestBase.test.log(Status.INFO, "Clicked on ='" + productName + "' link");
				return new Page_product(driver);
				break;
			}
		}

	}

	public Page_product clkProductColorSize(String productColorSize) {
		Iterator<WebElement> itr = link_description_colorSize.iterator();
		while (itr.hasNext()) {
			WebElement element = itr.next();
			if (element.getText().trim().equals(productColorSize)) {
				element.click();
				log.info("Clicked on ='" + productColorSize + "' link");
				TestBase.test.log(Status.INFO, "Clicked on ='" + productColorSize + "' link");
				return new Page_product(driver);
				break;
			}
		}

	}

	public Page_bankwirePayment clkPayByBankWire() {
		btn_payByBankWire.click();
		log.info("Clicked on 'pay by bank wire' button");
		TestBase.test.log(Status.INFO, "Clicked on 'pay by bank wire' button");
		return new Page_bankwirePayment(driver);
	}

	public Page_chequePayment clkPayByCheck() {
		btn_payByCheck.click();
		log.info("Clicked on 'pay by check' button");
		TestBase.test.log(Status.INFO, "Clicked on 'pay by check' button");
		return new Page_chequePayment(driver);
	}

	public Page_index clkContinueShopping() {
		link_continueShopping.click();
		log.info("Clicked on 'continue shopping' button");
		TestBase.test.log(Status.INFO, "Clicked on 'continue shopping' button");
		return new Page_index(driver);

	}

}
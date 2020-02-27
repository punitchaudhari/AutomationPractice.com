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

public class Page_yourShoppingCart {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_yourShoppingCart.class);

	public Page_yourShoppingCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_yourShoppingCart Class Object Created");
		TestBase.test.log(Status.INFO, "Page_yourShoppingCart Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='columns']/div[1]")
	public WebElement txt_PageInfoBar;

	@FindBy(xpath = "//*[@id='cart_title']")
	public WebElement lbl_shoppingCartSummary;

	@FindBy(xpath = "//*[@id='cart_title']/span")
	public WebElement lbl_yourShoppingCartContainsProducts;

	@FindBy(xpath = "//*[@id='order_step']/li[1]/span")
	public WebElement lbl_summury;

	@FindBy(xpath = "//*[@id='order_step']/li[2]/span")
	public WebElement lbl_signIn;

	@FindBy(xpath = "//*[@id='order_step']/li[3]/span")
	public WebElement lbl_address;

	@FindBy(xpath = "//*[@id='order_step']/li[4]/span")
	public WebElement lbl_shipping;

	@FindBy(xpath = "//*[@id='order_step']/li[5]/span")
	public WebElement lbl_payment;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[1]/a")
	public List<WebElement> img_product_productImage;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[2]/p/a")
	public List<WebElement> link_description_productName;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[2]/small[1]")
	public List<WebElement> lbl_description_sku;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[2]/small{2]")
	public List<WebElement> link_description_colorSize;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[3]/span")
	public List<WebElement> lbl_avail_stock;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[4]/span/span")
	public List<WebElement> lbl_unitPrice_productPrice;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[5]/input[2]")
	public List<WebElement> lbl_qty_productQuantity;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[5]/div/a[1]")
	public List<WebElement> btn_qty_minus;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[5]/div/a[2]")
	public List<WebElement> btn_qty_plus;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[6]/span")
	public List<WebElement> lbl_total_totalPrice;

	@FindBy(xpath = "//*[@id='cart_summary']/tbody/tr/td[7]/div/a")
	public List<WebElement> btn_removeProduct;

	@FindBy(xpath = "//*[@id='total_product']")
	public WebElement lbl_totalProductsPrice;

	@FindBy(xpath = "//*[@id='total_shipping']")
	public WebElement lbl_totalShipping;

	@FindBy(xpath = "//*[@id='total_price_without_tax']")
	public WebElement lbl_total1;

	@FindBy(xpath = "//*[@id='total_tax']")
	public WebElement lbl_tax;

	@FindBy(xpath = "//*[@id='total_price']")
	public WebElement lbl_total2;

	@FindBy(xpath = "//*[@id='center_column']/div[3]/div/ul")
	public List<WebElement> tbl_addresses;

	@FindBy(xpath = "//*[@id='center_column']/div[3]/div/ul/li[1]")
	public List<WebElement> lbl_addressTitles;

	@FindBy(xpath = "//*[@id='center_column']/p[2]/a[2]")
	public WebElement link_continueShopping;

	@FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]")
	public WebElement btn_proceedToCheckout;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
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
				break;
			}
		}
		return new Page_product(driver);
	}

	public Page_product clkProductColorSize(String productColorSize) {
		Iterator<WebElement> itr = link_description_colorSize.iterator();
		while (itr.hasNext()) {
			WebElement element = itr.next();
			if (element.getText().trim().equals(productColorSize)) {
				element.click();
				log.info("Clicked on ='" + productColorSize + "' link");
				TestBase.test.log(Status.INFO, "Clicked on ='" + productColorSize + "' link");
				break;
			}
		}
		return new Page_product(driver);
	}

	public void clkMinus(int buttonNumber) {
		btn_qty_minus.get(buttonNumber - 1).click();
		log.info("Clicked on minus button number = " + (buttonNumber - 1));
		TestBase.test.log(Status.INFO, "Clicked on minus button number = " + (buttonNumber - 1));

	}

	public void clkPlus(int buttonNumber) {
		btn_qty_plus.get(buttonNumber - 1).click();
		log.info("Clicked on Plus button number = " + (buttonNumber - 1));
		TestBase.test.log(Status.INFO, "Clicked on Plus button number = " + (buttonNumber - 1));

	}

	public void clkRemove(int buttonNumber) {
		btn_removeProduct.get(buttonNumber - 1).click();
		log.info("Clicked on Remove Product button number = " + (buttonNumber - 1));
		TestBase.test.log(Status.INFO, "Clicked on Remove Product button number = " + (buttonNumber - 1));

	}

	public Page_index clkContinueShopping() {
		link_continueShopping.click();
		log.info("Clicked on 'continue shopping' button");
		TestBase.test.log(Status.INFO, "Clicked on 'continue shopping' button");
		return new Page_index(driver);

	}

	public Page_checkout_addresses clkProceedToCheckout() {
		btn_proceedToCheckout.click();
		log.info("Clicked on 'Proceed to checkout'");
		TestBase.test.log(Status.INFO, "Clicked on 'Proceed to checkout'");
		return new Page_checkout_addresses(driver);
	}

}

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

public class Popup_productQuickView {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Popup_productQuickView.class);

	public Popup_productQuickView(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		log.info("Popup_productQuickView Class Object Created");
		TestBase.test.log(Status.INFO, "Popup_productQuickView Class Object Created");
	}

	@FindBy(xpath = "//*[@id='bigpic']") 
	public WebElement img_productBigImage;

	@FindBy(xpath = "//*[@id='view_full_size']/span")
	public WebElement btn_viewLarger;

	@FindBy(xpath = "//*[@id='view_scroll_left']")
	public WebElement btn_previous;

	@FindBy(xpath = "//*[@id='view_scroll_right']")
	public WebElement btn_next;

	@FindBy(xpath = "//*[@id='thumbs_list_frame']/li/a")
	public List<WebElement> img_productSmallImages;

	@FindBy(xpath = "//*[@id='product']/div/div/div[2]/h1")
	public WebElement lbl_productName;

	@FindBy(xpath = "//*[@id='product_reference']")
	public WebElement lbl_modelDemo;

	@FindBy(xpath = "//*[@id='product_condition']/span")
	public WebElement lbl_condition;

	@FindBy(xpath = "//*[@id='short_description_content']/p")
	public WebElement lbl_productDescription;

	@FindBy(xpath = "//*[@id='product']/div/div/div[2]/p[7]/button[1]")
	public WebElement btn_tweeter;

	@FindBy(xpath = "//*[@id='product']/div/div/div[2]/p[7]/button[2]")
	public WebElement btn_facebook;

	@FindBy(xpath = "//*[@id='product']/div/div/div[2]/p[7]/button[3]")
	public WebElement btn_googlePlus;

	@FindBy(xpath = "//*[@id='product']/div/div/div[2]/p[7]/button[4]")
	public WebElement btn_pinterest;


	@FindBy(xpath = "//*[@id='our_price_display']")
	public WebElement lbl_productPrice;

	@FindBy(xpath = "//*[@id='quantity_wanted']")
	public WebElement txt_quantity;

	@FindBy(xpath = "//*[@id='quantity_wanted_p']/a[1]")
	public WebElement btn_minus;

	@FindBy(xpath = "//*[@id='quantity_wanted_p']/a[2]")
	public WebElement btn_plus;

	@FindBy(xpath = "//*[@id='group_1']")
	public WebElement dd_size;

	@FindBy(xpath = "//*[@id='color_to_pick_list']/li")
	public List<WebElement> btn_color;

	@FindBy(xpath = "//*[@id='add_to_cart']/button")
	public WebElement btn_addToCart;

	@FindBy(xpath = "//*[@id='wishlist_button']")
	public WebElement btn_addToWishlist;

	@FindBy(xpath = "//*[@id='index']/div[2]/div/div/a")
	public WebElement btn_closeProductQuickViewPopupWindow;

}

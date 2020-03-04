package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.select.DropdownHelper;
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

	@FindBy(xpath = "//*[@id='product']/div[2]/div/div/a")
	public WebElement btn_popup_addedToYourWishlist_windowCloseButton;

	@FindBy(xpath = "//*[@id='product']/div[2]/div/div/div/div/p")
	public WebElement lbl_popup_addedToYourWishlist;

	@FindBy(xpath = "//*[@id='product']/div[2]/div/div/div/div/p")
	public WebElement lbl_popup_youMustBeLoggedInToManageYourPlaylist;

	@FindBy(xpath = "//*[@id='product']/div[2]/div/div/a")
	public WebElement btn_popup_youMustBeLoggedInToManageYourPlaylist_windowCloseButton;

	public Page_product clkProductBigImage() {
		img_productBigImage.click();
		log.info("Clicked on 'big product' image");
		TestBase.test.log(Status.INFO, "Clicked on 'big product' image");
		return new Page_product(driver);
	}

	public void clkProuctSmallImage(int imageNumber) {
		img_productSmallImages.get(imageNumber - 1).click();
		log.info("Clicked on small product image number = '" + (imageNumber - 1) + "'");
		TestBase.test.log(Status.INFO, "Clicked on small product image number = '" + (imageNumber - 1) + "'");
	}

	public void clkPreviousButton() {
		btn_previous.click();
		log.info("Clicked on 'previous' button");
		TestBase.test.log(Status.INFO, "Clicked on 'previous' button");
	}

	public void clkNextButon() {
		btn_next.click();
		log.info("Clicked on 'next' button");
		TestBase.test.log(Status.INFO, "Clicked on 'next' button");
	}

	public void clkTweeter() {
		btn_tweeter.click();
		log.info("Clicked on 'tweeter' button");
		TestBase.test.log(Status.INFO, "Clicked on 'tweeter' button");
	}

	public void clkFacebook() {
		btn_facebook.click();
		log.info("Clicked on 'facebook' button");
		TestBase.test.log(Status.INFO, "Clicked on 'facebook' button");
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

	public void setQuantity(String quantity) {
		txt_quantity.clear();
		txt_quantity.sendKeys(quantity);
		log.info("Typed = '" + quantity + "' on 'quantity' text feild");
		TestBase.test.log(Status.INFO, "Typed = '" + quantity + "' on 'quantity' text feild");
	}

	public void clkPlus() {
		btn_plus.click();
		log.info("Clicked on quantity 'plus' button");
		TestBase.test.log(Status.INFO, "Clicked on quantity 'plus' button");
	}

	public void clkMinus() {
		btn_minus.click();
		log.info("Clicked on quantity 'minus' button");
		TestBase.test.log(Status.INFO, "Clicked on quantity 'minus' button");
	}

	public void selectSize(String optionToBeSelected) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_size, optionToBeSelected);
	}

	public void clkColor(int colorNumber) {
		btn_color.get(colorNumber - 1).click();
		log.info("Clicked on color number = '" + (colorNumber - 1) + "'");
		TestBase.test.log(Status.INFO, "Clicked on color number = '" + (colorNumber - 1) + "'");
	}

	public Popup_productAddedInCartStatus clkAddToCart() {
		btn_addToCart.click();
		log.info("Clicked on 'Add to cart' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Add to cart' button");
		return new Popup_productAddedInCartStatus(driver);
	}

	public void clkAddToWishlist() {
		btn_addToWishlist.click();
		log.info("Clicked on 'Add to wishlist' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Add to wishlist' button");
	}

	public void clkAddedToYourWishlistWindowCloseButton() {
		btn_popup_addedToYourWishlist_windowCloseButton.click();
		log.info("Clicked on added to your wishlist 'window close' button");
		TestBase.test.log(Status.INFO, "Clicked on added to your wishlist 'window close' button");
	}

	public void clkYouMustBeLoggedInToManageYourWishlistWindowCloseButton() {
		btn_popup_youMustBeLoggedInToManageYourPlaylist_windowCloseButton.click();
		log.info("Clicked on you must be logged in to manage your wishlist 'window close' button");
		TestBase.test.log(Status.INFO,
				"Clicked on you must be logged in to manage your wishlist 'window close' button");
	}
}

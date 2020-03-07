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

public class Page_product {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_product.class);

	public Page_product(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_product Class Object Created");
		TestBase.test.log(Status.INFO, "Page_product Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='columns']/div[1]")
	public WebElement txt_PageInfoBar;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[2]")
	public WebElement link_navigationBarLink1;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[3]")
	public WebElement link_navigationBarLink2;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[4]")
	public WebElement link_navigationBarLink3;

	@FindBy(xpath = "//*[@id='bigpic']")
	public WebElement img_popup_productBigImage;

	@FindBy(xpath = "//*[@id='product']/div[3]/div/a")
	public WebElement btn_popup_productBigImage_WindowClose;

	@FindBy(xpath = "//*[@id='view_full_size']/span")
	public WebElement btn_viewLarger;

	@FindBy(xpath = "//*[@id='view_scroll_left']")
	public WebElement btn_previous;

	@FindBy(xpath = "//*[@id='view_scroll_right']")
	public WebElement btn_next;

	@FindBy(xpath = "//*[@id='thumbs_list_frame']/li/a")
	public List<WebElement> img_productSmallImages;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/h1")
	public WebElement lbl_productName;

	@FindBy(xpath = "//*[@id='product_reference']")
	public WebElement lbl_modelDemo;

	@FindBy(xpath = "//*[@id='product_condition']/span")
	public WebElement lbl_condition;

	@FindBy(xpath = "//*[@id='short_description_content']/p")
	public WebElement lbl_productDescription;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/p[7]/button[1]")
	public WebElement btn_tweeter;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/p[7]/button[2]")
	public WebElement btn_facebook;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/p[7]/button[3]")
	public WebElement btn_googlePlus;

	@FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/p[7]/button[4]")
	public WebElement btn_pinterest;

	@FindBy(xpath = "//*[@id='product_comments_block_extra']/ul/li/a")
	public WebElement btn_writeAReview;

	@FindBy(xpath = "//*[@id='send_friend_button']")
	public WebElement btn_sendToAFriend;

	@FindBy(xpath = "//*[@id='usefull_link_block']/li[2]/a")
	public WebElement btn_print;

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

	@FindBy(xpath = "//*[@id='wrapResetImages']/a")
	public WebElement btn_displayAllPictures;

	@FindBy(xpath = "//*[@id='center_column']/div/section[1]/h3")
	public WebElement lbl_dataSheet;

	@FindBy(xpath = "//*[@id='center_column']/div/section[1]/table/tbody/tr[1]/td[2]")
	public WebElement lbl_compostions;

	@FindBy(xpath = "//*[@id='center_column']/div/section[1]/table/tbody/tr[2]/td[2]")
	public WebElement lbl_styles;

	@FindBy(xpath = "//*[@id='center_column']/div/section[1]/table/tbody/tr[3]/td[2]")
	public WebElement lbl_properties;

	@FindBy(xpath = "//*[@id='center_column']/div/section[2]/h3")
	public WebElement lbl_moreInfo;

	@FindBy(xpath = "//*[@id='center_column']/div/section[2]/div/p")
	public WebElement lbl_moreInfoDescription;

	@FindBy(xpath = "//*[@id='#idTab5']")
	public WebElement lbl_reviews;

	@FindBy(xpath = "//*[@id='new_comment_tab_btn']")
	public WebElement btn_beTheFirstToWriteYourReview;

	// POPUP WRITE A REVIEW
	@FindBy(xpath = "//*[@id='id_new_comment_form']/h2")
	public WebElement lbl_popup_writeAReview_writeAReview;

	@FindBy(xpath = "//*[@id='id_new_comment_form']/div/div[1]/div/p[1]/strong")
	public WebElement lbl_popup_writeAReview_productName;

	@FindBy(xpath = "//*[@id='comment_title']")
	public WebElement txt_popup_writeAReview_title;

	@FindBy(xpath = "//*[@id='content']")
	public WebElement txt_popup_writeAReview_comment;

	@FindBy(xpath = "//*[@id='submitNewMessage']")
	public WebElement btn_popup_writeAReview_send;

	@FindBy(xpath = "//*[@id='new_comment_form_footer']/p[2]/a")
	public WebElement btn_popup_writeAReview_cancel;

	@FindBy(xpath = "//*[@id='product']/div[3]/div/div/a")
	public WebElement btn_popup_writeAReview_windowClosebutton;

	// POPUP NEW COMMENT
	@FindBy(xpath = "//*[@id='product']/div[3]/div/div/div/h2")
	public WebElement lbl_popup_newComment_newComment;

	@FindBy(xpath = "//*[@id='product']/div[3]/div/div/div/p[1]")
	public WebElement lbl_popup_newComment_yourCommentHasBeenAdded;

	@FindBy(xpath = "//*[@id='product']/div[3]/div/div/div/p[2]/button")
	public WebElement btn_popup_newComment_ok;

	@FindBy(xpath = "//*[@id='product']/div[3]/div/a")
	public WebElement btn_popup_newComment_windowCloseButton;

	// POPUP SEND TO A FRIEND
	@FindBy(xpath = "//*[@id='send_friend_form']/h2")
	public WebElement lbl_popup_sendToAFriend_sendToAFriend;

	@FindBy(xpath = "//*[@id='send_friend_form']/div/div[1]/div/p[1]/strong")
	public WebElement lbl_popup_sendToAFriend_productName;

	@FindBy(xpath = "//*[@id='friend_name']")
	public WebElement txt_popup_sendToAFriend_nameOfYourFriend;

	@FindBy(xpath = "//*[@id='friend_email']")
	public WebElement txt_popup_sendToAFriend_emailAddressOfYourFriend;

	@FindBy(xpath = "//*[@id='sendEmail']")
	public WebElement btn_popup_sendToAFriend_send;

	@FindBy(xpath = "//*[@id='send_friend_form_content']/p/a")
	public WebElement btn_popup_sendToAFriend_cancel;

	@FindBy(xpath = "//*[@id='product']/div[3]/div/div/a")
	public WebElement btn_popup_sendToAFriend_windowCloseButton;

	// POPUP ADDED TO YOUR WHISHLIST
	@FindBy(xpath = "//*[@id='product']/div[3]/div/div/div/div/p")
	public WebElement lbl_popup_addedToYourWishlist;

	@FindBy(xpath = "//*[@id='product']/div[3]/div/div/a")
	public WebElement btn_popup_addedToYourWishlist_windowCloseButton;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public void clkNavigationBarLink1() {
		link_navigationBarLink1.click();
		log.info("Clicked on '" + link_navigationBarLink1.getText() + "' link");
		TestBase.test.log(Status.INFO, "Clicked on '" + link_navigationBarLink1.getText() + "' link");
	}

	public void clkNavigationBarLink2() {
		link_navigationBarLink2.click();
		log.info("Clicked on '" + link_navigationBarLink2.getText() + "' link");
		TestBase.test.log(Status.INFO, "Clicked on '" + link_navigationBarLink2.getText() + "' link");

	}

	public void clkNavigationBarLink3() {
		link_navigationBarLink3.click();
		log.info("Clicked on '" + link_navigationBarLink3.getText() + "' link");
		TestBase.test.log(Status.INFO, "Clicked on '" + link_navigationBarLink3.getText() + "' link");

	}

	public void clkPopup_ProductBigImage() {
		img_popup_productBigImage.click();
		log.info("Clicked on 'product image'");
		TestBase.test.log(Status.INFO, "Clicked on 'product image'");
	}

	public void clkPopup_ProductBigImage_WindowCloseButton() {
		btn_popup_productBigImage_WindowClose.click();
		log.info("Clicked on 'window close' button");
		TestBase.test.log(Status.INFO, "Clicked on 'window close' button");
	}

	public void clkViewLarger() {
		btn_viewLarger.click();
		log.info("Clicked on 'view larger' button");
		TestBase.test.log(Status.INFO, "Clicked on 'view larger' button");
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

	public void clkWriteAReview() {
		btn_writeAReview.click();
		log.info("Clicked on 'Write a review' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Write a review' button");
	}

	public void setPopup_writeAReview_title(String title) {
		txt_popup_writeAReview_title.clear();
		txt_popup_writeAReview_title.sendKeys(title);
		log.info("Typed='" + title + "' on 'title' field of write a review popup");
		TestBase.test.log(Status.INFO, "Typed='" + title + "' on 'title' field of write a review popup");
	}

	public void setPopup_writeAReview_comment(String comment) {
		txt_popup_writeAReview_comment.clear();
		txt_popup_writeAReview_comment.sendKeys(comment);
		log.info("Typed='" + comment + "' on 'comment' field of write a review popup");
		TestBase.test.log(Status.INFO, "Typed='" + comment + "' on 'comment' field of write a review popup");
	}

	public void clkPopup_writeAReview_send() {
		btn_popup_writeAReview_send.click();
		log.info("Clicked on 'send' button");
		TestBase.test.log(Status.INFO, "Clicked on 'send' button");
	}

	public void clkPopup_writeAReview_cancel() {
		btn_popup_writeAReview_cancel.click();
		log.info("Clicked on 'cancel' button");
		TestBase.test.log(Status.INFO, "Clicked on 'cancel' button");
	}

	public void clkPopup_writeAReview_WindowCloseButton() {
		btn_popup_writeAReview_windowClosebutton.click();
		log.info("Clicked on 'write a review window close' button");
		TestBase.test.log(Status.INFO, "Clicked on 'write a review window close' button");
	}

	public void clkSendToFriend() {
		btn_sendToAFriend.click();
		log.info("Clicked on 'send to a friend' button");
		TestBase.test.log(Status.INFO, "Clicked on 'send to a friend' button");
	}

	public void setPopup_sendToAFriend_nameOfYourFriend(String nameOfYourFriend) {
		txt_popup_sendToAFriend_nameOfYourFriend.clear();
		txt_popup_sendToAFriend_nameOfYourFriend.sendKeys(nameOfYourFriend);
		log.info("Typed='" + nameOfYourFriend + "' on 'name of your friend' text field");
		TestBase.test.log(Status.INFO, "Typed='" + nameOfYourFriend + "' on 'name of your friend' text field");
	}

	public void setPopup_sendToAFriend_EmailAddressOfYourFriend(String emailAddressOfYourFriend) {
		txt_popup_sendToAFriend_emailAddressOfYourFriend.clear();
		txt_popup_sendToAFriend_emailAddressOfYourFriend.sendKeys(emailAddressOfYourFriend);
		log.info("Typed='" + emailAddressOfYourFriend + "' on 'name of your friend' text field");
		TestBase.test.log(Status.INFO, "Typed='" + emailAddressOfYourFriend + "' on 'name of your friend' text field");
	}

	public void clkPopup_sendToAFriend_send() {
		btn_popup_sendToAFriend_send.click();
		log.info("Clicked on 'send' button");
		TestBase.test.log(Status.INFO, "Clicked on 'send' button");
	}

	public void clkPopup_sendToAFriend_cancel() {
		btn_popup_sendToAFriend_cancel.click();
		log.info("Clicked on 'cancel' button");
		TestBase.test.log(Status.INFO, "Clicked on 'cancel' button");
	}

	public void clkPopup_sendToAFriend_WindowCloseButton() {
		btn_popup_sendToAFriend_windowCloseButton.click();
		log.info("Clicked on send to a friend 'window close' button");
		TestBase.test.log(Status.INFO, "Clicked on send to a friend 'window close' button");
	}

	public void clkPrint() {
		btn_print.click();
		log.info("Clicked on 'Print' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Print' button");
	}

	public void setQuantity(String quantity) {
		txt_quantity.clear();
		txt_quantity.sendKeys(quantity);
		log.info("Typed='" + quantity + "' on 'quantity' text feild");
		TestBase.test.log(Status.INFO, "Typed='" + quantity + "' on 'quantity' text feild");
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

	public void clkAddToCart() {
		btn_addToCart.click();
		log.info("Clicked on 'Add to cart' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Add to cart' button");
	}

	public void clkAddToWishlist() {
		btn_addToWishlist.click();
		log.info("Clicked on 'Add to wishlist' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Add to wishlist' button");
	}

	public void clkBeTheFirstToWriteAReview() {
		btn_beTheFirstToWriteYourReview.click();
		log.info("Clicked on 'Be the first to write a review' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Be the first to write a review' button");
	}

	public void clkAddedToYourWishlistWindowCloseButton() {
		btn_popup_addedToYourWishlist_windowCloseButton.click();
		log.info("Clicked on added to your wishlist 'window close' button");
		TestBase.test.log(Status.INFO, "Clicked on added to your wishlist 'window close' button");
	}
}

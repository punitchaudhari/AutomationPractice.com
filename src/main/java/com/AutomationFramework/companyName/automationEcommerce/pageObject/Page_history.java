package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.PageOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_history {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_history.class);
	
	public Page_history(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("Page_history Class Object Created");
		TestBase.test.log(Status.INFO,"Page_history Class Object Created");	
	}

	
	@FindBy(xpath="//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;
	
	@FindBy(xpath="//*[@id='columns']/div[1]/a[2]")
	public WebElement link_myAccount;
	
	//ORDERS HISTORY SECTION
	@FindBy(xpath="//*[@id='center_column']/h1")
	public WebElement lbl_orderHistory;
	
	@FindBy(xpath="//*[@id='center_column']/p")
	public WebElement lbl_hereAreOrders;
	
	@FindBy(xpath="//*[@id='order-list']/thead/tr/th")
	public List<WebElement> tbl_columnNames;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr")
	public List<WebElement> tbl_rows;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr/td[1]")
	public List<WebElement> tbl_rows_orderReference;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr/td[2]")
	public List<WebElement> tbl_rows_date;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr/td[3]")
	public List<WebElement> tbl_rows_totalPrice;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr/td[4]")
	public List<WebElement> tbl_rows_payment;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr/td[5]/span")
	public List<WebElement> tbl_rows_status;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr[1]/td[6]/a")
	public List<WebElement> tbl_rows_invoicePdf;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr/td[7]/a[1]")
	public List<WebElement> tbl_rows_details;
	
	@FindBy(xpath="//*[@id='order-list']/tbody/tr/td[7]/a[2]")
	public List<WebElement> tbl_rows_reorder;
	
	
	//hidden area elements which are displayed after clicking  DETAILS button
	@FindBy(xpath="//*[@id='submitReorder']/p/strong")
	public WebElement lbl_orderReferenceAndDate;
	
	@FindBy(xpath="//*[@id='submitReorder']/a")
	public WebElement btn_reorder;
	

	@FindBy(xpath="//*[@id='block-order-detail']/div[2]/p[1]")
	public WebElement lbl_carrier;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[2]/p[2]/span")
	public WebElement lbl_paymentMethod;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[2]/p[3]/a")
	public WebElement link_downloadYourInvoiceAsPdfFile;
	
	//FOLLOW YOUR ORDERS STEP BY STRP SECTION
	@FindBy(xpath="//*[@id='block-order-detail']/h1")
	public WebElement lbl_followYourOrdersStepByStep;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[3]/table/thead/tr/th")
	public List<WebElement> tbl2_columnNames;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[3]/table/tbody/tr/td[1]")
	public List<WebElement> tbl2_rows_date;

	@FindBy(xpath="//*[@id='block-order-detail']/div[3]/table/tbody/tr/td[2]")
	public List<WebElement> tbl2_rows_status;
	
	//DELIVERY ADDRESS SECTION
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[1]/h3")
	public WebElement lbl_deliveryAddress;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[2]/span[1]")
	public WebElement lbl_deliveryAddress_firstName;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[2]/span[2]")
	public WebElement lbl_deliveryAddress_lastName;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[3]")
	public WebElement lbl_deliveryAddress_companyName;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[4]/span[1]")
	public WebElement lbl_deliveryAddress_address1;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[4]/span[2]")
	public WebElement lbl_deliveryAddress_address2;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[5]/span[1]")
	public WebElement lbl_deliveryAddress_city;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[5]/span[2]")
	public WebElement lbl_deliveryAddress_state;

	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[5]/span[3]")
	public WebElement lbl_deliveryAddress_postalCode;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[6]/span")
	public WebElement lbl_deliveryAddress_country;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[7]/span")
	public WebElement lbl_deliveryAddress_phone;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[1]/ul/li[8]")
	public WebElement lbl_deliveryAddress_mobile;
	
	//INVOICE ADDRESS SECTION
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[2]/span[1]")
	public WebElement lbl_invoiceAddress_firstName;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[2]/span[2]")
	public WebElement lbl_invoiceAddress_lastName;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[3]")
	public WebElement lbl_invoiceAddress_companyName;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[4]/span[1]")
	public WebElement lbl_invoiceAddress_address1;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[4]/span[2]")
	public WebElement lbl_invoiceAddress_address2;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[5]/span[1]")
	public WebElement lbl_invoiceAddress_city;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[5]/span[2]")
	public WebElement lbl_invoiceAddress_state;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[5]/span[3]")
	public WebElement lbl_invoiceAddress_postalCode;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[6]/span")
	public WebElement lbl_invoiceAddress_countryName;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[7]/span")
	public WebElement lbl_invoiceAddress_phone;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[4]/div/div[2]/ul/li[8]")
	public WebElement lbl_invoiceAddress_mobile;
	
	//TABLE 3 SECTION
	@FindBy(xpath="//*[@id='order-detail-content']/table/thead/tr/th")
	public List<WebElement> tbl3_columnNames;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tbody/tr/td[1]")
	public List<WebElement> tbl3_reference;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tbody/tr/td[2]")
	public List<WebElement> tbl3_product;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tbody/tr/td[3]")
	public List<WebElement> tbl3_quantity;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tbody/tr/td[4]")
	public List<WebElement> tbl3_unitPrice;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tbody/tr/td[5]")
	public List<WebElement> tbl3_totalPrice;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tfoot/tr/td[1]")
	public List<WebElement> tbl3_rowNames;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tfoot/tr[1]/td[2]/span")
	public WebElement tbl3_itemsTaxExcl;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tfoot/tr[2]/td[2]/span")
	public WebElement tbl3_itemsTaxIncl;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tfoot/tr[3]/td[2]/span")
	public WebElement tbl3_shippingAndHandlingTaxIncl;
	
	@FindBy(xpath="//*[@id='order-detail-content']/table/tfoot/tr[4]/td[2]/span")
	public WebElement tbl3_total;
	
	//TABLE 4 SECTION
	@FindBy(xpath="//*[@id='block-order-detail']/table/thead/tr/th")
	public List<WebElement> tbl4_columnNames;
	
	@FindBy(xpath="//*[@id='block-order-detail']/table/tbody/tr/td[1]")
	public WebElement tbl4_date;
	
	@FindBy(xpath="//*[@id='block-order-detail']/table/tbody/tr/td[2]")
	public WebElement tbl4_carrier;
	
	@FindBy(xpath="//*[@id='block-order-detail']/table/tbody/tr/td[3]")
	public WebElement tbl4_weight;
	
	@FindBy(xpath="//*[@id='block-order-detail']/table/tbody/tr/td[4]")
	public WebElement tbl4_shoppingCost;
	
	@FindBy(xpath="//*[@id='block-order-detail']/table/tbody/tr/td[5]")
	public WebElement tbl4_trackingNumber;
	
	//ADD MESSAGE SECTION
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[5]/table/thead/tr/th")
	public List<WebElement>  tbl5_columnNames;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[5]/table/tbody/tr[1]")
	public List<WebElement>  tbl5_rows;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[5]/table/tbody/tr/td[1]")
	public List<WebElement> tbl5_rows_from;
	
	@FindBy(xpath="//*[@id='block-order-detail']/div[5]/table/tbody/tr/td[2]")
	public List<WebElement> tbl5_rows_message;
	
	@FindBy(xpath="//*[@id='block-order-detail']/p")
	public WebElement lbl_messaegeSentSuccessfully;
	
	@FindBy(xpath="//*[@id='sendOrderMessage']/h3")
	public WebElement lbl_addMessage;

	@FindBy(xpath="//*[@id='sendOrderMessage']/p[1]")
	public WebElement lbl_ifYouWouldLikeToAddcomment;
	
	@FindBy(xpath="//*[@id='sendOrderMessage']/p[2]/select")
	public WebElement dd_product;

	@FindBy(xpath="//*[@id='sendOrderMessage']/p[3]/textarea")
	public WebElement txt_AddMessage_textBox;

	@FindBy(xpath="//*[@id='sendOrderMessage']/div/button")
	public WebElement btn_send;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/a")
	public WebElement btn_backToYourAccount;

	@FindBy(xpath="//*[@id='center_column']/ul/li[2]/a")
	public WebElement btn_home;

		
	public Page_index clkHomeIcon(){
		img_homeIcon.click();
		log.info("Clicking on 'Home icon' ");
		TestBase.test.log(Status.INFO,  "Clicking on 'Home icon' ");
		return new Page_index(driver);
	}
	public Page_myAccount clkMyAccount(){
		link_myAccount.click();
		log.info("Clicking on 'My Account' link");
		TestBase.test.log(Status.INFO,  "Clicking on 'My Account' link");
		return new Page_myAccount(driver);
	}

	public void clkOrderReference(String referenceCodeText) {
		Iterator<WebElement> iterator = tbl_rows_orderReference.iterator();
		while (iterator.hasNext()) {
			WebElement element = iterator.next();
			if (element.getText().trim().equals(referenceCodeText)) {
				element.click();
				log.info("Clicking on '"+ element.getText().toString().trim() + "' ");
				TestBase.test.log(Status.INFO, "Clicking on '" +element.getText().toString().trim()  + "' ");
			}
		}

	}

	public void clkPdf(int rowNumber) {
		tbl_rows_invoicePdf.get(rowNumber - 1).click();
		log.info("Clicked on pdf number = '" + (rowNumber - 1) + "'");
		TestBase.test.log(Status.INFO, "Clicked on pdf number = '" + (rowNumber - 1) + "'");
	}

	public void clkDetails(int rowNumber) {
		tbl_rows_details.get(rowNumber - 1).click();
		log.info("Clicked on Details button number = '" + (rowNumber - 1) + "'");
		TestBase.test.log(Status.INFO, "Clicked on Details button number = '" + (rowNumber - 1) + "'");

	}

	public Page_order clkReorder(int rowNumber) {
		tbl_rows_reorder.get(rowNumber - 1).click();
		log.info("Clicked on reorder button number = '" + (rowNumber - 1) + "'");
		TestBase.test.log(Status.INFO, "Clicked on reorder button number = '" + (rowNumber - 1) + "'");

		return new Page_order(driver);
	}
	public Page_order clkReorder(){
		btn_reorder.click();
		log.info("Clicked on 'Reorder' button");
		TestBase.test.log(Status.INFO,  "Clicked on 'Reorder' button");
		return new Page_order(driver);
	}
	public void clkDownloadYourInvoiceAsPdfFile(){
		link_downloadYourInvoiceAsPdfFile.click();
		log.info("Clicked on 'download your invoice as pdf file' link  ");
		TestBase.test.log(Status.INFO, "Clicked on 'download your invoice as pdf file' link  " );
	}
	public void setAddMessageTextbox (String text){
		txt_AddMessage_textBox.sendKeys(text);
		log.info("Typed ='"+text+"' on add messasge text box");
		TestBase.test.log(Status.INFO,  "Typed ='"+text+"' on add messasge text box");
	}
	public void clkSend(){
		btn_send.click();
		log.info("Clicked on 'send' button  ");
		TestBase.test.log(Status.INFO,"Clicked on 'send' button  "  );
	}
	public Page_myAccount clkBackToYourAccount(){
		btn_backToYourAccount.click();
		log.info("Clicked on 'back to your account' button  ");
		TestBase.test.log(Status.INFO,  "Clicked on 'back to your account' button  ");
		return new Page_myAccount(driver);
	}
	public Page_index clkHome(){
		btn_home.click();
		log.info("Clicked on 'Home' button  ");
		TestBase.test.log(Status.INFO,  "Clicked on 'Home' button  ");
		return new Page_index(driver);
	}
		

	}

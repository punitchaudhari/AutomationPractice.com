package com.AutomationFramework.companyName.automationEcommerce.helper.assertion;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;
/*import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;
*/
public class AssertionHelper {
	static Logger log = LoggerHelper.getLogger(AssertionHelper.class);
	private WebDriver driver;
	
	// constructor of AssertionHelper helper class
	public AssertionHelper(WebDriver driver) {
		log.info("AssertionHelper class Object created");
		TestBase.test.log(Status.INFO,"AssertionHelper class Object created");
	
		this.driver =driver;
	}
	/**
	 * this method passse the test script intentionally
	 */
	public static void makeTrue() {
		log.info("making scipt PASS");
		TestBase.test.log(Status.INFO,"making scipt PASS");	
		Assert.assertTrue(true);
	}

	/**
	 * this method fails the test script intentionally
	 */
	public static void makeFalse() {
		log.info("making scipt FAIL");
		TestBase.test.log(Status.INFO,"making scipt FAIL");
		Assert.assertTrue(false);
	}

	public static void makeTrue(String message) {
		log.info("making scipt PASS" + message);
		TestBase.test.log(Status.INFO,"making scipt PASS" + message);
		Assert.assertTrue(true, message);
	}

	public static void makeFalse(String message) {
		log.info("making scipt FAIL " + message);
		TestBase.test.log(Status.INFO,"making scipt FAIL " + message);
		Assert.assertTrue(false, message);
	}

	/**
	 * this method Passes the test script if passed boolean value argument is
	 * TRUE else test FAILS
	 * 
	 * @param status
	 */
	public void verifyTrue(Boolean status) {
			Assert.assertTrue(status);
	}

	/**
	 * this method Fails the test script if passed boolean value argument is
	 * False else test PASSES
	 * 
	 * @param status
	 */
	public static void verifyFalse(Boolean status) {
		Assert.assertFalse(status);
	}


	/**
	 * this method verify's that paassed argument is NULL if it is Test Passes
	 * else fails
	 * 
	 * @param string
	 */
	public static void verifyNull(String string) {
		log.info("verifying that= " + string + " =is NULL");
		TestBase.test.log(Status.INFO,"verifying that= " + string + " =is NULL");
		Assert.assertNull(string);
	}

	/**
	 * this method verify's that paassed argument is NOT NULL if it is Test
	 * Passes else fails
	 * 
	 * @param string
	 */
	public static void verifyNotNull(String string) {
		log.info("verifying that = " + string + " =is NOT NULL");
		TestBase.test.log(Status.INFO,"verifying that = " + string + " =is NOT NULL"); 	
		Assert.assertNotNull(string);
	}

	public static void fail(){
		log.info("Test is <<FAILED>>");
		TestBase.test.log(Status.INFO,"Test is ||FAILED||");
		Assert.assertTrue(false);

	}
	
	public static void pass(){
		Assert.assertTrue(true);
		log.info("Test is <<PASSED>>");
		 TestBase.test.log(Status.INFO,"Test is ||PASSED||"); 		
	}
	
	public static void updateTestStatus(boolean status){
		if(status){
			pass();
		}
		else{
			fail();
		}
	}
}

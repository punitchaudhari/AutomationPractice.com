package com.AutomationFramework.companyName.automationEcommerce.helper.assertion;

import org.apache.log4j.Logger;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;
/*import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;
*/
public class SoftAssertionHelper extends SoftAssert{
	Logger log = LoggerHelper.getLogger(SoftAssertionHelper.class);
	
	 @Override
	  public void onAssertSuccess(IAssert<?> assertCommand) {
		 if(assertCommand.getMessage()==null){
	   // System.err.println(assertCommand.getMessage() + " <PASSED> ");
	    TestBase.test.log(Status.INFO," Test step is : ||PASSED||");
	    log.info("Test step is : <<PASSED>>");
		 }
		 else{
			  TestBase.test.log(Status.INFO,assertCommand.getMessage() +": ||PASSED||");
			    log.info(assertCommand.getMessage()+" : <<PASSED>>");
		 }
		 }

	  @Override
	  public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
	    String suffix =  String.format("Expected [%s] but found [%s]",assertCommand.getExpected().toString(), assertCommand.getActual().toString());
	   // System.err.println(assertCommand.getMessage() + " <FAILED>. " + suffix);
	    
	    if(assertCommand.getMessage()== null){
	        TestBase.test.log(Status.WARNING," Test step is : ||FAILED|| "+suffix);
		    log.error(" Test step is : <<FAILED>> "+suffix);	
	    }
	    else{
	    	TestBase.test.log(Status.WARNING,assertCommand.getMessage() +": ||FAILED|| " +suffix);
		    log.error(assertCommand.getMessage()+" : <<FAILED>>"+suffix);
	    }
	  }

}

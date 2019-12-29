package com.AutomationFramework.companyName.automationEcommerce.helper.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/*import com.uiFrameworkVersion1.companyName.mercury_tours.helper.resource.resourceHelper;
*/
public class LoggerHelper {
	private static boolean root = false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		// the below method comes from log4j class and used to set and configure custom log4j properties file that we have created and designed
		String path= "src\\main\\resources\\configfile\\log4j.properties";
		PropertyConfigurator.configure(path);
				root = true;
		return Logger.getLogger(cls);
	}

  //run this to test if its working
	/*
	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	log.info("good to go");
	log.info("good to go");
	log.info("good to go");
	
		}
	
	*/
}


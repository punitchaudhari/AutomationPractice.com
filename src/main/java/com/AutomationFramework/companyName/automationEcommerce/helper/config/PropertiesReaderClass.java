package com.AutomationFramework.companyName.automationEcommerce.helper.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderClass {
	private static final Object String = null;
	static Properties prop;
	static FileInputStream fis;
	static File file;

	public static Properties PropertiesReaderClass() {

		try {
			file = new File("src/main/resources/configfile/project_config_file.properties");
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;

	}

	
	public static String getProperty(String key){
		Properties prop1 = PropertiesReaderClass();
		 return prop1.getProperty(key);
		 
		
	}
	public static String getHomePageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("homePageUrl");

	}

	public static String getCreateAccountSuccessPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("createAccountSuccessPageUrl");

	}

	public static String getCruisesPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("cruisesPageUrl");

	}

	public static String getindexPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("indexPageUrl");

	}

	public static String getItineraryPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("itineraryPageUrl");

	}

	public static String getProfilePageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("profilePageUrl");

	}

	public static String getPurchasePageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("purchasePageUrl");

	}

	public static String getPurchse2PageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("purchse2PageUrl");

	}

	public static String getRegisterPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("registerPageUrl");

	}

	public static String getReservationPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("reservationPageUrl");

	}

	public static String getReservation2PageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("reservation2PageUrl");

	}

	public static String getSignOnPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("signOnPageUrl");

	}

	public static String getUnderConstructionPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("underConstructionPageUrl");

	}

	public static String getWelcomePageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("welcomePageUrl");

	}

	public static long getImplicitWait() {

		Properties prop1 = PropertiesReaderClass();
		return Long.parseLong(prop1.getProperty("impliciteWait"));

	}

	public static long getExplicitWait() {

		Properties prop1 = PropertiesReaderClass();
		return Long.parseLong(prop1.getProperty("explictieWait"));
	}

	public static long getPollingEvery() {

		Properties prop1 = PropertiesReaderClass();
		return Long.parseLong(prop1.getProperty("pollingevery"));

	}

	public static String getUserName() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("username");

	}

	public static String getPassword() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("password");

	}
	
	public static String getValidUserName() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("validUsername");

	}

	public static String getValidPassword() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("validPassword");

	}
	public static String getInValidUserName() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("invalidUsername");

	}

	public static String getInValidPassword() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("invalidPassword");

	}
	

	/*
	 * public static void main(String[] args) throws FileNotFoundException,
	 * IOException { PropertiesReaderClass rdr= new PropertiesReaderClass();
	 * rdr.getApplicationUrl(); }
	 */
	// return prop1
}

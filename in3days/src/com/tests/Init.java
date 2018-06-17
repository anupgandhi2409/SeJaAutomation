package com.tests;

import org.testng.annotations.Test;

import com.utility.UtilityScript;

public class Init {
	
	@Test
	public void intialize() {
	
		try {
			UtilityScript.loadConfigPropertiesFile();
			UtilityScript.launchBrowser(UtilityScript.configProp.getProperty("browsertype"));
			UtilityScript.loadURL(UtilityScript.configProp.getProperty("siteURL"));
			UtilityScript.timeOutInSeconds(30);
			UtilityScript.windowMaximize();
			UtilityScript.closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
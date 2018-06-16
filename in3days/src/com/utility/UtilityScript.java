// screen capture, open file stream, file operations

package com.utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityScript {

	public static Properties configProp;
	public static WebDriver driver;
	
	public static void launchBrowser(String browserType) {
		
		if (browserType=="ChromeBrowser"){
				System.setProperty("webdriver.chrome.driver","C://SeJaAutomation//in3days//lib//chromedriver.exe");
				driver = new ChromeDriver();
		}
	}
	
	public static void loadURL(String URL) throws Exception {
			driver.get(URL);
	}
	
	public static void loadConfigPropertiesFile() throws Exception{
		configProp = new Properties();
		InputStream fis = new FileInputStream("C:/SeJaAutomation/in3days/src/com/config/config.properties");
		configProp.load(fis);

	}
	
	public static void timeOutInSeconds(int x) {
			driver.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser() {
			driver.close();
	}
	
	public static void windowMaximize() {
			driver.manage().window().maximize();
	}
}
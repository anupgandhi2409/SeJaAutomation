package com.tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Init {
	
	@Test
	public void intialize() throws Exception {
		
		Properties Prop = new Properties();
		FileInputStream fis = new FileInputStream("config.properties");
		Prop.load(fis);
		
		//System.setProperty("webdriver.gecko.driver.","C://SeJaAutomation//in3days//lib//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C://SeJaAutomation//in3days//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		
		//driver.get(Prop.getProperty("siteURL"));
	}
}
package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
	static public WebDriver getDriver(String browser)
	{
		if(browser.contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Selenium\\Driver\\Firefox Installer.exe");
			return new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Driver\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else
			
			//ssss
			return null;
		
}
}

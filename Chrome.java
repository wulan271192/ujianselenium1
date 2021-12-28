package com.UjianSelenium1.sqa.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategySelenium {
	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver", "D:/driverchrome/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		
		return new ChromeDriver(options);
	}
}



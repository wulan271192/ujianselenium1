package com.UjianSelenium1.sqa.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class DriverSingletonSelenium {
	private static DriverSingletonSelenium instance = null;
	private static WebDriver driver;
	
	public DriverSingletonSelenium(){
	intantiate("chrome");
	}
	public WebDriver intantiate (String strategy) {
		DriverStrategySelenium driverStrategySelenium = DriverStrategyImplementorSelenium.chooseStrategy(strategy);
		driver = driverStrategySelenium.setStrategy();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
	public static DriverSingletonSelenium getInstance() {
		if(instance==null) {
			instance = new DriverSingletonSelenium();
			
		}
		return instance;
	}
	public static void closeObjectInstance() {
		
	}
	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

}




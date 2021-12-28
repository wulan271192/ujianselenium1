package com.UjianSelenium1.sqa.Driver;

import com.UjianSelenium1.sqa.Driver.*;

public class DriverStrategyImplementorSelenium {
	
	public static DriverStrategySelenium chooseStrategy(String strategy)
	{
		switch (strategy) {
		case "chrome":
			return new Chrome();
			
		case "firefox":
			return new Firefox();
			
			default:
				return null;
		}
	}

}

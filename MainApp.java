package com.UjianSelenium1.sqa.main;

import org.openqa.selenium.WebDriver;

import com.UjianSelenium1.sqa.Driver.DriverSingletonSelenium;
import com.UjianSelenium1.sqa.UjianSelenium.AddToCart;
import com.UjianSelenium1.sqa.UjianSelenium.AutomationPracticeUjian;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingletonSelenium.getInstance().getDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		AutomationPracticeUjian automationPracticeUjian = new AutomationPracticeUjian();
		automationPracticeUjian.SignIn();
		automationPracticeUjian.CreateAccount("wulan33@gmail.com");
		automationPracticeUjian.setGender(2);	
		automationPracticeUjian.FormInformation("wulan","nurfadilah","wul27");
		automationPracticeUjian.Days(9);
		automationPracticeUjian.Months(10);
		automationPracticeUjian.Years(31);
		automationPracticeUjian.Ceklis();
		automationPracticeUjian.FormAddress("juaracoding","jakarta","tangerang","banten");
		automationPracticeUjian.State(6);
		automationPracticeUjian.FormAddressNext("12345","nothing","021 9999999","082210209680");;
		
		AddToCart addtocart = new AddToCart();
		addtocart.Dresses();
		addtocart.PilihDresses();
		addtocart.CartDress();
		addtocart.TShirts();
		addtocart.CartTShirt();
		addtocart.CheckOut();
		addtocart.OrderMessage("Dont try this at home");
		addtocart.CheckBoxShipping();
		addtocart.Payment();
		addtocart.Confirm();
		
	}

		
		
		
		
	}

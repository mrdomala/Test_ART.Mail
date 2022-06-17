package com.art.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Download_Ecard {
	WebDriver driver;

	// WebElement
	

	// Constructor
	public Download_Ecard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Page Objects (For Exception Cases)

}
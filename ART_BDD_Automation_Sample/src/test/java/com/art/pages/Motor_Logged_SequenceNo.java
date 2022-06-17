package com.art.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Motor_Logged_SequenceNo {
	WebDriver driver;

	// WebElement
	

	// Constructor
	public Motor_Logged_SequenceNo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Page Objects (For Exception Cases)
}

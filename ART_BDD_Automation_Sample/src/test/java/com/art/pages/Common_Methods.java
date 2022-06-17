package com.art.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common_Methods {
	WebDriver project_Driver;

	// Generic Click Method
	public void genericClick(WebElement elementToBeClicked) {

		elementToBeClicked.click();
	}

	// Generic Click Method using enter
	public void genericClickEnter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}
	
	// Generic Clear Method using enter
		public void genericClear(WebElement element) {
			element.clear();
		}

	// Generic SendKeys Method
	public void genericSendKeys(WebElement element, String text) {
		//element.sendKeys(Keys.ENTER);
		element.sendKeys(text);
	}

	public void genericVerifyElement(WebElement element, String Expectedtext) throws InterruptedException {

		String Actual_data = element.getText();
		String Expected_text = Expectedtext;
		if (Actual_data.equalsIgnoreCase(Expected_text))
			System.out.println("Text verified ");
		else
			System.out.println("Text is not verified");

	}
	
	
	
	
	
	
	
	

}

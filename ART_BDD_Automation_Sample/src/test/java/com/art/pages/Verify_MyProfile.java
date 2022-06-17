//package art.cucumber.io.pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public abstract class profile_verify_en {
//	WebDriver project_Driver;
//
//	@FindBy(xpath = "//*[contains(text(),'My Profile')]")
//	WebElement Verify;
//
//	public profile_verify_en(WebDriver project_Driver) {
//		this.project_Driver = project_Driver;
//		PageFactory.initElements(project_Driver, this);
//
//	}
//
//	public void getText() {
//		// TODO Auto-generated method stub
//		String Actual_data = Verify.getText();
//		String Expected_text = "My Profile";
//		if (Actual_data.equalsIgnoreCase(Expected_text))
//			System.out.println("text matched!");
//		else
//			System.out.println("not matched");
//	}
//
//}

package com.art.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_MyProfile {
	WebDriver driver;

	// WebElement
	@FindBy(xpath = "//*[@id='navbar2']/nav/ul/li[4]/a")
	public WebElement MyProfile;

	@FindBy(xpath = "//*[@id ='pills-home-tab']")
	public WebElement PersonalInfo;

	@FindBy(xpath = "//div[contains(text(), \"Contact Information\")]")
	public WebElement ContactInfo;

	// Constructor
	public Verify_MyProfile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Page Objects (For Exception Cases)
	public void ClickonContactInfo() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor JSE = (JavascriptExecutor) driver;
		JSE.executeScript("arguments[0].click()", ContactInfo);
	}

}

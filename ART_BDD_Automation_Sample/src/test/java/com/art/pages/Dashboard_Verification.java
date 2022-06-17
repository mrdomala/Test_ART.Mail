package com.art.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Verification {
	WebDriver driver;
	
	//WebElement
	@FindBy(xpath = "//*[@class = 'nav-link selected']")
	public WebElement header;
	
	@FindBy(xpath = "//p[contains(text(), \" All Policies \")]")
	public WebElement Dashboardtext;
	
	
	
    //Constructor 
	public Dashboard_Verification(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	//Page Objects (For Exception Cases)

}


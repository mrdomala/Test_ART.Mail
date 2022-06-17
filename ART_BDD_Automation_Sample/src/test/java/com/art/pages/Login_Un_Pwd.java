package com.art.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Un_Pwd {
	WebDriver project_Driver;

	// WebElement
	@FindBy(xpath = "//*[ contains(text(),'Login')]")
	public WebElement Login;

	@FindBy(xpath = "//a[@id='register-btn']")
	public WebElement Login_frame;

	@FindBy(xpath = "//*[@formcontrolname='userName']")
	public WebElement Username;

	@FindBy(xpath = "//*[@formcontrolname='password']")
	public WebElement Password;

	@FindBy(xpath = "//*[@class=\"btn btn-primary\"]")
	public WebElement Login_button;

	@FindBy(xpath = "//input[1]")
	public WebElement OTP0;

	@FindBy(xpath = "//input[2]")
	public WebElement OTP1;

	@FindBy(xpath = "//input[3]")
	public WebElement OTP2;

	@FindBy(xpath = "//input[4]")
	public WebElement OTP3;

	@FindBy(xpath = "//*[@id='Submit-btn']")
	public WebElement Submit;
	

	//Constructor
	public Login_Un_Pwd(WebDriver project_Driver) {
		this.project_Driver = project_Driver;
		PageFactory.initElements(project_Driver, this);

	}
	
	//Page Objects (For Exception Cases)


}

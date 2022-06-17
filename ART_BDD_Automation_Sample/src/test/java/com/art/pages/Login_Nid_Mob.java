package com.art.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Nid_Mob {
	WebDriver project_Driver;
	
	//WebElement
	@FindBy(xpath = "//*[ contains(text(),'Login')]")
	public WebElement Login;

	@FindBy(xpath = "//a[@id='register-btn']")
	public WebElement Login_frame;

	@FindBy(xpath = "//*[@id =' pills-profile-tab']")
	public WebElement NationalId_MobileNo;

	@FindBy(xpath = "//*[@formcontrolname='nationalId']")
	public WebElement nationalId;

	@FindBy(xpath = "//*[@formcontrolname='mobile']")
	public WebElement mobile;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-login-options[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")
	public WebElement login_button;

	@FindBy(xpath = "//input[1]")
	public WebElement OTP_0;

	@FindBy(xpath = "//input[2]")
	public WebElement OTP_1;

	@FindBy(xpath = "//input[3]")
	public WebElement OTP_2;

	@FindBy(xpath = "//input[4]")
	public WebElement OTP_3;

	@FindBy(xpath = "//*[@id='Submit-btn']")
	public WebElement Submit;

	@FindBy(xpath = "//*[@id=' dropdownMenuButton']")
	public WebElement Dropdown;

	@FindBy(xpath = "//*[@id='navbar1']/ul[3]/li[4]/a/div/span[6]")
	public WebElement Logout;

	// Constructor
	public Login_Nid_Mob(WebDriver project_Driver) {
		this.project_Driver = project_Driver;
		PageFactory.initElements(project_Driver, this);

	}
  
	//Page Objects (For Exception Cases)
	public void getDropdown() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor JSE = (JavascriptExecutor) project_Driver;
		JSE.executeScript("arguments[0].click()", Dropdown);

	}
}

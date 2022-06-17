package com.art.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Motor_Guest_CustomNo {
	WebDriver driver;

	// WebElement
	@FindBy(xpath = "//*[@id = 'productTabs2']//child::div[text() = ' Motor ']//parent::div[starts-with(@class, 'product-widget')]")
	public WebElement Motor_Product;

	@FindBy(xpath = "/html/body/app-root/div/mat-drawer-container/mat-drawer-content/app-product-motor/div[1]/section/header/div/div/h1")
	public WebElement Motor_Header;

	@FindBy(xpath = "//*[@id=\"aligmentReset\"]/div/div[1]/section/main/div/div/div/app-motor-quote/div/div/section/main/form/div[2]/div[3]/div/p")
	public WebElement Purpose_of_ins;

	@FindBy(xpath = "//*[@placeholder='Enter National Id/Iqama ID']")
	public WebElement NationalId;

	@FindBy(xpath = "//*[@placeholder='DD-MM-YYYY']")
	public WebElement date_Of_Birth;

	@FindBy(xpath = "//*[@placeholder='5xxxxxxxx']")
	public WebElement Mobile_Number;

	@FindBy(xpath = "//*[@placeholder='Enter email']")
	public WebElement Email_Id;

	@FindBy(xpath = "//*[@id = 'txtCustomNumber']")
	public WebElement Custom_Number;

	@FindBy(xpath = "//*[@formcontrolname = 'vehicleProductionYear']")
	public WebElement Year;

	@FindBy(xpath = "//*[@formcontrolname = 'vehicleMaker']")
	public WebElement Vehicle_Maker;

	@FindBy(xpath = "//*[@class='mx-1 mt5']")
	public WebElement Select_Checkbox;

	@FindBy(xpath = "//*[@id=\'aligmentReset\']/div/div[1]/section/main/div/div/div/div[2]/div[2]/div/button")
	public WebElement Get_a_Quote;

	@FindBy(xpath = "//*[@class='btn insure-now-btn btn-lg']")
	public WebElement Comprehensive;

	@FindBy(xpath = "//*[@type='button']")
	public WebElement Addons;

	@FindBy(xpath = "//*[@class='art-primary-btn w-100 recal btn-position']")
	public WebElement Recalculate;

	@FindBy(xpath = "//*[@class='art-primary-btn pl-5 pr-5']")
	public WebElement Proceed;

	@FindBy(xpath = "//input[1]")
	public WebElement Otp0;

	@FindBy(xpath = "//input[2]")
	public WebElement Otp1;

	@FindBy(xpath = "//input[3]")
	public WebElement Otp2;

	@FindBy(xpath = "//input[4]")
	public WebElement Otp3;

	@FindBy(xpath = "//*[@id='Submit-btn']")
	public WebElement Submit_Otp;

	@FindBy(xpath = "//*[@alt='SADAD']")
	public WebElement Sadad;
	
//	@FindBy(xpath = "//*[@class='visa-img payment-option ng-star-inserted']")
//	public WebElement CC;
//	
//	@FindBy(xpath = "//*[@placeholder='Card Number']")
//	public WebElement Card_Number;
//	
//	@FindBy(xpath = "//*[@placeholder='MM / YY']")
//	public WebElement Expiry_Date;
//	
//	@FindBy(xpath = "//*[@placeholder='Card holder']")
//	public WebElement Card_Holder;
//	
//	@FindBy(xpath = "//*[@placeholder='CVV']")
//	public WebElement CVV;
//	
//	@FindBy(xpath = "//*[@type = 'submit']")
//	public WebElement Pay_Now;

	@FindBy(xpath = "//*[@class='art-confirm-pay-btn pay-butn mb-lg-0 w-100']")
	public WebElement Confirm_and_Pay;

	@FindBy(xpath = "//*[@class = 'btn btn-success']")
	public WebElement Quotation;

	// Constructor
	public Motor_Guest_CustomNo(WebDriver project_Driver) {
		this.driver = project_Driver;
		PageFactory.initElements(project_Driver, this);

	}

	// Page Objects (For Exception Cases)
	public void clickMotorIcon() throws Throwable {
		Thread.sleep(3000);
		JavascriptExecutor JSE = (JavascriptExecutor) driver;
		JSE.executeScript("arguments[0].click()", Motor_Product);

	}

	public void clickPurposeofIns() throws Throwable {
		Thread.sleep(2000);
		JavascriptExecutor JSE = (JavascriptExecutor) driver;
		JSE.executeScript("arguments[0].click()", Purpose_of_ins);

	}
	
	public void clickCheckbox() throws Throwable {
		Thread.sleep(2000);
		JavascriptExecutor JSE = (JavascriptExecutor) driver;
		JSE.executeScript("arguments[0].click()", Select_Checkbox);

	}

}

package com.art.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_Mob_Email {
	WebDriver driver;

	@FindBy(xpath = "//*[@id='navbar2']/nav/ul/li[4]/a")
	public WebElement MyProfile;

	@FindBy(xpath = "//div[contains(text(), \"Contact Information\")]")
	public WebElement ContactInforamtion;

	@FindBy(xpath = "//a[contains(text(),'Update mobile number')]")
	public WebElement UMN;

	@FindBy(xpath = "//*[@id=\"updateNumber\"]/div/div/div[2]/form/div/div[1]/div[2]/div/div/input")
	public WebElement UMNTC;

	@FindBy(xpath = "//*[@id=\"updateNumber\"]/div/div/div[2]/form/div/div[1]/div[2]/div/div/input")
	public WebElement UMNET;

	@FindBy(xpath = "//button[contains(text(),'Verify')]")
	public WebElement Verify;

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

	public Update_Mob_Email(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void ClickonContactInforamtion() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor JSE = (JavascriptExecutor) driver;
		JSE.executeScript("arguments[0].click()", ContactInforamtion);
	}

	public void ClickonUpdateMobileNo() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor JSE = (JavascriptExecutor) driver;
		JSE.executeScript("arguments[0].click()", UMN);
	}
}

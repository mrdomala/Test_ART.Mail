package com.art.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.art.pages.Common_Methods;
import com.art.pages.Verify_MyProfile;
import com.art.runner.CucumberRunner;
import com.art.testcontext.StepData;
import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_MyProfile_SD {
	static WebDriver driver;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());


	private StepData stepData;

	public Verify_MyProfile_SD(StepData stepData) {
		this.stepData = stepData;

	}
	// <-----------------------------Verify My
	// Profile-------------------------------------->

	@When("Click on My Profile")
	public void Click_on_My_Profile() throws Exception {
		stepData.commonMethods();
		Thread.sleep(3000);
		stepData.getCm().genericClick(stepData.getPv().MyProfile);
		log.info("Clicked on my profile");

	}

	@When("Verify Profile Text with {string}")
	public void verify_profile_text_with(String Expectedtext) throws InterruptedException {
		Thread.sleep(4000);
		stepData.getCm().genericVerifyElement(stepData.getPv().PersonalInfo, Expectedtext);
		log.info("Verified profile text");
	}

	@Then("Click Contact Information")
	public void click_contact_information() throws InterruptedException {
		Thread.sleep(15000);
		stepData.getPv().ClickonContactInfo();
		log.info("Clicked on contact isnformation");
	}

}

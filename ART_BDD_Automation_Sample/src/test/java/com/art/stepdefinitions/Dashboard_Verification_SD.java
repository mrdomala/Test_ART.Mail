package com.art.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.art.pages.Common_Methods;
import com.art.runner.CucumberRunner;
import com.art.testcontext.StepData;
import com.relevantcodes.extentreports.ExtentReports;
import io.cucumber.java.en.Then;

public class Dashboard_Verification_SD extends StepData {
	static WebDriver driver;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	private StepData stepData;

	public Dashboard_Verification_SD(StepData stepData) {
		this.stepData = stepData;

	}

	// <-----------------------------Dashboard
	// Verification------------------------------------>

	@Then("Verify the header with {string}")
	public void verify_the_header_with(String Expectedtext) throws InterruptedException {
		stepData.commonMethods();
		Thread.sleep(4000);
		stepData.getCm().genericVerifyElement(stepData.getDv().header, Expectedtext);
		log.info("Verified header at dashboard");

	}

	@Then("^Verify All policy Text with \"([^\"]*)\"$")
	public void verify_all_policy_text_with_something(String expectedtext) throws Throwable {
		stepData.commonMethods();
		Thread.sleep(4000);
		stepData.getCm().genericVerifyElement(stepData.getDv().Dashboardtext, expectedtext);
		log.info("Verified all policies at dashboard");


	}

}

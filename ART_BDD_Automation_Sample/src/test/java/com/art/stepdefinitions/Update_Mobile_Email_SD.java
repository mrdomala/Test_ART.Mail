
package com.art.stepdefinitions;

import java.util.List;
import java.util.Map;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.art.pages.Common_Methods;
import com.art.pages.Update_Mob_Email;
import com.art.runner.CucumberRunner;
import com.art.testcontext.StepData;
import com.relevantcodes.extentreports.ExtentReports;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Update_Mobile_Email_SD {

	static WebDriver driver;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());
	Update_Mob_Email up;
	Common_Methods cm;

	private StepData stepData;

	public Update_Mobile_Email_SD(StepData driver) {
		this.stepData = driver;

	}

	@When("User clicks on My Profile")
	public void Click_on_My_Profile() throws Exception {
		stepData.commonMethods();
		Thread.sleep(6000);
		stepData.getCm().genericClick(stepData.getUm().MyProfile);
		log.info("Clicked on my profile");

	}

	@When("Click on Contact Information")
	public void Click_on_Contact_Information() throws InterruptedException {
		Thread.sleep(15000);
		stepData.getUm().ClickonContactInforamtion();
		log.info("Clicked on Contact Info.");
	}

	@Then("Click on Update mobile number")
	public void Click_on_Update_mobile_number() throws InterruptedException {
		Thread.sleep(3000);
		stepData.getUm().ClickonUpdateMobileNo();
		log.info("Clicked on UpdateMobileNumber");
	}

	@Then("Click inside text box")
	public void Click_inside_text_box() throws InterruptedException {
		Thread.sleep(2000);
		stepData.getCm().genericClear(stepData.getUm().UMNTC);
		log.info("Cleared old mobile number");
		Thread.sleep(3000);
	}

	@And("^User enter updated Mobile Number as \"([^\"]*)\"$")
	public void user_enter_updated_mobile_number_as_something(String mobilenumber) throws Throwable {
		Thread.sleep(3000);
		stepData.getCm().genericSendKeys(stepData.getUm().UMNET, mobilenumber);
		Thread.sleep(3000);
		log.info("Entered mobile number");

	}

	@Then("Click on verify")
	public void Click_on_verify() throws InterruptedException {
		Thread.sleep(3000);
		stepData.getCm().genericClickEnter(stepData.getUm().Verify);
		log.info("Clicked on Verify");
	}

	@Then("User enters OTP_0")
	public void user_enters_OTP0(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_0");
			Thread.sleep(3000);
			stepData.getCm().genericSendKeys(stepData.getUm().OTP_0, mapdata.get("otp_0"));
			log.info("User entered the static otp_0 text block as : 1");
		}
	}

	@Then("User enters OTP_1")
	public void user_enters_OTP1(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_1");
			Thread.sleep(1000);
			stepData.getCm().genericSendKeys(stepData.getUm().OTP_1, mapdata.get("otp_1"));
			log.info("User entered the static otp_1 text block as : 1");
		}
	}

	@Then("User enters OTP_2")
	public void user_enters_OTP2(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_2");
			Thread.sleep(1000);
			stepData.getCm().genericSendKeys(stepData.getUm().OTP_2, mapdata.get("otp_2"));
			log.info("User entered the static otp_2 text block as : 1");
		}
	}

	@Then("User enters OTP_3")
	public void user_enters_OTP3(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_3");
			Thread.sleep(1000);
			stepData.getCm().genericSendKeys(stepData.getUm().OTP_3, mapdata.get("otp_3"));
			log.info("User entered the static otp_3 text block as : 1");
		}
	}

	@Then("User clicks on submit")
	public void User_clicks_on_submit() throws Exception {
		Thread.sleep(3000);
		stepData.getCm().genericClickEnter(stepData.getUm().Submit);
		log.info("Waiting for logged in user profile screen!");
		Thread.sleep(15000);

	}

}
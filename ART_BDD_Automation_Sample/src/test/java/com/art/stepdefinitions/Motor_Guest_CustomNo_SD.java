package com.art.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import com.art.pages.Common_Methods;
import com.art.pages.Motor_Guest_CustomNo;
import com.art.reusableComponent.WebDriverHelper;
import com.art.runner.CucumberRunner;
import com.art.utility.ReadPropertyFile;
import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Motor_Guest_CustomNo_SD {
	static WebDriver driver;
	ReadPropertyFile rp = null;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	Motor_Guest_CustomNo mg;
	Common_Methods cm;

	@Given("user opens the browser for motor guest flow")
	public void user_opens_the_browser_for_motor_guest_flow() throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);
		WebDriverHelper.initializeDriver();
		driver = WebDriverHelper.getDriver();
		driver.manage().window().maximize();
		log.info("Browser opened sucessfully motor guest flow");
	}

	@When("user in home page for motor guest flow")
	public void user_in_home_page_for_motor_guest_flow() throws Exception {
		rp = new ReadPropertyFile();
		driver.get(rp.getUrl());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		log.info("User in home page for motor guest flow");
	}

	@Then("user clicks on the product motor")
	public void user_clicks_on_the_product_motor() throws Throwable {
		mg = new Motor_Guest_CustomNo(driver);
		cm = new Common_Methods();
		Thread.sleep(5000);
//		cm.genericClick(mg.Motor_Product);
		mg.clickMotorIcon();
		log.info("User clicked on the product motor");

	}

	@Then("user verifies the header {string} at product page")
	public void user_verifies_the_header_at_product_page(String Expectedtext) throws InterruptedException {
		log.info("User redirecting to the product page");
		Thread.sleep(3000);
		cm.genericVerifyElement(mg.Motor_Header, Expectedtext);
		log.info("Verified the header " + Expectedtext + " at dashboard");
	}

	@Then("user selects the purpose of insurance as Custom Number")
	public void user_selects_the_purpose_of_insurance_as_custom_number() throws Throwable {
		Thread.sleep(2000);
		mg.clickPurposeofIns();
//		cm.genericClick(mg.Purpose_of_ins);
		log.info("selected the purpose of insurance as Custom Number");
	}

	@Then("user enters the NID as {string}")
	public void user_enters_the_nid_as(String NID) throws InterruptedException {
		Thread.sleep(1000);
		cm.genericSendKeys(mg.NationalId, NID);
		log.info("Entered the NID as " + NID);
	}

	@Then("user enters the DOB as {string}")
	public void user_enters_the_dob_as(String DOB) throws InterruptedException {
		Thread.sleep(1000);
		cm.genericSendKeys(mg.date_Of_Birth, DOB);
		log.info("Entered the DOB as " + DOB);
	}

	@Then("user enters the Mobile No. as {string}")
	public void user_enters_the_mobile_no_as(String Mobile) throws InterruptedException {
		Thread.sleep(1000);
		cm.genericSendKeys(mg.Mobile_Number, Mobile);
		log.info("Entered the  Mobile No. as " + Mobile);
	}

	@Then("user enters the Email as {string}")
	public void user_enters_the_email_as(String Email) throws InterruptedException {
		Thread.sleep(1000);
		cm.genericSendKeys(mg.Email_Id, Email);
		log.info("Entered the Email as " + Email);
	}

	@Then("user also enters the Custom No. as {string}")
	public void user_also_enters_the_custom_no_as(String CustomNo) throws InterruptedException {
		Thread.sleep(2000);
		cm.genericSendKeys(mg.Custom_Number, CustomNo);
		log.info("Entered the Custom No. as " + CustomNo);
	}

	@Then("user enters the vehicle production year as {string}")
	public void user_enters_the_vehicle_production_year_as(String Year) throws InterruptedException {
		Thread.sleep(1000);
		cm.genericSendKeys(mg.Year, Year);
		cm.genericClickEnter(mg.Year);
		log.info("Entered the vehicle production year as " + Year);
		log.info("Fetching the Vehicle details...");
		Thread.sleep(10000);

	}

	@Then("user selects the checkbox and click on the Get a Quote button.")
	public void user_selects_the_checkbox_and_click_on_the_get_a_quote_button() throws Throwable {
		Thread.sleep(10000);
		mg.clickCheckbox();
//		cm.genericClick(mg.Select_Checkbox);
		log.info("User selected the checkbox");
		Thread.sleep(3000);
		cm.genericClickEnter(mg.Get_a_Quote);
		log.info("and clicked on the Get a Quote button");
		Thread.sleep(15000);

	}

	@Then("user clicks on the Comprehensive plan for motor flow")
	public void user_clicks_on_the_comprehensive_plan_for_motor_flow() throws InterruptedException {
		log.info("Redirecting to the Premium Page");
		Thread.sleep(15000);
		cm.genericClickEnter(mg.Comprehensive);
		log.info("User clicked on the Comprehensive plan for motor flow");

	}

	@Then("user selects the addons for comprehensive plans")
	public void user_selects_the_addons_for_comprehensive_plans() throws InterruptedException {
		Thread.sleep(12000);
		cm.genericClickEnter(mg.Addons);
		log.info("User selected the addons for comprehensive plan");
	}

	@Then("user clicks on the Recalculate button")
	public void user_clicks_on_the_recalculate_button() throws InterruptedException {
		Thread.sleep(10000);
		cm.genericClickEnter(mg.Recalculate);
		log.info("User clicked on the Recalculate button");
	}

	@Then("user after that clicks on the Proceed button")
	public void user_after_that_clicks_on_the_proceed_button() throws InterruptedException {
		Thread.sleep(6000);
		cm.genericClickEnter(mg.Proceed);
		log.info("User clicked on the Proceed button");
		Thread.sleep(5000);

	}

	@Then("user enters otp in the first field as {string}")
	public void user_enters_otp_in_the_first_field_as(String Otp0) throws InterruptedException {
		Thread.sleep(3000);
		cm.genericSendKeys(mg.Otp0, Otp0);
		log.info("User entered otp in the first field as " + Otp0);

	}

	@Then("user enters otp in the second field as {string}")
	public void user_enters_otp_in_the_second_field_as(String Otp1) throws InterruptedException {
		Thread.sleep(3000);
		cm.genericSendKeys(mg.Otp1, Otp1);
		log.info("User entered otp in the second field as " + Otp1);
	}

	@Then("user enters otp in the third field as {string}")
	public void user_enters_otp_in_the_third_field_as(String Otp2) throws InterruptedException {
		Thread.sleep(3000);
		cm.genericSendKeys(mg.Otp2, Otp2);
		log.info("User entered otp in the third field as " + Otp2);
	}

	@Then("user enters otp in the fourth field as {string}")
	public void user_enters_otp_in_the_fourth_field_as(String Otp3) throws InterruptedException {
		Thread.sleep(3000);
		cm.genericSendKeys(mg.Otp3, Otp3);
		log.info("User entered otp in the fourth field as " + Otp3);

	}

	@Given("user clicks on the submit otp button")
	public void user_clicks_on_the_submit_otp_button() throws InterruptedException  {
		Thread.sleep(2000);
		cm.genericClickEnter(mg.Submit_Otp);
		log.info("User clicked on the submit otp button");
		Thread.sleep(10000);
	}

	@Then("user selects the Sadad payment method")
	public void user_selects_the_sadad_payment_method() throws InterruptedException {
		Thread.sleep(10000);
		cm.genericClick(mg.Sadad);
		log.info("User selected the Sadad payment method");
	}

	@Then("user clicks on the confirm and pay button")
	public void user_clicks_on_the_confirm_and_pay_button() throws InterruptedException {
		Thread.sleep(10000);
		cm.genericClickEnter(mg.Confirm_and_Pay);
		log.info("User clicked on the confirm and pay button");

	}

	@Then("user clicks on the download quotation button")
	public void user_clicks_on_the_download_quotation_button() throws InterruptedException {
		Thread.sleep(30000);
		cm.genericClickEnter(mg.Quotation);
		log.info("Quotation downloaded sucessfully");
	}

	public static ExtentReports getExtentReportInstance() {
		return report;
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
		log.info("Driver closed");
	}

}

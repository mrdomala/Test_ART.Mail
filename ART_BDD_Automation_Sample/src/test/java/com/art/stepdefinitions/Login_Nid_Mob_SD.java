//package com.art.stepdefinitions;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import com.art.pages.Common_Methods;
//import com.art.pages.Dashboard_Verification;
//import com.art.pages.Login_Nid_Mob;
//import com.art.pages.Login_Un_Pwd;
//import com.art.pages.Verify_MyProfile;
//import com.art.reusableComponent.WebDriverHelper;
//import com.art.runner.CucumberRunner;
//import com.art.testcontext.StepData;
//import com.art.utility.ReadPropertyFile;
//import com.relevantcodes.extentreports.ExtentReports;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Login_Nid_Mob_SD {
//
//	static WebDriver driver;
//	ReadPropertyFile rp = null;
//	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
//	Logger log = LogManager.getLogger(CucumberRunner.class.getName());
//
//	Login_Un_Pwd loginuspwd;
//    Login_Nid_Mob ln;
//	Dashboard_Verification dv;
//	Verify_MyProfile pv;
//	Common_Methods cm;
//	
//	
//	private StepData stepData;
//
//	public Login_Nid_Mob_SD(StepData stepData) {
//        this.stepData = stepData;
//       	        
//    }
//
//	// <-----------------------------Background Feature Login
//	// Flow-------------------------------------->
//
//	@Given("Browser opens")
//	public void browser_opens() throws Exception {
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is: " + projectPath);
//		WebDriverHelper.initializeDriver();
//		driver = WebDriverHelper.getDriver();
//		driver.manage().window().maximize();
//		log.info("Browser opened sucessfully");
//		
//		stepData.setDriver(driver);
//		stepData.initializePageObject(driver);
////		stepData.commonMethods();
//
//	}
//
//	@When("User in home pages")
//	public void user_in_home_pages() throws Exception {
//		rp = new ReadPropertyFile();
//		driver.get(rp.getUrl());
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		log.info("User in home page");
//	}
//
//	@Then("User click on login option")
//	public void user_click_on_the_login_option() throws Exception {
//		ln = new Login_Nid_Mob(driver);
//		cm = new Common_Methods();
//		Thread.sleep(5000);
//		cm.genericClick(ln.Login);
//		log.info("Clicked on login!");
//	}
//
//	@Then("User click on login already registered")
//	public void user_click_on_the_login_on_already_registered() throws Exception {
//		Thread.sleep(2000);
//		cm.genericClick(ln.Login_frame);
//		log.info("Clicked on login inside the frame!");
//	}
//
//	@Then("Click on NationalID & MobileNumber")
//	public void click_on_national_id_mobile_number() throws Exception {
//		Thread.sleep(5000);
//		cm.genericClickEnter(ln.NationalId_MobileNo);
//		log.info("User moved to National Id and Mobile Number login!");
//	}
//
//	@Then("User enter nationalid")
//	public void user_enter_nationalid(DataTable dataTable) throws InterruptedException {
//		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
//		for (Map<String, String> mapdata : listdata) {
//			Thread.sleep(1000);
//			cm.genericSendKeys(ln.nationalId, mapdata.get("nationalid"));
//			log.info("User entered the nationalid as" + " " + mapdata.get("nationalid"));
//		}
//	}
//
//	@Then("User enter mobileno")
//	public void user_enter_mobileno(DataTable dataTable) throws InterruptedException {
//		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
//		for (Map<String, String> mapdata : listdata) {
//			Thread.sleep(1000);
//			cm.genericSendKeys(ln.mobile, mapdata.get("mobileno"));
//			log.info("User entered the nationalid as" + " " + mapdata.get("mobileno"));
//		}
//	}
//
//	@And("Click login")
//	public void click_login() throws Exception {
//		log.info("yet to click login!");
//		Thread.sleep(3000);
//		cm.genericClickEnter(ln.login_button);
//		log.info("Clicked login!");
//	}
//
//	@Then("User enter otp_0")
//	public void user_enter_otp0(DataTable dataTable) throws Exception {
//		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
//		for (Map<String, String> mapdata : listdata) {
//			log.info("in loop OTP_0");
//			Thread.sleep(7000);
//			cm.genericSendKeys(ln.OTP_0, mapdata.get("otp_0"));
//			log.info("User entered the static otp_0 text block as : 1");
//		}
//	}
//
//	@Then("User enter otp_1")
//	public void user_enter_otp1(DataTable dataTable) throws Exception {
//		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
//		for (Map<String, String> mapdata : listdata) {
//			log.info("in loop OTP_1");
//			Thread.sleep(1000);
//			cm.genericSendKeys(ln.OTP_1, mapdata.get("otp_1"));
//			log.info("User entered the static otp_1 text block as : 1");
//		}
//	}
//
//	@Then("User enter otp_2")
//	public void user_enter_otp2(DataTable dataTable) throws Exception {
//		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
//		for (Map<String, String> mapdata : listdata) {
//			log.info("in loop OTP_2");
//			Thread.sleep(1000);
//			cm.genericSendKeys(ln.OTP_2, mapdata.get("otp_2"));
//			log.info("User entered the static otp_2 text block as : 1");
//		}
//	}
//
//	@Then("User enter otp_3")
//	public void user_enter_otp3(DataTable dataTable) throws Exception {
//		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
//		for (Map<String, String> mapdata : listdata) {
//			log.info("in loop OTP_3");
//			Thread.sleep(1000);
//			cm.genericSendKeys(ln.OTP_3, mapdata.get("otp_3"));
//			log.info("User entered the static otp_3 text block as : 1");
//		}
//	}
//
//	@Then("Click on submit")
//	public void click_on_submit() throws Exception {
//		Thread.sleep(3000);
//		cm.genericClickEnter(ln.Submit);
//		log.info("Waiting for logged in user profile screen!");
//		Thread.sleep(15000);
//		log.info("Successfully logged in with NID and Mobile No.");
//
//	}
//
//
//	public static ExtentReports getExtentReportInstance() {
//		return report;
//	}
//
//	
//
//}

//<----------------------------------------------------------------------------------------------->

package com.art.stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import com.art.pages.Common_Methods;
import com.art.pages.Login_Nid_Mob;
import com.art.reusableComponent.WebDriverHelper;
import com.art.runner.CucumberRunner;
import com.art.utility.ReadPropertyFile;
import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Nid_Mob_SD {

	static WebDriver driver;
	ReadPropertyFile rp = null;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	Login_Nid_Mob ln;
	Common_Methods cm;

	@Given("Browser opens")
	public void browser_opens() throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);
		WebDriverHelper.initializeDriver();
		driver = WebDriverHelper.getDriver();
		driver.manage().window().maximize();
		log.info("Browser opened sucessfully");

	}

	@When("User in home pages")
	public void user_in_home_pages() throws Exception {
		rp = new ReadPropertyFile();
		driver.get(rp.getUrl());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		log.info("User in home page");
	}

	@Then("User click on login option")
	public void user_click_on_the_login_option() throws Exception {
		ln = new Login_Nid_Mob(driver);
		cm = new Common_Methods();
		Thread.sleep(5000);
		cm.genericClick(ln.Login);
		log.info("Clicked on login!");
	}

	@Then("User click on login already registered")
	public void user_click_on_the_login_on_already_registered() throws Exception {
		Thread.sleep(2000);
		cm.genericClick(ln.Login_frame);
		log.info("Clicked on login inside the frame!");
	}

	@Then("Click on NationalID & MobileNumber")
	public void click_on_national_id_mobile_number() throws Exception {
		Thread.sleep(5000);
		cm.genericClickEnter(ln.NationalId_MobileNo);
		log.info("User moved to National Id and Mobile Number login!");
	}

	@Then("User enter nationalid")
	public void user_enter_nationalid(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(1000);
			cm.genericSendKeys(ln.nationalId, mapdata.get("nationalid"));
			log.info("User entered the nationalid as" + " " + mapdata.get("nationalid"));
		}
	}

	@Then("User enter mobileno")
	public void user_enter_mobileno(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(1000);
			cm.genericSendKeys(ln.mobile, mapdata.get("mobileno"));
			log.info("User entered the nationalid as" + " " + mapdata.get("mobileno"));
		}
	}

	@And("Click login")
	public void click_login() throws Exception {
		log.info("yet to click login!");
		Thread.sleep(3000);
		cm.genericClickEnter(ln.login_button);
		log.info("Clicked login!");
	}

	@Then("User enter otp_0")
	public void user_enter_otp0(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_0");
			Thread.sleep(7000);
			cm.genericSendKeys(ln.OTP_0, mapdata.get("otp_0"));
			log.info("User entered the static otp_0 text block as : 1");
		}
	}

	@Then("User enter otp_1")
	public void user_enter_otp1(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_1");
			Thread.sleep(1000);
			cm.genericSendKeys(ln.OTP_1, mapdata.get("otp_1"));
			log.info("User entered the static otp_1 text block as : 1");
		}
	}

	@Then("User enter otp_2")
	public void user_enter_otp2(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_2");
			Thread.sleep(1000);
			cm.genericSendKeys(ln.OTP_2, mapdata.get("otp_2"));
			log.info("User entered the static otp_2 text block as : 1");
		}
	}

	@Then("User enter otp_3")
	public void user_enter_otp3(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP_3");
			Thread.sleep(1000);
			cm.genericSendKeys(ln.OTP_3, mapdata.get("otp_3"));
			log.info("User entered the static otp_3 text block as : 1");
		}
	}

	@Then("Click on submit")
	public void click_on_submit() throws Exception {
		Thread.sleep(3000);
		cm.genericClickEnter(ln.Submit);
		log.info("Waiting for logged in user profile screen!");
		Thread.sleep(15000);
		log.info("Successfully logged in with NID and Mobile No.");

	}
	
	@When("^report get generated$")
	public void report_get_generated() throws Throwable {
		report.flush();
		log.info("Report gets generated");

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

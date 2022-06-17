//package com.art.stepdefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import com.art.pages.Common_Methods;
//import com.art.pages.Login_Un_Pwd;
//import com.art.reusableComponent.WebDriverHelper;
//import com.art.runner.CucumberRunner;
//import com.art.utility.ReadPropertyFile;
//import com.relevantcodes.extentreports.ExtentReports;
//
//import io.cucumber.java.After;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Login_Un_Pwd_SD {
//	static WebDriver driver;
//	ReadPropertyFile rp = null;
//	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
//	Logger log = LogManager.getLogger(CucumberRunner.class.getName());
//
//	Login_Un_Pwd loginuspwd;
//	Common_Methods cm;
//
//	@Given("Browser is open for login")
//	public void browser_is_open_for_login() throws Exception {
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is: " + projectPath);
//		WebDriverHelper.initializeDriver();
//		driver = WebDriverHelper.getDriver();
//		driver.manage().window().maximize();
//		log.info("Browser opened sucessfully");
//	}
//
//	@When("User is in home page of application")
//	public void user_is_in_home_page_of_application() throws Exception {
//		rp = new ReadPropertyFile();
//		driver.get(rp.getUrl());
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		log.info("User in home page");
//	}
//
//	@Then("User click on the login option")
//	public void user_click_on_the_login_option() throws InterruptedException {
//		loginuspwd = new Login_Un_Pwd(driver);
//		cm = new Common_Methods();
//		Thread.sleep(3000);
//		cm.genericClick(loginuspwd.Login);
//		log.info("Clicked on login!");
//	}
//
//	@Then("User click on the login on already registered")
//	public void user_click_on_the_login_on_already_registered() throws InterruptedException {
//		Thread.sleep(2000);
//		cm.genericClick(loginuspwd.Login_frame);
//		log.info("Clicked on login inside the frame!");
//	}
//
//	@Then("User enter username as {string}")
//	public void user_enter_username_as(String username) throws InterruptedException {
//		Thread.sleep(3000);
//		cm.genericSendKeys(loginuspwd.Username, username);
//		log.info("User entered the username as" + " " + username);
//	}
//
//	@Then("User enter password as {string}")
//	public void user_enter_password_as(String password) throws InterruptedException {
//		Thread.sleep(3000);
//		cm.genericSendKeys(loginuspwd.Password, password);
//		log.info("User entered the password as" + " " + password);
//	}
//
//	@Then("Click on Login")
//	public void click_on_login() throws InterruptedException {
//		Thread.sleep(3000);
//		cm.genericClickEnter(loginuspwd.Login_button);
//	}
//
//	@Then("User enter OTP_0 as {string}")
//	public void user_enter_otp0_as(String otp_0) throws Exception {
//		log.info("in loop OTP_0");
//		Thread.sleep(6000);
//		cm.genericSendKeys(loginuspwd.OTP_0, otp_0);
//		log.info("User entered the static otp_0 text block as : 1");
//	}
//
//	@Then("User enter OTP_1 as {string}")
//	public void user_enter_otp1_as(String otp_1) throws Exception {
//		Thread.sleep(1000);
//		cm.genericSendKeys(loginuspwd.OTP_1, otp_1);
//		log.info("User entered the static otp_1 text block as : 1");
//	}
//
//	@Then("User enter OTP_2 as {string}")
//	public void user_enter_otp2_as(String otp_2) throws Exception {
//		Thread.sleep(1000);
//		cm.genericSendKeys(loginuspwd.OTP_2, otp_2);
//		log.info("User entered the static otp_2 text block as : 1");
//	}
//
//	@Then("User enter OTP_3 as {string}")
//	public void user_enter_otp3_as(String otp_3) throws Exception {
//		Thread.sleep(1000);
//		cm.genericSendKeys(loginuspwd.OTP_3, otp_3);
//		log.info("User entered the static otp_3 text block as : 1");
//	}
//
//	@Then("Click on Submit")
//	public void click_on_submit() throws InterruptedException {
//		Thread.sleep(3000);
//		cm.genericClickEnter(loginuspwd.Submit);
//		log.info("Waiting for logged in user profile screen!");
//		Thread.sleep(15000);
//		log.info("Successfully logged in with username and password!");
//	}
//
//	@When("^report get generated$")
//	public void report_get_generated() throws Throwable {
//		report.flush();
//		log.info("Report gets generated");
//
//	}
//
//	public static ExtentReports getExtentReportInstance() {
//		return report;
//	}
//
//}

//<---------------------------------------------------------------------------------------------------->

package com.art.stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.art.pages.Common_Methods;
import com.art.pages.Login_Un_Pwd;
import com.art.reusableComponent.WebDriverHelper;
import com.art.runner.CucumberRunner;
import com.art.testcontext.StepData;
import com.art.utility.ReadPropertyFile;
import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Un_Pwd_SD {
	static WebDriver driver;
	ReadPropertyFile rp = null;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	Login_Un_Pwd loginuspwd;
	Common_Methods cm;

	private StepData stepData;

	public Login_Un_Pwd_SD(StepData stepData) {
		this.stepData = stepData;

	}

	// <-----------------------------Background Feature Login
	// Flow-------------------------------------->

	@Given("Browser is open for login")
	public void browser_is_open_for_login() throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);
		WebDriverHelper.initializeDriver();
		driver = WebDriverHelper.getDriver();
		driver.manage().window().maximize();
		log.info("Browser opened sucessfully");

		stepData.setDriver(driver);
		stepData.initializePageObject(driver);
		stepData.commonMethods();
	}

	@When("User is in home page of application")
	public void user_is_in_home_page_of_application() throws Exception {
		rp = new ReadPropertyFile();
		driver.get(rp.getUrl());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		log.info("User in home page");
	}

	@Then("User click on the login option")
	public void user_click_on_the_login_option() throws InterruptedException {
		loginuspwd = new Login_Un_Pwd(driver);
		cm = new Common_Methods();
		Thread.sleep(3000);
		cm.genericClick(loginuspwd.Login);
		log.info("Clicked on login!");
	}

	@Then("User click on the login on already registered")
	public void user_click_on_the_login_on_already_registered() throws InterruptedException {
		Thread.sleep(2000);
		cm.genericClick(loginuspwd.Login_frame);
		log.info("Clicked on login inside the frame!");
	}


	@Then("User enter username")
	public void user_enter_username(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(3000);
			cm.genericSendKeys(loginuspwd.Username, mapdata.get("username"));
			log.info("User entered the username as" + " " + mapdata.get("username"));
		}
	}

	@Then("User enter password")
	public void user_enter_password(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			Thread.sleep(3000);
			cm.genericSendKeys(loginuspwd.Password, mapdata.get("password"));
			log.info("User entered the password as" + " " + mapdata.get("password"));
		}
	}

	@Then("Click on Login")
	public void click_on_login() throws InterruptedException {
		Thread.sleep(3000);
		cm.genericClickEnter(loginuspwd.Login_button);
	}

	@Then("User enter OTP0")
	public void user_enter_otp0(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP0");
			Thread.sleep(7000);
			cm.genericSendKeys(loginuspwd.OTP0, mapdata.get("otp0"));
			log.info("User entered the static otp_0 text block as : 1");
		}
	}

	@Then("User enter OTP1")
	public void user_enter_otp1(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP1");
			cm.genericSendKeys(loginuspwd.OTP1, mapdata.get("otp1"));
			log.info("User entered the static otp_1 text block as : 1");
		}
	}

	@Then("User enter OTP2")
	public void user_enter_otp2(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP2");
			cm.genericSendKeys(loginuspwd.OTP2, mapdata.get("otp2"));
			log.info("User entered the static otp2 text block as : 1");
		}
	}

	@Then("User enter OTP3")
	public void user_enter_otp3(DataTable dataTable) throws Exception {
		List<Map<String, String>> listdata = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> mapdata : listdata) {
			log.info("in loop OTP3");
			cm.genericSendKeys(loginuspwd.OTP3, mapdata.get("otp3"));
			log.info("User entered the static otp_3 text block as : 1");
		}
	}

	@Then("Click on Submit")
	public void click_on_submit() throws InterruptedException {
		Thread.sleep(3000);
		cm.genericClickEnter(loginuspwd.Submit);
		log.info("Waiting for logged in user profile screen!");
		Thread.sleep(15000);
		log.info("Successfully logged in with username and password!");
		Thread.sleep(120000);
	}

//	@When("^report get generated$")
//	public void report_get_generated() throws Throwable {
//		report.flush();
//		log.info("Report gets generated");
//
//	}

	public static ExtentReports getExtentReportInstance() {
		return report;
	}

}

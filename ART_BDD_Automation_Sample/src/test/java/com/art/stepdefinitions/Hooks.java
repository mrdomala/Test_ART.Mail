package com.art.stepdefinitions;

import com.art.utility.TakeSS;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks {
	ExtentReports report = null;
	ExtentTest test = null;
	@Before
	public void beforeRunScenario(Scenario s) {

		report = Login_Nid_Mob_SD.getExtentReportInstance();

		test = report.startTest(s.getName());
	}
	@After
	public void afterRunScenario(Scenario s) {
		String path = TakeSS.getScreenShot(s);

		if (s.getStatus() == Status.FAILED)
			test.log(LogStatus.FAIL, test.addScreenCapture(path), s.getName() + " Scenario Failed");
		else if (s.getStatus() == Status.PASSED)
			test.log(LogStatus.PASS, test.addScreenCapture(path), s.getName() + " Scenario passed");

		report.endTest(test);

	}

}

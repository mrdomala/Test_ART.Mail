package com.art.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.art.reusableComponent.WebDriverHelper;

import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class TakeSS {

	static WebDriver driver = null;
	public static String getScreenShot(Scenario result) {
		driver = WebDriverHelper.getDriver();
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		String path = null;
		File des = null;
		if (result.getStatus() == Status.PASSED)
			path = ".//screenShots//pass//" + result.getName() + ".png";
		else if (result.getStatus() == Status.FAILED)
			path = ".//screenShots//fail//" + result.getName() + ".png";

		try {

			des = new File(path);
			FileUtils.copyFile(source, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;
	}
}

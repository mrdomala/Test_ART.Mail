package com.art.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	Properties prob = null;

	// WE WILL ESTABLISH CONNECTION BTW PROB OBJECT AND PROPERTY FILE TO READ DATA
	// FROM FILE.
	public ReadPropertyFile() {
		prob = new Properties();

		try {
			FileInputStream fis = new FileInputStream(".//config.properties");
			prob.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getUrl() throws Exception {
		String url = prob.getProperty("url");
		if (url == null)
			throw new Exception("url not found in property file");

		return url;
	}

	public String getDriverPath() throws Exception {
		String path = prob.getProperty("chromedriverpath");
		if (path == null)
			throw new Exception("password not found in property file");

		return path;
	}

	public String getBrowser() throws Exception {
		String browser = prob.getProperty("browser");
		if (browser == null)
			throw new Exception("browser not found in property file");

		return browser;
	}

	
}

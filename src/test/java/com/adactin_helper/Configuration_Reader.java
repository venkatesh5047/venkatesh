package com.adactin_helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\venkatesh\\eclipse-workspace\\cucumber_12pm\\src\\test\\java\\com\\adactin_property\\Cucumber_properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;

	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}

}

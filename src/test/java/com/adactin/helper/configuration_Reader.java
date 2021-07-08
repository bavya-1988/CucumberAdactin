package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configuration_Reader {
	public static Properties p;

	public configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\bavya_bose\\eclipse-workspace\\newMaven1\\src\\test\\java\\com\\adactin\\property\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

}

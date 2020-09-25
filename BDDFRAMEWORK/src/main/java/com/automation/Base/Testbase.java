package com.automation.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.utility.Waitime;

public class Testbase {

	public static WebDriver driver;

	public static Properties prop;

	public Testbase() {

		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Ganesh\\eclipse-workspace\\BDDFRAMEWORK\\src\\main\\java\\com\\automation\\config\\config.properties");

			prop.load(ip);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void intialiation() {
		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("Firefox")) {
			String s = System.setProperty("webdriver.gecko.driver",
					"C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

	public void Teardown() {
		driver.manage().deleteAllCookies();
		// driver.close();
		driver.quit();
	}
}

package com.CRM.GenericLibrary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstant {

	public static WebDriver driver;

	@BeforeClass
	public void openApplication() throws FileNotFoundException, IOException {

		// Reading data from properties file
		FileGenericLibrary fileObj = new FileGenericLibrary();
		String browserValue = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "browser");

		// Checking for browser matching
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
		} else if (browserValue.equalsIgnoreCase("fireFox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		} else {
			System.out.println("Enter proper browser");
		}

		// Read the url data from property file
		String applicationUrl = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "url");

		// Open the Url
		driver.get(applicationUrl);

		// Maximizing the window
		driver.manage().window().maximize();

		// Applying Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterClass(enabled = true)
	public void closeApplication() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}

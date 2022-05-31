package com.CRM.Login;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.GenericLibrary.BaseTest;
import com.CRM.GenericLibrary.FileGenericLibrary;
import com.CRM.GenericLibrary.WebDriverCommonLibrary;
import com.CRM.Pages.loginPage;

@Listeners(com.CRM.GenericLibrary.Listerners.class)
public class verifyLogin extends BaseTest {

	@Test
	public void loginPageVerification() throws FileNotFoundException, IOException {
		// Reading valid login credentials from property file
		FileGenericLibrary fileObj = new FileGenericLibrary();
		String userName = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "username");
		String password = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "password");

		// Login to the application
		loginPage loginPageObj = new loginPage();
		loginPageObj.login(userName, password);

		WebDriverCommonLibrary driverLib = new WebDriverCommonLibrary();
		String actualTitle = driverLib.getTitleOfThePage();
		String expectedTitle = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "homeTitle");

		// Verify the login
		driverLib.verifyPageTitle(actualTitle, expectedTitle, "Home Page");

	}
}

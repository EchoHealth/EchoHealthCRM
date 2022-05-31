package com.CRM.Home;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.GenericLibrary.BaseTest;
import com.CRM.GenericLibrary.WebDriverCommonLibrary;
import com.CRM.Login.verifyLogin;
import com.CRM.Pages.AccountsPage;
import com.CRM.Pages.HomePage;

@Listeners(com.CRM.GenericLibrary.Listerners.class)
public class VerifyAccountsTab extends BaseTest {
	@Test
	public void verifyAccountsTabTest() throws FileNotFoundException, IOException {

		// Login with valid credentials and verifying the page
		verifyLogin vLoginObj = new verifyLogin();
		vLoginObj.loginPageVerification();

		// Clicking on Accounts tab
		HomePage hPageObj = new HomePage();
		hPageObj.clickAccountsTab();

		// Verifying Accounts tab
		AccountsPage accPage = new AccountsPage();

		WebDriverCommonLibrary webDriverLib = new WebDriverCommonLibrary();
		webDriverLib.verifyElementDisplayed(accPage.getAccountsLabelEle(), "Accounts");

	}

}

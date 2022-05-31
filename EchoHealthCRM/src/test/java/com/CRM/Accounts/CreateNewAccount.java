package com.CRM.Accounts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.GenericLibrary.BaseTest;
import com.CRM.GenericLibrary.FileGenericLibrary;
import com.CRM.GenericLibrary.WebDriverCommonLibrary;
import com.CRM.Home.VerifyAccountsTab;
import com.CRM.Pages.AccountsPage;
import com.CRM.Pages.CreateAccountsPage;

@Listeners(com.CRM.GenericLibrary.Listerners.class)
public class CreateNewAccount extends BaseTest {

	@Test
	public void createNewAccountTest() throws FileNotFoundException, IOException {

		// login and Accounts tab verification
		VerifyAccountsTab vAccTestObj = new VerifyAccountsTab();
		vAccTestObj.verifyAccountsTabTest();

		// Clicking on Accounts Btn
		AccountsPage accPage = new AccountsPage();
		accPage.clickNewAccountBtn();

		// Verifying Page
		WebDriverCommonLibrary lib = new WebDriverCommonLibrary();
		FileGenericLibrary fileObj = new FileGenericLibrary();
		String actualTitle = lib.getTitleOfThePage();
		String expectedTitle = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "NewAccountTitle");

		lib.verifyPageTitle(actualTitle, expectedTitle, "Create New Account");

		// Click on lookup button
		CreateAccountsPage accCreationPage = new CreateAccountsPage();
		accCreationPage.clickAccountNameLoopupBtn();

		// Getting Windows id
		Set<String> wIds = driver.getWindowHandles();

		for (String id : wIds) {

			driver.switchTo().window(id);
			String windowActualtile = lib.getTitleOfThePage();
			String windowExpectedTitle = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "AccountLookUpTitle");

			if (windowActualtile.equalsIgnoreCase(windowExpectedTitle)) {
				Reporter.log("lookup", true);
				break;
			}
		}

	}

}

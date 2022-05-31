package com.CRM.Home;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.GenericLibrary.BaseTest;
import com.CRM.Login.verifyLogin;
import com.CRM.Pages.HomePage;

@Listeners(com.CRM.GenericLibrary.Listerners.class)
public class VerifyQuotesTab extends BaseTest {

	@Test
	public void verifyQuotesTabTest() throws FileNotFoundException, IOException {

		
		// Login with valid credentials and verifying the page
		verifyLogin vLoginObj = new verifyLogin();
		vLoginObj.loginPageVerification();

		HomePage hPageObj = new HomePage();
		
		for(int i = 0; i <= 20; i++) {
			
			Reporter.log("success", true);
			// Clicking on QuotesTab
			
			if(hPageObj.getQuotesTabEle().isDisplayed()) 
			{
				Reporter.log("success2", true);
				hPageObj.clickQuotesTab();
				break;

			} 
			else 
			{
				Reporter.log("success2", true);
				hPageObj.clickScrollRightArrowBtn();
			}

		}

	}

}

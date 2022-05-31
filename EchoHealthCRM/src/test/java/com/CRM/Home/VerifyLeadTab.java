package com.CRM.Home;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.GenericLibrary.BaseTest;
import com.CRM.GenericLibrary.WebDriverCommonLibrary;
import com.CRM.Login.verifyLogin;
import com.CRM.Pages.HomePage;
import com.CRM.Pages.LeadsPage;

@Listeners(com.CRM.GenericLibrary.Listerners.class)
public class VerifyLeadTab extends BaseTest {

	@Test
	public void verifyLeadTab() throws FileNotFoundException, IOException {

		// Login with valid credentials and verifying the page
		verifyLogin vLoginObj = new verifyLogin();
		vLoginObj.loginPageVerification();

		// Clicking on LeadsTab
		HomePage hPageObj = new HomePage();
		hPageObj.clickLeadTab();
		
		
		LeadsPage lPage = new LeadsPage();
		
		//Verifying leadsTab;
		WebDriverCommonLibrary driverObj = new WebDriverCommonLibrary();
		driverObj.verifyElementDisplayed(lPage.getLeadsTabLabelEle(), "Leads Tab ");
	}

}

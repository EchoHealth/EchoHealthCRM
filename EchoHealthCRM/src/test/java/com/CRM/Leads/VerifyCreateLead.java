package com.CRM.Leads;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.GenericLibrary.BaseTest;
import com.CRM.GenericLibrary.FileGenericLibrary;
import com.CRM.GenericLibrary.WebDriverCommonLibrary;
import com.CRM.Home.VerifyLeadTab;
import com.CRM.Pages.LeadsPage;

@Listeners(com.CRM.GenericLibrary.Listerners.class)
public class VerifyCreateLead extends BaseTest{

	@Test
	public void leadCreation() throws FileNotFoundException, IOException
	{
		//Login and verifying the leads page
		VerifyLeadTab  vLeadTabObj = new VerifyLeadTab();
		vLeadTabObj.verifyLeadTab();
		
		//Clicking on new leads button
		LeadsPage lPageobj = new LeadsPage();
		lPageobj.clickNewLeadbtn();
		
		//Verifing the create Lead Page
		WebDriverCommonLibrary libObj =  new WebDriverCommonLibrary();
		String actualTitle = libObj.getTitleOfThePage();
		
		FileGenericLibrary fileObj = new FileGenericLibrary();
		String expectedTitle = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "CreateLeadTitle");
		
		libObj.verifyPageTitle(actualTitle, expectedTitle, "Create Lead ");
		
		
	}
}

package com.CRM.GenericLibrary;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLibrary {
	
	public String getTitleOfThePage()
	{
		return BaseTest.driver.getTitle();
	}

	public void verifyPageTitle(String actualTitle , String expectedTitle , String pageName)
	{
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log(pageName + "Displayed : Pass" , true);
	}
	
	public void verifyElementDisplayed(WebElement ele , String elementName)
	{
	
		if(ele.isDisplayed())
		{
			Assert.assertTrue(true);
			Reporter.log(elementName + " Displayed- PASS" , true);
		}
		else
		{
			Reporter.log(elementName + " Not Displayed- PASS" , true);
			Assert.assertFalse(false);
		}
	}
}

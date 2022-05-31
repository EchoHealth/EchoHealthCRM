package com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.GenericLibrary.BaseTest;

public class CreateAccountsPage {

	public CreateAccountsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath = "//img[@title = 'Account Name Lookup']")
	private WebElement accountNameLoopupBtn;
	
	
	public void clickAccountNameLoopupBtn()
	{
		this.accountNameLoopupBtn.click();
	}

}

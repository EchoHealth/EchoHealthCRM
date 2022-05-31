package com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.GenericLibrary.BaseTest;

public class AccountsPage {
	
	public AccountsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy (xpath = "//td[contains(text() ,'Accounts: ')]")
	private WebElement accountsLabelEle;
	
	@FindBy (xpath = "//input[@value = 'New Account']")
	private WebElement newAccountBtnEle;
	
	public WebElement getAccountsLabelEle()
	{
		return this.accountsLabelEle;
	}
	
	public void clickNewAccountBtn()
	{
		this.newAccountBtnEle.click();
	}

}

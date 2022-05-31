package com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.GenericLibrary.BaseTest;

public class loginPage {

	public loginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(id="userName")
	private WebElement loginNameEle;
	
	@FindBy(id="passWord")
	private WebElement passwordEle;
	
	@FindBy(xpath ="//input[@title = 'Sign In']")
	private WebElement signInBtn;

	public WebElement getLoginNameEle() {
		return loginNameEle;
	}

	public WebElement getPasswordEle() {
		return passwordEle;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	public void login(String loginName, String password)
	{
		this.loginNameEle.sendKeys(loginName);
		this.passwordEle.sendKeys(password);
		this.signInBtn.click();
	}
	
}

package com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.GenericLibrary.BaseTest;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath = "//a[text() = 'Leads']")
	private WebElement leadTabEle;

	@FindBy(xpath = "//a[text() = 'Quotes']")
	private WebElement quotesTabEle;

	@FindBy(xpath = "//img[@id = 'scrollright']")
	private WebElement scrollRightArrowBtnEle;

	@FindBy(xpath = "//a[text() = 'Accounts']")
	private WebElement accountsTabEle;

	public WebElement getLeadTabEle() {
		return this.leadTabEle;
	}

	public void clickLeadTab() {
		this.leadTabEle.click();
	}

	public WebElement getQuotesTabEle() {
		return this.quotesTabEle;
	}

	public void clickQuotesTab() {
		this.quotesTabEle.click();
	}

	public WebElement getScrollRightArrowBtnEle() {
		return this.scrollRightArrowBtnEle;
	}

	public void clickScrollRightArrowBtn() {
		this.scrollRightArrowBtnEle.click();
	}

	public WebElement getAccountsTabEle() {
		return this.accountsTabEle;
	}

	public void clickAccountsTab() {
		this.accountsTabEle.click();
	}

}

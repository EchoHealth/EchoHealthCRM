package com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.GenericLibrary.BaseTest;

public class CreateLead {

	public CreateLead() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(name = "property(First Name)")
	private WebElement firstNameEle;

	@FindBy(name = "property(Last Name)")
	private WebElement lastNameEle;

	@FindBy(name = "property(Company)")
	private WebElement companyEle;

	@FindBy(xpath = "//td[contains(text() ,'Lead Information')]/../../../preceding-sibling::table//child::input[@value = 'Save']")
	private WebElement saveBtnEle;

	public void createLeadMethod()

	{


	}

}

package com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.GenericLibrary.BaseTest;

public class LeadsPage {

	public LeadsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//td[contains(text() , 'Leads: ')]")
	private WebElement leadsTabLabelEle;
	
	@FindBy(xpath ="//input[@value= 'New Lead']")
	private WebElement newLeadBtnEle;
	
	
	public WebElement getLeadsTabLabelEle()
	{
		return this.leadsTabLabelEle;
	}
	
	public String getLeadsLabel()
	{
		return this.leadsTabLabelEle.getText();
	}
	
	public WebElement getNewLeadBtnEle()
	{
		return this.newLeadBtnEle;
	}
	
	public void clickNewLeadbtn()
	{
		this.newLeadBtnEle.click();
	}
}

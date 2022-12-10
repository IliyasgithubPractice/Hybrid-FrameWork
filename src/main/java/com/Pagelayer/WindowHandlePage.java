package com.Pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baselayer.Baseclass;
import com.Utilslayer.WindowHandleUtils;

public class WindowHandlePage extends Baseclass {
	@FindBy(name="fname")
	WebElement firstname;
	@FindBy(name="lname")
	WebElement lastname;
	@FindBy(xpath="//a[text()='Visit Orange HRM']")
	WebElement HRMlink;
	
	public WindowHandlePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public void details(String v1,String v2)
	{
		WindowHandleUtils.detaiLS(firstname, lastname, v1, v2);
	}
	public void clickOnHrmLink()
	{
		WindowHandleUtils.winAll(HRMlink);
	}

}

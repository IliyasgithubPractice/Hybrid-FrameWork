package com.Pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baselayer.Baseclass;
import com.Utilslayer.ConfigUtils;

public class ConfigPage extends Baseclass{
	@FindBy(name="firstname")
	private WebElement fname1;
	@FindBy(name="lastname")
	private WebElement lname1;
	@FindBy(name="reg_email__")
	private WebElement email1;
	
	public ConfigPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public void enterfname(String fname)
	{
		ConfigUtils.enterData(fname1,fname);
		
	}
	public void enterlname(String lname)
	{
		ConfigUtils.enterData(lname1,lname);
		
	}
	public void enteremail(String email)
	{
		ConfigUtils.enterData(email1,email);
		
	}

}

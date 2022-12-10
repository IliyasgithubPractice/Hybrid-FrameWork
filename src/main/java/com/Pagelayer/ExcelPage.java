package com.Pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baselayer.Baseclass;
import com.Utilslayer.ExcelReadUtils;

public class ExcelPage extends Baseclass{
	@FindBy(name="firstname")
	private WebElement fname;
	@FindBy(name="lastname")
	private WebElement lname;
	@FindBy(name="reg_email__")
	private WebElement email;
	
	public ExcelPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public void getData(String Fname,String Lname,String Email)
	{
		ExcelReadUtils.getElement(fname, lname, email, Fname, Lname, Email);
	}

}

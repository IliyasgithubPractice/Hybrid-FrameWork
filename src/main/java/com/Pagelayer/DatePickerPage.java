package com.Pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baselayer.Baseclass;
import com.Utilslayer.DatePickerUtils;

public class DatePickerPage extends Baseclass {
	@FindBy(xpath="//input[@id='onward_cal']")
	WebElement clickON;
	@FindBy(xpath="//tr[@class='rb-monthHeader']")
	WebElement getMonthTitle;
	@FindBy(xpath="//td[@class='next']")
	WebElement nextClick;
	@FindBy(xpath="//td[text()='12']")
	WebElement dateClick;
	
	public DatePickerPage()  throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnTable()
	{
		DatePickerUtils.clickOnTable(clickON);
	}
	public void runTheTable(String v1) throws InterruptedException
	{
		DatePickerUtils.datepick(v1, getMonthTitle, nextClick, dateClick);
	}

}

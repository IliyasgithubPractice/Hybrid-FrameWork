package com.Pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baselayer.Baseclass;
import com.Utilslayer.DropDownFButils;

public class PageFBdropDown extends Baseclass {
	@FindBy(id="day")
	private WebElement day1;
	@FindBy(id="month")
	private WebElement month1;
	@FindBy(id="year")
	private WebElement year1;
	
	public PageFBdropDown() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public void getDate(String day) throws InterruptedException
	{
		DropDownFButils.getDay(day1, day);
	}
	public void selectday() throws InterruptedException
	{
		DropDownFButils.selectDay(day1);
	}
	public void getMonth(String month) throws InterruptedException
	{
		DropDownFButils.getMonth(month1, month);
	}
	public void selectMonth() throws InterruptedException
	{
		DropDownFButils.selectMonth(month1);
	}
	public void getYear(String year) throws InterruptedException
	{
		DropDownFButils.getYear(year1, year);
	}
	public void selectYear() throws InterruptedException
	{
		DropDownFButils.selectYear(year1);
	}

}

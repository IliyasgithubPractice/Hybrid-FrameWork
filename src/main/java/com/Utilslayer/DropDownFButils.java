package com.Utilslayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Baselayer.Baseclass;

public class DropDownFButils extends Baseclass{
	public DropDownFButils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void getDay(WebElement day,String value) throws InterruptedException
	{
		Select dyy=new Select(day);
	
		new Select(day).selectByVisibleText(value);
	}
	public static String selectDay(WebElement day) throws InterruptedException
	{
		
		return new Select(day).getFirstSelectedOption().getText();
	}
	public static void getMonth(WebElement month,String vlaue) throws InterruptedException
	{
		Select mm=new Select(month);
	
		new Select(month).selectByVisibleText(vlaue);
	}
	public static String selectMonth(WebElement month) throws InterruptedException
	{
	
		return new Select(month).getFirstSelectedOption().getText();
	}
	public static void getYear(WebElement year,String value) throws InterruptedException
	{
		
		Select yy=new Select(year);
		
		new Select(year).selectByVisibleText(value);
	}
	public static String selectYear(WebElement year) throws InterruptedException
	{

		return new Select(year).getFirstSelectedOption().getText();
	}

}

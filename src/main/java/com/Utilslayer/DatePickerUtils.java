package com.Utilslayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.Baselayer.Baseclass;

public class DatePickerUtils extends Baseclass{
	public DatePickerUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void clickOnTable(WebElement clickOn)
	{
		clickOn.click();
	}
	public static void datepick(String value,WebElement month,WebElement next,WebElement date) throws InterruptedException
	{
		String a=month.getText();
		
		while(true)
		{
			System.out.println(a);
			if(a.equals(value))
			{
				break;
			}
			else
			{
				
				Thread.sleep(3000);
				
				next.click();
			}
		}
		
		date.click();
		
	}

}

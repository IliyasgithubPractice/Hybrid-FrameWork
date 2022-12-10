package com.Utilslayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Baselayer.Baseclass;

public class FrameHandleUtils extends Baseclass {
	public FrameHandleUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void defaultContent()
	{
		driver.switchTo().defaultContent();
	}
	public static void parentFrame()
	{
		driver.switchTo().parentFrame();
	}
	public static void switchFrame(String v1)
	{
		driver.switchTo().frame(v1);
	}
	public static void topFrame(WebElement wb,String v1) throws InterruptedException
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.sendKeys(v1);
		}
		Thread.sleep(4000);
		wb.clear();
	}
	public static void mobileNo(WebElement wb,String v2)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.sendKeys(v2);
		}
	}
	public static void checkBox(List<WebElement> wb)
	{
		for(int i=0;i<wb.size();i++)
		{
			wb.get(i).click();
		}
	}
	public static void address(WebElement wb,String v3)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.sendKeys(v3);
		}
		
	}
	public static void getVisisbleText(WebElement wb,String v4)
	{
		Select course=new Select(wb);
		new Select(wb).selectByVisibleText(v4);
		
	}
	public static String getSelectedValue(WebElement wb)
	{
		return new Select(wb).getFirstSelectedOption().getText();
	}

}

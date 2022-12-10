package com.Utilslayer;

import org.openqa.selenium.WebElement;

public class ConfigUtils {
	public static void enterData(WebElement wb,String a)
	{
		if(wb.isDisplayed())
		{
			wb.sendKeys(a);
		}
	

}
}

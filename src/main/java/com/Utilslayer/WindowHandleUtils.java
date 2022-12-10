package com.Utilslayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;

import com.Baselayer.Baseclass;

public class WindowHandleUtils extends Baseclass {
	public WindowHandleUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void detaiLS(WebElement fName, WebElement lName, String v1, String v2) {
		if ((fName.isDisplayed()) && (fName.isEnabled())) {
			fName.sendKeys(v1);
			lName.sendKeys(v2);
		}

	}

	public static ArrayList<String> resuseablearray(Set<String> Allwin) {
		int a = Allwin.size();
		Iterator<String> abc = Allwin.iterator();
		ArrayList<String> All = new ArrayList<String>(Allwin);
		for (int i = 0; i < a; i++) {

			All.add(abc.next());
		}
		return All;
	}
	public static void winAll(WebElement wb)
	{
		if(wb.isDisplayed())
		{
			wb.click();
		}
	}
	public static void switCh(String v1)
	{
		driver.switchTo().window(v1);
	}

}

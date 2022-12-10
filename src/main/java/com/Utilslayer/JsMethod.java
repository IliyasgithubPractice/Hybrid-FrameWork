package com.Utilslayer;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Baselayer.Baseclass;

public class JsMethod extends Baseclass {
	public static void clickOnElement(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click;", wb);
	}
	public static void clickById(String value)
	{
		((JavascriptExecutor)driver).executeScript("document.getElementById('"+value+"')");
	}
	public static void sendData(WebElement wb,String value)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+value+"';", wb);
	}
	public static void sendDataById(String value)
	{
		((JavascriptExecutor)driver).executeScript("document.getElementById('"+value+"');");
	}
	public static void alert(String value)
	{
		((JavascriptExecutor)driver).executeScript("alert('"+value+"')");
	}
	public static void confirm(String value)
	{
		((JavascriptExecutor)driver).executeScript("confirm('"+value+"')");
	}
	public static void prompt(String value)
	{
		((JavascriptExecutor)driver).executeScript("prompt('"+value+"')");
	}
	public static String capUrl()
	{
		return ((JavascriptExecutor)driver).executeScript("return document.URL").toString();
	}
	public static String capTitle()
	{
		return ((JavascriptExecutor)driver).executeScript("return document.title").toString();
	}
	public static void openBrowser(String value)
	{
		((JavascriptExecutor)driver).executeScript("window location='"+value+"'");
	}
	public static void scrollIntoView(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",wb);
	}
	public static void handleDropDown(String wb,String value)
	{
		((JavascriptExecutor)driver).executeScript("document.getElementByName('"+wb+"').value='"+value+"';");
	}
	public static void moveForward(String forward)
	{
		((JavascriptExecutor)driver).executeScript("history.go(-'"+forward+"');");
	}
	public static void moveBackward(String backward)
	{
		((JavascriptExecutor)driver).executeScript("history.go(-'"+backward+"');");
	}
	public static void refreshPage(String refresh)
	{
		((JavascriptExecutor)driver).executeScript("history.go('"+refresh+"');");
	}
	public static void scrollWindow(String value)
	{
		((JavascriptExecutor)driver).executeScript("window.scrollBy('"+value+"');");
	}
	public static void highElement(String value,WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='"+value+"';",wb);
	}

}

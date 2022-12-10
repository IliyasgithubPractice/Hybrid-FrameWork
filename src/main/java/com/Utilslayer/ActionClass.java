package com.Utilslayer;


import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Baselayer.Baseclass;

public class ActionClass extends Baseclass {
	public ActionClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	static Actions act;
	public static void click(WebElement wb)
	{
		act=new Actions(driver);
		act.click(wb).build().perform();
	}
	public static void doubleClick(WebElement wb)
	{
		act.doubleClick(wb).build().perform();
	}
	public static void rightClick(WebElement wb)
	{
		act.contextClick(wb).build().perform();
	}
	public static void mouseOver(WebElement wb)
	{
		act.moveToElement(wb).build().perform();
	}
	public static void dragDrop(WebElement src,WebElement trg)
	{
		act.dragAndDrop(src,trg).build().perform();
	}
	public static void sendKey(WebElement wb,String value)
	{
		act.click(wb).sendKeys(value).build().perform();
	}
	public static void keyDown()
	{
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}
	public static void keyUp()
	{
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}
	
	

}

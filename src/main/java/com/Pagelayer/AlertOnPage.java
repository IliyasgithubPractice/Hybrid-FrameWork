package com.Pagelayer;

import java.io.IOException;

import org.openqa.selenium.By;

import com.Baselayer.Baseclass;

public class AlertOnPage extends Baseclass {
	public AlertOnPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void userName(String value) throws InterruptedException
	{
		driver.findElement(By.name("login")).sendKeys(value);
		Thread.sleep(3000);
	}

	public static void  password(String value) throws InterruptedException
	{
		driver.findElement(By.name("passwd")).sendKeys(value);
		Thread.sleep(3000);
	}
	public static void  signUp()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

}

package com.Testlayer;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baselayer.Baseclass;
import com.Pagelayer.DatePickerPage;

public class DatePickerTest extends Baseclass {
	public DatePickerTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void setUp()
	{
		Baseclass.initialization();
	}
	@Test
	public void pushCal() throws InterruptedException, IOException
	{
		DatePickerPage datePickUp=new DatePickerPage();
		datePickUp.clickOnTable();
		datePickUp.runTheTable("Feb 2023");
	}
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}

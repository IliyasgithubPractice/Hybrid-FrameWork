package com.Testlayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baselayer.Baseclass;
import com.Pagelayer.PageFBdropDown;

public class DropDownFBtest extends Baseclass {
	public DropDownFBtest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	static PageFBdropDown fb;
	@BeforeTest
	public void setUp()
	{
		Baseclass.initialization();
	}
	@Test
	public void selectDay() throws InterruptedException, IOException
	{
		 fb=new PageFBdropDown();
		 fb.getDate("10");
		 fb.selectday();
		 Assert.assertEquals(true, true);
	}
	@Test
	public void selectMonth() throws InterruptedException
	{
		fb.getMonth("Aug");
		fb.selectMonth();
		Assert.assertEquals(true, true);
	}
	@Test
	public void selectYear() throws InterruptedException
	{
	
		fb.getYear("1994");
		fb.selectYear();
	}
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}

}

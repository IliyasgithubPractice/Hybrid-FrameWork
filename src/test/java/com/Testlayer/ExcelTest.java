package com.Testlayer;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Baselayer.Baseclass;
import com.Pagelayer.ExcelPage;
import com.Utilslayer.ExcelReadUtils;

public class ExcelTest extends Baseclass {
	public ExcelTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	static ExcelPage data;
	@BeforeTest
	public void setUp()
	{
		Baseclass.initialization();
	}
	@Test(dataProvider="fbdata")
	public void enterData(String fname,String lname,String email) throws InterruptedException, IOException
	{
		 data=new ExcelPage();
		 data.getData(fname, lname, email);
//		 Thread.sleep(3000);
//	     driver.close();
	}
	@DataProvider(name="fbdata")
	public Object [][] capData() throws Exception
	{
		return ExcelReadUtils.capdata(0, "C:\\Users\\ALSR\\Desktop\\Testing\\FB_data.xlsx");
	}
	@AfterTest
	public void stop() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}

}

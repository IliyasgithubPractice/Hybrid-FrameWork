package com.Testlayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baselayer.Baseclass;
import com.Pagelayer.WindowHandlePage;
import com.Utilslayer.WindowHandleUtils;

public class WindowHandleTest extends Baseclass {
	public WindowHandleTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	static WindowHandlePage whd;
	@BeforeTest
	public void setUp()
	{
		Baseclass.initialization();
	}
	@Test
	public void details() throws IOException
	{
		whd=new WindowHandlePage();
		whd.details("ILIYAS", "TAMBOLI");
	}
	@Test
	public void windowHandl()
	{
		Set<String> Allwin=driver.getWindowHandles();
		ArrayList<String> all=WindowHandleUtils.resuseablearray(Allwin);
		String parent=all.get(0);
		System.out.println(parent);
		System.out.println(driver.getTitle());
		System.out.println("==============================================================");
		whd.clickOnHrmLink();
		Allwin=driver.getWindowHandles();
		all=WindowHandleUtils.resuseablearray(Allwin);
		String hrmid=all.get(1);
		WindowHandleUtils.switCh(hrmid);
		System.out.println(hrmid);
		System.out.println(driver.getTitle());
		System.out.println("========================================================================");
		WindowHandleUtils.switCh(parent);

	}
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}

}

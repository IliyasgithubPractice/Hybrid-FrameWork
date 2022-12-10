package com.Testlayer;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baselayer.Baseclass;
import com.Pagelayer.AlertOnPage;
import com.Utilslayer.Alertpopup;

public class AlertTest extends Baseclass {
	
	public AlertTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest 
	public void SetUp()
	{
		Baseclass.initialization();
	}
	@Test
	public void login() throws InterruptedException
	{
		AlertOnPage.userName("Iliyas");
		//AlertOnPage.password("56788865");
		AlertOnPage.signUp();
		Alertpopup.getText();
		//Thread.sleep(3000);
		Alertpopup.accept();
	}
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(300);
		driver.close();
	}

}

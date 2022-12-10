package com.Testlayer;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baselayer.Baseclass;
import com.Pagelayer.FrameHandlePage;
import com.Utilslayer.FrameHandleUtils;

public class FrameHandleTest extends Baseclass {
	public FrameHandleTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	static FrameHandlePage frame;

	@BeforeTest
	public void setUp() {
		Baseclass.initialization();
	}

	@Test
	public void webPage1() throws InterruptedException, IOException {
		frame = new FrameHandlePage();
		frame.topFrame1("ILIYAS AYUB TAMBOLI");
		FrameHandleUtils.switchFrame("mobileFrame");
		frame.mobileFrame("9604667673");
		FrameHandleUtils.switchFrame("showcheckbox");
		Thread.sleep(10000);
		frame.checkBox();
		FrameHandleUtils.defaultContent();
		FrameHandleUtils.switchFrame("addressframe");
		frame.addFrame("VADGAON");
		FrameHandleUtils.switchFrame("toolframe");
		Thread.sleep(10000);
		frame.selectFromList("BDD Framework");
		Thread.sleep(8000);
		frame.capValueFromList();
		FrameHandleUtils.defaultContent();
		frame.topFrame1("ITTESAM ILIYAS TAMBOLI");
		Thread.sleep(4000);
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(8000);
		driver.close();
	}

}

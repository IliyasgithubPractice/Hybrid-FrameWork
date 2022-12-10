package com.Pagelayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baselayer.Baseclass;
import com.Utilslayer.FrameHandleUtils;

public class FrameHandlePage extends Baseclass {
	@FindBy(name="name")
	WebElement fullname;
	@FindBy(name="mob")
	WebElement mobileNo;
	@FindBy(xpath="//label")
	List<WebElement> checkbox;
	@FindBy(name="add")
	WebElement address;
	@FindBy(name="course")
	WebElement courseList;
	
	public FrameHandlePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public  void topFrame1(String v1) throws InterruptedException
	{
		FrameHandleUtils.topFrame(fullname, v1);
	}
	public  void mobileFrame(String v2)
	{
		FrameHandleUtils.mobileNo(mobileNo, v2);
		
	}
	public void checkBox()
	{
		FrameHandleUtils.checkBox(checkbox);
	}
	public  void addFrame(String v3)
	{
		FrameHandleUtils.address(address, v3);
		
	}
	public void selectFromList(String value)
	{
		FrameHandleUtils.getVisisbleText(courseList, value);
		
	}
	public void capValueFromList()
	{
		System.out.println(FrameHandleUtils.getSelectedValue(courseList));
	}
	

}

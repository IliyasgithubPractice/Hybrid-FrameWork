package com.Utilslayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Baselayer.Baseclass;
import com.google.common.io.Files;

public class UtilsClass extends Baseclass  {
	public UtilsClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static String takePassScreenShot(String methodname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		String date=new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		String distpath=(System.getProperty("user.dir")+"//PassScreenShot//"+methodname+date+".png");
		File dist=new File(distpath);
		try
		{
			FileUtils.copyFile(f, dist);
		}catch(Exception e){
			e.printStackTrace();
		}
		return distpath;
	}
	public static String takeFailScreenShot(String methodname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		String date=new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		String distpath=(System.getProperty("user.dir")+"//FailScreenShot//"+methodname+date+"+.png");
		File dist=new File(distpath);
		try
		{
			FileUtils.copyFile(f, dist);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return distpath;
	}

}

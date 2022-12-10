package com.Utilslayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentSetup {
	public static ExtentReports extendsreport;
	public static ExtentReports ExtendSetUp()
	{
		String a=new SimpleDateFormat("DDMMyyyy_HHmmss").format(new Date());
		ExtentSparkReporter excelsparkrepoter=
				new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports"+a+".html");
	    extendsreport=new ExtentReports();
	    extendsreport.attachReporter(excelsparkrepoter);
	    return extendsreport;
		
	}

}

package com.Utilslayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class ListnersClass extends ExtentSetup implements ITestListener {
	ExtentTest extenttest;
	public void onStart(ITestResult result) {
	        ExtentSetup.ExtendSetUp();
	}
	public void onTestStart(ITestResult result) {
		extenttest=extendsreport.createTest(result.getMethod().getMethodName());
		
	}


	public void onTestSuccess(ITestResult result) {
		 extenttest.log(Status.PASS, "pass test cases"+result.getMethod().getMethodName());
		 extenttest.addScreenCaptureFromPath(UtilsClass.takePassScreenShot(result.getMethod().getMethodName()));
		 
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, "failed test cases"+result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(UtilsClass.takeFailScreenShot(result.getMethod().getMethodName()));

	
	}

	public void onTestSkipped(ITestResult result) {
	extenttest.log(Status.SKIP, "skiped test cases"+result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extendsreport.flush();
	}
	

}

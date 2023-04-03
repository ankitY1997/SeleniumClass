package com.banking.utilites;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting extends TestListenerAdapter
{
	
	Date date=new Date();
	
	String newdate=date.toString();
	String modifydate="Test_"+newdate.replace(" ","_").replace(":","_")+".html";
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("./ExtentReport/"+modifydate+"");
	
	//now we have to attach report
	
	
	ExtentTest test;
	
@Override
public void onStart(ITestContext testContext)
{
	extent.attachReporter(spark);
	test=extent.createTest("this is verify page").assignAuthor("ankit").assignCategory("smoke");
	test.info(" E-Banking");
	test.info("this is login test");
	
}
	
@Override
public void onTestSuccess(ITestResult tr)
{
	test.log(Status.PASS,"sucessfully pass "+tr.getName());
	test.log(Status.PASS,"login ddt is passed");
	
}
 @Override
public void onTestFailure(ITestResult tr)
{
	test.log(Status.FAIL," test case"+tr.getName()+" is failed ");
	//test.log(null, modifydate)

	
}
@Override
public void onTestSkipped(ITestResult tr)
{
	
	test.log(Status.SKIP,"test case "+tr.getName()+"is skip");
}

@Override
public void onFinish(ITestContext testContext)
{
	test.log(Status.INFO,"test is finished");
	extent.flush();
}
}

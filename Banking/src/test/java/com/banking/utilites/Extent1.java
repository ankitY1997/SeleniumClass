package com.banking.utilites;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent1 
{
	
	public WebDriver driver;
	Date date=new Date();
	String s=date.toString();
	String modifydate=s.replace(" ","_").replace(":","_");
     
	String newdate=modifydate+".html";

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("./ExtentReport/+newdate");
	
	
	
	@BeforeTest
	
	public void f1()
	{
	 extent.attachReporter(spark);
	
	}
	
	@Test
	
	public void test1()
	{
		
		ExtentTest test=extent.createTest("this verifying test").assignAuthor("ankit").assignCategory("smoke");
		
		test.log(Status.PASS, "login test is passed");
		
	}
	
	@AfterTest
	
	public void test2()
	{
		extent.flush();
	}
	
}

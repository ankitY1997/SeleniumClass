package com.appname.utils;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager 
{

	public static ExtentReports extent;
	
	
	public static ExtentReports getReport()
	{
		
		if(extent==null)
		{
			
		
		Date d=new Date();
		
		String filename=d.toString().replace(":","_").replace(" ","_")+".html";
		
		String reportPath=System.getProperty("user.dir")+"\\Reports\\";
		
		extent=new ExtentReports(reportPath+filename,false,DisplayOrder.NEWEST_FIRST);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\ReportsConfig.xml"));
		
		}
	
		return extent;
	}
	
}

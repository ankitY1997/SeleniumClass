package com.banking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.Status;
import com.banking.utilites.ReadConfig;
import com.banking.utilites.ReadDataExcel;

public class BaseClass
{
	ReadConfig read=new ReadConfig();	
	
	public String url=read.getApplicationUrl();
	public String userId=read.getUserId();
	public String passward=read.getPasswrd();
	public WebDriver driver;
	public static Logger logger;
	
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser)
	{

	      	logger=Logger.getLogger("ebank");
	     // logger.info("this logger details");
	      String log4jfilepath=System.getProperty("user.dir")+"/Mylogger/log4j.properties";
	     PropertyConfigurator.configure(log4jfilepath);
	     
	     if(browser.equals("chrome"))
	     {
	    	  System.setProperty("webdriver.chrome.driver",read.getChromePath());
	 	     driver=new ChromeDriver();
	 	      driver.manage().window().maximize();
	 	     driver.get(url);
		     logger.info("suceesfully open url");
	     }
	     else if(browser.equals("Edge"))
	     {
	    	  System.setProperty("webdriver.edge.driver",read.getEdgePath());
	 	     driver=new EdgeDriver();
	 	      driver.manage().window().maximize();
	 	     driver.get(url);
		     logger.info("suceesfully open url");
	     }
	     
//	     driver.get(url);
//	     logger.info("suceesfully open url");
//	      	
	      
	}
	
	@AfterClass
	public void tearDown()
	{
	
		driver.quit();
		
	}
	public void captureScreenShot(WebDriver driver,String classname)
	{
		Date date=new Date();
		
		String newdate=date.toString();
		
		
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		String modifydate1="Test_"+newdate.replace(" ","_").replace(":","_")+".jpg";
		File file=ss.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file,new File("./ScreenShots/"+modifydate1));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}

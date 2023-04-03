package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utills.DataReadExcel;

public class BaseClass extends DataReadExcel {
	
	
	public static WebDriver driver;
	protected static Logger logger;
	
@BeforeClass
	
	public void setUp()
	{

		openBrowser("Edge");

		openUrl("https://maqdoomec.github.io/login.html");
		logger=Logger.getLogger("URL SUCCESFULLY OPEN");
		String log4jfilepath=System.getProperty("user.dir")+"/Mylogger/log4j.properties";
		PropertyConfigurator.configure(log4jfilepath);
		
	}

	
	public void openBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			
			driver=new ChromeDriver();
			
			
		}
		else if(browser.equals("Edge"))
		{
		System.setProperty("webdriver.edge.driver","./Driver/msedgedriver.exe")	;
		driver=new EdgeDriver();
			
		}
		
	}
	
	public void openUrl(String url)
	{
		driver.get(url);
	}
	
	@AfterTest
	
	
		
	public void closeConnect()
	{
		driver.quit();
	}
	
	
	public boolean isAlert()
	{
		try {
		driver.switchTo().alert();
		
	
		
		return true;
		}
		catch(Exception e)
		{
			
			
			return false;
		}
	}

}

package com.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BasePage 
{
public static WebDriver driver;
	public void openBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			opt.addArguments("--start-maximized");
			opt.addArguments("ignore certificate error ");
			
			driver=new ChromeDriver(opt);
			
		
			
		}
		else if(browser.equals("Edge"))
		{
		System.setProperty("webdriver.edge.driver","./Driver/msedgedriver.exe")	;
		EdgeOptions opt=new EdgeOptions();
		
		
		driver=new EdgeDriver();
		
			
		}
	}
		
		public void  openUrl(String url)
		{
			
			driver.get(url);
			
		}
	
	
	
	
	
	
	
	
}

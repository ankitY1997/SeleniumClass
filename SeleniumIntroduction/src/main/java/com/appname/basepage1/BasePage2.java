package com.appname.basepage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage2 
{
	
	public WebDriver driver;
		
		public void openBrowser(String name )
		{
			if(name.equalsIgnoreCase("chrome"))
			{

				System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			}
			else if(name.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
				 driver=new EdgeDriver();
				 driver.manage().window().maximize();
			}
		}
		
		public  void openUrl(String name)
		{
			
			driver.get(name);
		}
	}



package com.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpeningUrlParent 
{
		
	public void url(String name)
	{
		System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.msedge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
	      EdgeDriver  driver2=new EdgeDriver();
	      
		if(name=="chrome")
		{
			System.out.println("this is google open webside");
			driver1.get("https:\\www,google.com");
			
		}
		else if(name=="edge")
		{
			System.out.println("this is edge open website");
			driver2.get("http://google.com");
		}
		
	}
}

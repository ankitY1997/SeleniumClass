package com.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElement1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://hi-in.facebook.com/");
		WebElement se = (WebElement) driver1.findElement(By.linkText("English (UK)"));
			se.click();
	}

}

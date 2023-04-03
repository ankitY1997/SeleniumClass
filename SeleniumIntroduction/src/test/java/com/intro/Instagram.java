package com.intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(20,driver."seconds");
		/*driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();*/
		
		for(int count=0;count<=5;count++)
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		username.click();
		WebElement lgin=driver.findElement(By.xpath("//input[@name='email']"));
		lgin.sendKeys("9340256458");
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("ankit@123");
		
		WebElement button=driver.findElement(By.xpath("//button[@id='loginbutton']"));
					button.click();
			
		}
		 
		 
		
	}

}

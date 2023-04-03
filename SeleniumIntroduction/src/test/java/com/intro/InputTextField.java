package com.intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class InputTextField {
//input text field
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();//for maximized
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		/*String act_tittle=driver.getTitle();
		String exp_tittle="facebook";
		System.out.println(act_tittle);
		
		if(exp_tittle.equals(act_tittle))
		{
			System.out.println("test is passed");
			
		}
		else
		{
			System.out.println("test is failed");	
		}*/
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("9340256458");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ankit@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
			String exp="Facebook � log in or sign up";
			String act=driver.getTitle();
			System.out.println(act);
			
			/*if(exp.equals(act))
			{
				System.out.println("the test is pased ");
			}
			else
			{
				System.out.println("test  is failed");
			}*/
	}

}

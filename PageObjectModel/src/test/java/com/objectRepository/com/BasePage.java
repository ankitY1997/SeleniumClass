package com.objectRepository.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver  driver){
		
		this.driver=driver;
	
		
		
		
	}
			@FindBy(xpath="//input[@name=\"q\"]")
			public  String searchbox;
			
		
			public void searchBox(String url,String sendkeys)
			{
			
		
				driver.get(url);
				driver.findElement(By.xpath(searchbox)).sendKeys(sendkeys);
			}
			


}

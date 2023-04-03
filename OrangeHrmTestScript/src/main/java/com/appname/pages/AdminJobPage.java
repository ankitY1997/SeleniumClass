package com.appname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.appname.basepage.BasePage;
import com.appname.utils.ObjectRepository;
import com.relevantcodes.extentreports.ExtentTest;

public class AdminJobPage extends BasePage 
{

	//public WebDriver driver;
	@FindBy(xpath=ObjectRepository.straddJob)
	public WebElement straddJob;

	
	
	public AdminJobPage (WebDriver driver,ExtentTest test)
	{
		super(driver,test);
	}
	
	public void clickAdd() throws InterruptedException
	{
		Thread.sleep(5000);
		straddJob.click();
		Thread.sleep(2000);
	}
}

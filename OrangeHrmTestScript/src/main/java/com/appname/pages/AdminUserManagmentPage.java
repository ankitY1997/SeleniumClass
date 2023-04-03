package com.appname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.appname.basepage.BasePage;
import com.appname.utils.ObjectRepository;
import com.relevantcodes.extentreports.ExtentTest;

public class AdminUserManagmentPage extends BasePage {

	//public WebDriver driver;
	@FindBy(xpath=ObjectRepository.strJob)
	public WebElement job;
	@FindBy(xpath=ObjectRepository.strJobTitle)
	public WebElement jobTitle;
	
	
	public AdminUserManagmentPage(WebDriver driver,ExtentTest test)
	{
		super(driver,test);
	}
		
	
	public void clickJobTitle() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		act.moveToElement(job).click(job).build().perform();
		
		act.moveToElement(jobTitle).click().build().perform();
		Thread.sleep(5000);
		
		
	}

}

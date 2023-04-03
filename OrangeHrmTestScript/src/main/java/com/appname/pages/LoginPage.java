package com.appname.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appname.basepage.BasePage;
import com.appname.utils.ObjectRepository;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class LoginPage extends BasePage{
	//public WebDriver driver;
	
	
	//now we are using page Factory annotation @FindBy=
	
	
	
	@FindBy(xpath=ObjectRepository.strusername)
	private WebElement username;
	
	@FindBy(xpath=ObjectRepository.strpassword)
	private WebElement password;
	
	@FindBy(xpath=ObjectRepository.strloginbutton)
	private WebElement loginbutton;
	@FindBy(xpath=ObjectRepository.dashboard)
	private WebElement dashboard;
	public LoginPage(WebDriver driver, ExtentTest test)
	{
		super(driver,test);
		
		this.test=test;
	}
	public void clickLogin()
	{
		
		
	  WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(1000));
	  
	  
		//driver.findElement(By.xpath(username)).sendKeys("Admin");
		
		//driver.findElement(By.xpath(password)).sendKeys("admin123");
		//driver.findElement(By.xpath(loginbutton)).click();
	  //now using page factory annotation so instead of using fine element it will directly call let's see
	  wt.until(ExpectedConditions.visibilityOf(username));
	  
	  test.log(LogStatus.INFO, "entering username Admin"+test.addScreenCapture(screenShot()));
	  
	 // username.sendKeys("Admin");
	 // test.log(LogStatus.INFO, "entering passward");
	 // password.sendKeys("admin123");
	  
	
	  typeInto(username,"Admin","admin");
	  typeInto(password,"admin123","passward");
	  elementClick(loginbutton);
	  
		
	}
	
	public void verify()
	{
		verfiyPageTitle(dashboard,"Dashboard");
	}
	
	public void verifyElementes()
	{
		verifyElement(dashboard);
	}

}

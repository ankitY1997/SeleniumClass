package com.banking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
 
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name=\"uid\"]")
	public WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	public WebElement passward;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	public WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Log out']")
	public WebElement logout;
	
	
	
	
	public  LogInPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		
		PageFactory.initElements(rdriver,this);
		
		
	}
	
	public void setUserName(String sendusername)
	{
		username.sendKeys(sendusername);
		
	}
	
	public void setPassward(String  sendpassward)
	{
		passward.sendKeys(sendpassward);
	}
	
	
	public void clickSubmit()
	{
		loginbutton.click();
	}
	
	public void clickLogOut()
	{
		logout.click();
	}
 
	
}

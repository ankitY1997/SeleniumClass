package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.utills.ObjectRepository;
import com.inetbanking.utills.WrapperMethods;

public class LogInPage extends WrapperMethods {
	
	
	public WebDriver driver;
	
	
	public LogInPage(WebDriver driver)
	{
	
		this.driver=driver;
		
		PageFactory.initElements(this.driver,this);
		
	}
	
	
	@FindBy(xpath=ObjectRepository.username)
	public WebElement username;
	
	@FindBy(xpath=ObjectRepository.password)
	public WebElement password;
	
	@FindBy(xpath=ObjectRepository.loginbutton)
	public WebElement loginbutton;
	
	@FindBy(xpath=ObjectRepository.logoutbutton)
	public WebElement logoutbutton;


	@FindBy(xpath=ObjectRepository.username1)
	public WebElement username1;

	@FindBy(xpath=ObjectRepository.password1)
	public WebElement password1;

	@FindBy(xpath=ObjectRepository.loginbutton1)
	public WebElement loginbutton1;


    @FindBy(xpath=ObjectRepository.searchterm)
	public WebElement searchterm;

	@FindBy(xpath=ObjectRepository.searchcontent)
	public WebElement searchcontent;


	

	

}

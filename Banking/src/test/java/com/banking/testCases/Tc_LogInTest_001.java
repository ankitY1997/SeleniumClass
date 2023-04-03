package com.banking.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.banking.pageobjects.LogInPage;



public class Tc_LogInTest_001 extends BaseClass{
	
	@Test
	public void logIn() throws InterruptedException
	{
		
		
		
	LogInPage login=new LogInPage(driver);
		login.setUserName(userId);
		logger.info("username is sucessfully set");
		login.setPassward(passward);
		
		logger.info("password is succesfully set");
		login.clickSubmit();
		
		String acttitle=driver.getTitle();
		String exptitle="guru";
	
		
		
        if(exptitle.equals(acttitle))
        {
        	logger.info("test is passed expected result is equal to actual result");
        }
        else
        {
        	logger.error("test is failed ");
          System.out.println("Screen shot is taken");
        	captureScreenShot(driver,"log in");
        	
        	
        }
		
		
		
		

}
}

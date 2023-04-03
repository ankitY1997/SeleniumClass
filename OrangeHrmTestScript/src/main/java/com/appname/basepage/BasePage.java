package com.appname.basepage;

import static org.testng.Assert.fail;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class BasePage 
{

	public WebDriver driver;
	public ExtentTest test;
	
	
	public BasePage(WebDriver driver, ExtentTest test)
	{ 
		this.driver=driver;
		this.test=test;
		
	}
	public void reusable()
	{
		test.log(LogStatus.INFO, "log in to base page ");
	}
	public   String screenShot() 
	{
		
		TakesScreenshot ss= (TakesScreenshot)driver;
		
		File screenshot=ss.getScreenshotAs(OutputType.FILE);
		
		Date d=new Date();
		System.out.println(d);
		
		String strdate=d.toString();
		System.out.println(strdate);
		
		String modifydate=strdate.replace(" ","_").replace(":","_");
		System.out.println(modifydate);
		
		String src="Test_"+modifydate+".jpg";
		
	try {
	FileUtils.copyFile(screenshot,new File(System.getProperty("user.dir")+"//Reports//screenshot/"+src));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		String destination=System.getProperty("user.dir")+"//Reports//screenshot/"+src;
		
		return destination;
	}
	
//wrapper functions
	public void elementClick(WebElement element)
	{
		
		try {
		element.click();
		
		test.log(LogStatus.INFO,"this "+element+"is sucessfully click");
		}
		catch(Exception e)
		{
			test.log(LogStatus.ERROR, e.getMessage());
		}
		
	}
	
	public void typeInto(WebElement element,String value,String elementname)
	{
		element.sendKeys(value);
		test.log(LogStatus.INFO,"this is element name"+elementname+"sucessfully entered this element "+element+"sucessfully send keys "+value);
		
	}
	
	public void verfiyPageTitle(WebElement element,String expText) 
	{
		String actText=element.getText();
		
		if(actText.equals(expText)) 
		{
			test.log(LogStatus.INFO.PASS,"the actual result is  "+actText+" as same as "+expText);
		}
		else
		{
			test.log(LogStatus.FAIL,"the actual result is not   "+actText+" as same as "+expText);
			org.testng.Assert.fail();
		}
		
		
	}
	
	public void verifyElement(WebElement element) 
	{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		  WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(1000));
		  wt.until(ExpectedConditions.visibilityOf(element));
		try {
		boolean elmentFlag=element.isDisplayed();
		test.log(LogStatus.INFO.PASS,"element is persent ");
		}
		catch(Exception e)
		{
		test.log(LogStatus.INFO.FAIL,"element doesn,t exisit");
		Assert.fail();
		}
	}
	
}

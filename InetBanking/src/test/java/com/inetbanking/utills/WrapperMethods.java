package com.inetbanking.utills;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrapperMethods {
	
 private static  WebDriver driver;
	public String value;
	public int count=0;
	
	// this function check web elment is clickable or present or not
	public static  boolean isVerify(WebElement element )
	{
		
		if(element.isDisplayed()&&element.isEnabled())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	//this function is used to set a data
	public String  setData(WebElement element,String data)
	{



        if(WrapperMethods.isVerify(element)) {
			try {
				element.sendKeys(data);
				value=element.getAttribute("value");

			} catch (Exception e) {
				System.out.println("exception in this class " + e + "this is class" + this.getClass());

			}
			return value;
		}
		else {
			System.out.println("elment is not persent ");

			return value;
		}

	}

	public void click(WebElement element)
	{
		if(WrapperMethods.isVerify(element)==true)
		{
			System.out.println(this.getClass()+" login button is  enabled ");
			element.click();
		}
		else
		{
			System.out.println(this.getClass()+"log in button is not display");
		}

	}


	 public String getText(WebElement element)
	 {
		String value= element.getText();

		return value;
	 }

	 //for ptuuting all data like username and password
	 public void  setData(String data1,String data2,WebElement elment,WebElement elment2 )
	 {

            count++;
         try {
			 if ((WrapperMethods.isVerify(elment)) && (WrapperMethods.isVerify(elment2) == true))
			 {

					 elment.sendKeys(data1);
				 elment2.sendKeys(data2);

			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("elment is not found"+e+this.getClass());



		 }


	 }

	//for checking a alert
	public boolean isAlert()
	{
		try {
		driver.switchTo().alert();



		return true;
		}
		catch(Exception e)
		{


			return false;
		}
	}

}

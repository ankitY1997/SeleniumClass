package com.inetbanking.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LogInPage;

public class Tc_LoginTest_001 extends BaseClass {
	
	
	
	
	
	@Test
	
	public void logInTest()
	{

       LogInPage lp=new LogInPage(driver);		
		lp.setData(lp.username,"mngr462369");
		lp.setData(lp.password,"EhusYpa");
		lp.click(lp.loginbutton);
		
		
		String exp_title="Guru99 Bank Manager HomePage";
		String actual_title=driver.getTitle();
		
		if(exp_title.equals(actual_title))
		{
			System.out.println("login test is passed");
		}
		else 
		{
			System.out.println("log in test is failed");
		}
		

		
		
	}
	

	

	

}

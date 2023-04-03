package com.inetbanking.testcases;

import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LogInPage;
import com.inetbanking.utills.DataReadExcel;

public class Tc_login_DDT_001 extends BaseClass {
	
	
	

	@Test(dataProvider="login data")
	
	public void logInTest(HashMap data)
	{
     /* Scanner sc=new Scanner(System.in);
      System.out.println("enter the input id ");
      
        String inputid=sc.nextLine();*/
		String inputid="UI2";
		//System.out.println(inputid);



		
		LogInPage lp=new LogInPage(driver);
		String userid=data.get("USERID").toString();
		
		if(userid.equalsIgnoreCase(inputid))
		{
		String username=data.get("USERNAME").toString();
		String password=data.get("PASSWORD").toString();
		
		lp.setData( lp.username,username);
		lp.setData(lp.password,password);
		lp.click(lp.logoutbutton);

		
		if(isAlert()==true)
		 {
			 driver.switchTo().alert().accept();;
			 
			 
			// Assert.assertTrue(false);
			 
			 driver.switchTo().defaultContent();
		 }
		 else if(isAlert()==false)
		 {//Assert.assertTrue(true);
			 lp.click(lp.logoutbutton);
			 driver.switchTo().alert().accept();
			//s Assert.assertTrue(true);
			 driver.switchTo().defaultContent();
		 }
		}
		else
		{
			System.out.println("this is wrong id ");
		}
		
	}
	

	

	
	

}

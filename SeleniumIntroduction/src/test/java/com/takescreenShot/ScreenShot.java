package com.takescreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.appname.basepage1.BasePage2;

public class ScreenShot extends BasePage2 {
	
	
	@Test
	
	public void takeScreenShot() throws IOException
	{
	
		openBrowser("edge");
		openUrl("https://the-internet.herokuapp.com/");

		//2. now we will take screen shot so we have one class ScreenShot
		
		TakesScreenshot scrshot=(TakesScreenshot)driver;//this is the class
		
		//now we have method  to take getscreenshotAs and its return type is file
		
		//now here we will convert print to file type output
		
		File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
		
		//now i want to store the screen shot as  given the driectory
		
		//so we have to use 
		
		
		//now first we have to use how to save screen shot file 
		//first we have to use Date class
		
		Date d=new Date(); //this is date class
		
		System.out.println(d);//this is give me a today date and time
		
		//here it will print this pattern = Mon Nov 21 12:37:20 IST 2022
	
		//but file does not store in space colon type so now i want to covert space and column into (_)
	
		//so how will you do that
		
		//so first i want to convert this file into String File
		
		String date=d.toString();//to string() is a method provided by date 
		
		//now i want to convert
		
		String modified=date.replace(" ","_").replace(":","_");//.replace() is a method 
		
		System.out.println(modified);//here it coverted int his form(Mon_Nov_21_12_44_43_IST_2022)
		
		//now here we will do how to store a file in system .jpg or not simply we will concatinate
		
		String storeFile="Test_"+modified+".jpg";
		
		//now we will see how it will be save in system
		
		System.out.println(storeFile);//now it will be save in this way(Test_Mon_Nov_21_13_00_34_IST_2022.jpg)
		
		//2. now we will take screen shot so we have one class ScreenShot
		
		
		
		FileUtils.copyFile(srcfile,new File(System.getProperty("user.dir")+"//result//"+storeFile));
		
		
		
		
		
	}
	

}

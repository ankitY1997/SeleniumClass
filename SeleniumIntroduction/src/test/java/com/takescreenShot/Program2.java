package com.takescreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program2 {

	public static void main(String[] args) throws IOException {
		
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		File scrshot=ss.getScreenshotAs(OutputType.FILE);
		
		
		Date d=new Date();
		
		System.out.println(d);
		
		String sd=d.toString();
		
		String modified=sd.replace(" ","_").replace(":","_");
		System.out.println(modified);
		
		String src="test_"+modified+".jpg";
		
		 
		FileUtils.copyFile(scrshot,new File(System.getProperty("user.dir")+"//screenshot//"+src));

		
	
		
	}

}

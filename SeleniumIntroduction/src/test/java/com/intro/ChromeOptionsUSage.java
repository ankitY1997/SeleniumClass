package com.intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUSage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
		// TODO Auto-generated method stub
//now her we add some options like maximized mode and disable notification and ignore certifiacation
		
	//	so first we have to use chrome options and create an object of chrome options
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--start-maximized");
		opt.addArguments("ignore certificate error ");
		
		ChromeDriver cd=new ChromeDriver(opt);
		cd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		cd.get("https://www.google.com");
		//cd.get("https://www.google.com/search?q=facebook&rlz=1C1UEAD_enIN1023IN1023&oq=facebook&aqs=chrome..69i57.8550j0j4&sourceid=chrome&ie=UTF-8");
		
		
	}

}

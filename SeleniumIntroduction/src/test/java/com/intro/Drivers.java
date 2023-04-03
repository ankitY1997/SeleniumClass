package com.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers 
{
public static void main(String []args)
{
	System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	driver1.get("https://www.google.com");
	
}
}

package com.intro;
import java.io.*;
import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Progrma3 {
	/*test cases :-
	 * 1.open the facebook
	 * and put user name 
	 * and put passward
	 * and click on submit button
	 * 
	 *  */
	

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		try {
		driver.get("https://www.facebook.com/");//this for open afacebook
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9340256458");//this for finding email name or also entering value
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ankit@123");//this for passward and adding input
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		}
		catch(Exception e)
		{
		
		driver.close();
		}

	}

}
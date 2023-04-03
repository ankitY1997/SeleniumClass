package com.intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class SendMessage {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		try
		{
			
			EdgeOptions opt =new EdgeOptions();
			opt.addArguments("--disable-notifications");
			opt.addArguments("--start-maximized");
		WebDriver driver=new EdgeDriver(opt);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("9340256458");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("ankit@123");
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		//String exptittle=driver.getTitle();
		//WebElement not=driver.findElement(By.xpath("//*[@id=\"mount_0_0_p9\"]/div/div[1]/div/div[5]/div/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div/div[3]/div/div[1]/div/div/div/div/div[3]/div/div[1]/div[1]/div"));
		//not.click();
	
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search Facebook']"));
		Thread.sleep(5000);
	     search.sendKeys("Girish dubey");
	     Thread.sleep(5000);
	     //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.findElement(By.name("Girish Dubey")).click();
	     
		WebElement message=driver.findElement(By.xpath("//span[text()='Message']"));	
		message.click();
		
		WebElement write=driver.findElement(By.xpath("//*[@id=\"mount_0_0_Yp\"]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[1]/p"));
		
		write.sendKeys("hii dubey");
		
		WebElement send=driver.findElement(By.xpath("//*[@id=\"mount_0_0_Yp\"]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/div/span[2]/div/svg/path"));
		send.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("pass");
		
	}

}

package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class InputAs 
{
	public static WebDriver driver;
	public static boolean select1;
	public static void main(String []args) throws InterruptedException
	{
		//first we are doing input operation
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
	
		driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("ankit");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("yadav");
		driver.findElement(By.id("userEmail")).sendKeys("ankiteng12@gmail.com");
		
	
	}
	
	public static void radioButton()
	{
		WebElement male =driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		male.click();
		boolean select=male.isSelected();
		System.out.println(select);
		
		if(select==true)
		{
			WebElement female=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
			female.click();
		 select1=female.isSelected();
		 System.out.println(select1);
			
		}
		
		else if(select1==true)
		{
			WebElement others=driver.findElement(By.xpath("//input[@value=\"Other\"]"));
			others.click();
			
			boolean select2=others.isSelected();
			System.out.println(select2);
		}
		driver.quit();
	}
	
}

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class ScrollUp extends BasePage 
{
	
	//Question-20: Write a Java Program to demonstrate Scroll up/ Scroll down. 
	@Test
	public void ScrollUp() throws InterruptedException
	{
	
		openBrowser("Edge");
		openUrl("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scrollup=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		int loc1=scrollup.getLocation().y;
		
		
		WebElement scrolldown=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		
		int loc=scrolldown.getLocation().y;
		
		//now we goo down
		
		
	    js.executeScript("window.scrollTo(0,"+loc+")");
	 
	    //now we goo up
	    Thread.sleep(2000);
	    js.executeScript("window.scrollTo(0,"+loc1+")");
	    
		
		
		
	}
	@AfterTest
	
	public void closeConn()
	{
		driver.quit();
	}
	
}

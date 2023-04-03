package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_window {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.xpath("//button[text()=\"New Tab\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"New Window\"]")).click();
		
		Set<String> window=driver.getWindowHandles();
		
		System.out.println( window.size());
		
		System.out.println(window);
		
		Iterator<String> it=window.iterator();
		
		String parent= it.next();
		String child1=it.next();
		String child2=it.next();
		
		driver.switchTo().window(parent);
		
		WebElement name=driver.findElement(By.xpath("//div[@class=\"main-header\"]"));
		
		String x=name.getText();
		
		System.out.println(x);
		
	driver.switchTo().window(child1);
		
	WebElement name2=driver.findElement(By.xpath("//body/h1"));
	
	String y=name2.getText();
	
	if(y.equals("This is a sample page"))
	{
		System.out.println("passed");
	}
	
		
		
		
		
		
		
		
		//now we have to use iterator to goes to hold those value  
		
		
		
	}

}

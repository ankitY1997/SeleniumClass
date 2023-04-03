package colour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

public class Program1 
{

	public static void main(String []args)
	{
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element =driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
		//now we have to find out the colour of text so we have one method we can use and 
		//we can copy css selector
		
		String colourname=element.getCssValue("background-color");
		System.out.println(colourname);
		
		//this is the rgba value and now we have to convert in hexa value so we have one method
		
		//now we have to use color class
		
	String name=	Color.fromString(colourname).asHex();
	
	//here we can find the actual colour which is written in website 
	System.out.println(name);
	
	
	
		
	driver.quit();
	}
	
}

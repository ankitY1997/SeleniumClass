package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		//now if you want to find what input you send to input field so  first we have to send a value
		//then you have getAttribute method 
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    WebElement name=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	    name.sendKeys("ankit");
	    
	    String x=name.getAttribute("value");
	    
	    System.out.println(x);
	    
	    if(x.equals("ankit"))
	    {
	    	System.out.println("test is passed ");
	    	
	    }
	    else
	    {
	    	System.out.println("test is failed ");
	    }

	}

}

package Wait_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Theory {

	
	/* we have a two types of wait 
	 * 
	 * 1) is implicit wait 
	 * 2) is  Explicit wait
	 * 3) is Fluent wait
	 * 
	 * difference between implicit wait and Explicit wait 
	 * 
	 *implicit wait=> implicit wait is a wait which is waiting to your webelement is appears or not at certain period of time and
	 *its polling time is .5 second
	 *and its only working on find element and find elements 
	 *
	 *Explicit wait=>explicit wait is a wait  where we can provide some expected conditions  and its works on every where 
	 *we can put it 
	 * if you want to call explicit wait so we have to make a instance of webdriver wait class
	 *
	 */
	
     //lets see the example 
	
	@Test
	public void main()
	{
	
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://the-internet.herokuapp.com/checkboxes");
	    
	    driver.findElement(By.xpath(""));
	    
	    
		
		
		
	}
	
	
}

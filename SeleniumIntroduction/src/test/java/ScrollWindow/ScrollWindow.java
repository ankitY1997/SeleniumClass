package ScrollWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollWindow {

	public static void main(String[] args) {
		
		//how to scroll window with help of java script
		
		
		 System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
			
			WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/automation-practice-form");
		   
		    //i want to upload a file so first we have to scroll down
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    
		    WebElement upldpic=driver.findElement(By.xpath("//input[@id=\"uploadPicture\"]"));
		    
		    //now i have to find cordinate so there is a method getLocation
		 
		    int k=upldpic.getLocation().y;//this is cordinate find out method 
		    
		  //by using java script executor we can scroll
		    js.executeScript("window.scrollTo(0,"+k+")");//this helps to scroll
		    
		  
		    
		   //by using action class
		    
		    Actions act=new Actions(driver);
		   
		  
		    
		    act.moveToElement(upldpic).build().perform();
		    

	}

}

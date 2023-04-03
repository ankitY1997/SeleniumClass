package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	    Thread.sleep(5000);
	   WebElement male= driver.findElement(By.xpath("//input[@value=\"Male\"]"));
	   WebElement female=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
	   
	   male.click();
	   boolean check=male.isSelected();
	   
	   if(check==true)
	   {
		   female.click();
	   }

	}

}

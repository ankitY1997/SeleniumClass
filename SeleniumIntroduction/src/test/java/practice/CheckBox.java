package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	    
	    Thread.sleep(5000);
	   WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"RC\"]"));
	   
	  checkbox.click();
	  
	  boolean check1=checkbox.isSelected();
	  
	  System.out.println(check1);//pass
	  
	  
	   WebElement checkbox1 = driver.findElement(By.xpath("//input[@value=\"Selenium IDE\"]"));
	  
	  boolean check2=checkbox1.isSelected();
	  
	  System.out.println(check2);//fail
	  
	  
	   WebElement checkbox2 = driver.findElement(By.xpath("//input[@value=\"Selenium Webdriver\"]"));
	   
	  checkbox2.click();
	  
	  boolean check3=checkbox.isSelected();
	  
	  System.out.println(check3);//pass
	  
	  
	  if(check2==false)
	  {
		checkbox1.click();  
		System.out.println(check2);//pass
	  }
	  

	}

}

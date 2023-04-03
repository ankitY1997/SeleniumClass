package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetText {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	  //supposed if you want to find what text is written there
	    //so first you select the path where test is written then you have to take getText() method
	    WebElement name=driver.findElement(By.xpath("//div[@class=\"_8ice\"]/following-sibling::h2"));
	    
	    //supposed if you want to find what text is written there
	    
	   String x=name.getText();
	    System.out.println(x);
	    
	    if(x.equals("Facebook helps you connect and share with the people in your life."))
	    {
	    	System.out.println("text is right");
	    }
	    else
	    {
	    	System.out.println("text is in correct ");
	    }

	    
	    driver.quit();
	}

	
	

}

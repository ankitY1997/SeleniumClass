package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Paytm1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://paytm.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class=\"_1YPz_\"]/span")).click();
	    
	    WebElement frame=driver.findElement(By.xpath("//iframe"));
	    
	    driver.switchTo().frame(frame);
	   
	   Thread.sleep(5000);
       driver.findElement(By.xpath("//span[@ng-if=\"isHowToLoginAllowed=='true'\"]")).click();
       driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//div[@class=\"MLCC9\"]/child::a")).click();
  
	   //driver.switchTo().defaultContent();
	   
	   driver.quit();
	    
	    

	}

}

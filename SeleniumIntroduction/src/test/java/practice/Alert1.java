package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demoqa.com/alerts");
	    
	    Thread.sleep(5000);
	   // WebElement name=driver.findElement(By.xpath("id=\"google_ads_iframe_/21849154601,22343295815/Ad.Plus-728x90_0\""));
	    
	  //  driver.switchTo().frame(name);
	    
	    //driver.switchTo().defaultContent();
	    
	    //driver.findElement(By.xpath("//*[@id=\"cbb\"]/svg/path[1]")).click();
	    
	    WebElement alt=driver.findElement(By.xpath("//div[@class=\"col\"]/button[@class=\"btn btn-primary\"]"));
	    alt.click();
	    
	   
	    Thread.sleep(1000);
	    Alert li=driver.switchTo().alert();
	    
	    li.accept();
	   
	    
	}

}

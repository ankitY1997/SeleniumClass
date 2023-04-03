package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollWindow1 {

	public static void main(String[] args) {
		
		//by using java executor
		 System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
			
			WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.grammarly.com/a?utm_source=bing&utm_medium=cpc&utm_campaign=brand&utm_content=&utm_term=grammarly%2B&matchtype=e&placement=&network=o&&msclkid=b5774e61744a14b700942d1098f50e22&gclid=b5774e61744a14b700942d1098f50e22&gclsrc=3p.ds");
		
		   
		    
//here we use driver and javascript properties 
		    
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    
		    WebElement scrol=driver.findElement(By.xpath("//span[@class=\"content_PbRSndwM\"]"));
		    
		    //now i have to find the location
		    
		    int loc=scrol.getLocation().y;
		    
		    //now we have to use method 
		    
		    js.executeScript("window.scrollTo(0,"+loc+")");
		    
		  
		scrol.click();
		    
		    
		  // by using action class
		    
		   /* Actions sc=new Actions(driver);
		    sc.moveToElement(scrol).build().perform();
		    
		    scrol.click();*/
		    
		    
		    
		    
		    
		    
	}

}

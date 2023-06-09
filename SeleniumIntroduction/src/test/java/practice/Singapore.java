package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Singapore {
	
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.singaporeair.com/en_UK/in/home?gclid=064e9ffc0c9b168eba80fc83138583f6&gclsrc=3p.ds&&utm_source=Microsoft&utm_medium=cpc&utm_campaign=SG-HO_RoW_SEM_SQ-BM_ACQ_BRANDCORE_B_EXT_04190521-EN&utm_term=singaporeair&utm_content=singaporeair&gclid=064e9ffc0c9b168eba80fc83138583f6&gclsrc=3p.ds#/book/bookflight");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Actions act=new Actions(driver);
		
		Thread.sleep(5000);
		WebElement dropmenu = driver.findElement(By.xpath("//input[@id='flightClass1']"));
		int loc=dropmenu.getLocation().y;
		//wt.until(ExpectedConditions.visibilityOf(dropmenu));
		js.executeScript("window.scrollTo(0,"+loc+")");
		Thread.sleep(2000);
			dropmenu.click();
			
			
			
			 List <WebElement> DropDownElements = driver.findElements(By.xpath("//div[not(@class=\"suggest-item selected\")]//div[@class='suggest-item']"));
		       int size= DropDownElements.size();
		        System.out.println(DropDownElements.size());
		        int j=0;
		        for(int i=1;i<=size;i++)
		        {
		        	WebElement name=driver.findElement(By.xpath("//div[not(@class=\"suggest-item selected\")]//div[@class='suggest-item']["+i+"]"));
		        	
		        	String x=name.getText();
		        	System.out.println(x);
		        	
		        	if(x.equals("Business"))
		        	{
		        	
		        		j=i;
		        	
		        		driver.findElement(By.xpath("(//div[@class=\"suggest-item\"])["+i+"]")).click();
		        		break;
		        	}
		        	//driver.findElement(By.xpath("//div[not(@class=\"suggest-item selected\")]//div[@class='suggest-item']["+j+"]")).click();
		       	
		        	if(j>0)
		        	{
		        		break;
		        	}
		        }
		        
		        driver.quit();
		        
		        
		        
	}

}

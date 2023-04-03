package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SendKEysAlert {
//if you see this kind of alert where there is a option to type some thing or text field.
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	WebElement loc=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
	
	loc.click();
	
	Alert alt=driver.switchTo().alert();
	
	alt.sendKeys("ankit@123");
	Thread.sleep(10000);
	
	alt.accept();
	
	driver.close();
	
	
	
	

	}

}

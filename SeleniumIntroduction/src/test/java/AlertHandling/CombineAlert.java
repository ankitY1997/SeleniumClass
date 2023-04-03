package AlertHandling;

import java.net.SocketException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CombineAlert {
//combine alert that means you have two option like okk or cancel .let see how we can handle this kind of alert
	public static void main(String[] args) throws InterruptedException,SocketException
	{
		
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement loc=driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		
		loc.click();
		//now we need to create Alert class
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(5000);
		//now if you want to accept a option
		//alt.accept();//this for accept
		
		alt.dismiss();//if you want to cancel the notification so you have cancel option
		
	Thread.sleep(5000);
		driver.close();
	}

}

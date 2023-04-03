package Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class Assignment1 extends BasePage{
	
	
	@Test
	public void scroolDown() throws InterruptedException
	{
		openBrowser("Edge");
		openUrl("https:/demo.actitime.com/login.do");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("testing web applications")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		String expresult="Username or Password is invalid. Please try again.";
		String actualresult=driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
		System.out.println(actualresult);
		
		if(expresult.equals(actualresult))
		{
			System.out.println("test is passed ");
		}
		else
		{
			System.out.println("test is failed");
		}
		driver.quit();
	}

}

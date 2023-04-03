package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class FindElments extends BasePage{
	
	
	@Test
	
	public void test() throws InterruptedException
	{
		openBrowser("Edge");
		openUrl("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("baba");
	
		List<WebElement> list=driver.findElements(By.xpath("(//div[@role=\"option\"])"));
		Thread.sleep(5000);
		int size=list.size();
		System.out.println(size);
		
		for(int i=1;i<=size;i++)
		{
			
			String name=driver.findElement(By.xpath("(//div[@role=\"option\"])["+i+"]")).getText();
			System.out.println(name);
		}
		
		
		
	}

}

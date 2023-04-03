package Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class Parameter extends BasePage
{
	@Parameters({"browser","url","SendKeys"})

	@Test
	
	public void parameterTest(String browser,String url,String SendKeys)
	{
		
		openBrowser(browser);
		openUrl(url);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(SendKeys);
		
		
		
		
		
	}
	
	@AfterTest
	
	public void closeConn()
	{
		driver.quit();
	}
	
}

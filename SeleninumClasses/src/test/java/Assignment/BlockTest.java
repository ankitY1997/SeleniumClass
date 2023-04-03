package Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class BlockTest extends BasePage 
{

//there are two ways to achive blockage of test cases with help of (enable=false)
//and another way to go inside testng.xml  file and create method and where we can use exclude

	
	//so let see how we can block the method 
	@Parameters({"browser","url"})
	@Test
	public void LoginTest(String browser,String url)
	{
		openBrowser(browser);
		openUrl(url);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("9407149937");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		
		
	}
	
	//@Test(enabled=false)
	@Test
	
	public void verifyTest()
	{
	System.out.println("this is verify test");	
	}
}

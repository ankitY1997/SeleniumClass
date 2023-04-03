package testScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.objectRepository.com.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest 
{

	WebDriver driver;

	@BeforeTest
	public void openUrl()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp");
		
	}
	
	@Test
	
	public void search()
	{
		BasePage bp=new BasePage(driver);
		
		
	}
	
	@AfterTest
	
	public void closeCon()
	{
		driver.quit();
	}
}

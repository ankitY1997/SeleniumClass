package NavigationOperation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class Program1 extends BasePage 
{

	
	@Test
	public void navi() throws InterruptedException
	{
		
		openBrowser("Edge");
		openUrl("https://www.facebook.com");
		
		//if you want to go in next sub url so we have one method driver.manage.to()
		
		driver.navigate().to("https://www.instagram.com");
		//navigation method is used to perform navigation operation like
		//back and refresh and forword and to
		
		//first we have seen navigation operation an its return type is void 
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//if you want to perform window based operation 
		//so we have to use 
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//if you want to move forword so we have to use 
		
		driver.navigate().forward();
	}
	@AfterTest
	
	public void closeConne()
	{
		driver.quit();
	}
}

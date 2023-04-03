package Assignment;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class WindowHandels extends BasePage
{
		@Test
	public void window()
	{
		openBrowser("Edge");
		openUrl("https://www.facebook.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com");
	String  url=driver.getWindowHandle();
		//System.out.println(url);
		
		
		Set<String> mul=driver.getWindowHandles();
		
		for(String c:mul)
		{
		System.out.println();	
		}
		
	}
	
}

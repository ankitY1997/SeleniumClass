package DriverInterFaceOperation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class NavigationBrowserHistrory extends BasePage 
{

	/*navigation is an inter faces which extends webdriver interface in there  are soo many methods 
* in this help we can perform all browser task like backward /forward /refresh and /opennew url//to(Stringurl) task
*driver.navigate().to(String url)==or we have one over load method is To(Url url)
* so lets see how we can do
	*/
	@Test
	public void naviagtion() throws InterruptedException, MalformedURLException
	{
		 openBrowser("Edge");
		 openUrl("https://www.facebook.com/");
	
		//now we want to open new url in single tab  soo we can use to() method which is provided by navigation inter face
		 driver.navigate().to("https://www.instagram.com/");
		
		
		//first we are performing back operation back operation we have command driver.naviagte().back();
	Navigation nav=driver.navigate();
	                                   //this return type is navigation
	
	//now we can perform the operations
	
	//this is for backward
	         nav.back();
	         Thread.sleep(5000);
	
	//this is for forward 
	
	         nav.forward();
	
	         Thread.sleep(5000);
	
	//now if you want to refresh a page so we have another method 
	
	          nav.refresh();
	          Thread.sleep(2000);
	
	
	//openinng new with help of url class so we have use to Url method which is overload method 
	
	           URL url=new URL("https://www.zomato.com/");
	           driver.navigate().to(url);
	
	           Thread.sleep(2000);
	}
	@AfterTest
	
	public void closeConnection()
	{
		driver.quit();
	}
}

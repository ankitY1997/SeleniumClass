package DriverInterFaceOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class GetOperation extends BasePage
{

	
	/*driver interface give get method which has a different -different object
	 * let see:-
	 * 
	 * 1.driver.get()=>it's used to open url 
	 * 2.driver.getTitle()=>it's used to find the title of web page 
	 * 3.driver.getText()=> it's used to find the text whatever text is present in web site
	 * 4.driver.getPageSource=>it helps we can find in which language our web page is design
	 * 5.driver.getUrl()=>it's used to find out the url what is the url  
	 * 6.driver.getAttribut("value")=>it's used to find out the input value 
	 * so lets see how we can use this method ok
	
    test cases =>   1.open a a browser 
    2.open a google 
    3.and verify the title */
	
	@Test(priority=1)
	
	public void getUsage()
	{
		openBrowser("Edge");
		
	//so let see first method driver.get()=>its used to open a url 
	//now we can try to open a url	
		driver.get("https://www.google.co.in/");
		
		//according to test cases we can verify the the title
		
		//finding a title we have one method its driver.getTitile()=>so let seet
		//and its wriiten type is string so we can store in string
		String expTitle="Google";
		String actTitle=driver.getTitle();//here we can print actual title 
		System.out.println(actTitle);
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("test is passed ");
		}
		else
		{
			System.out.println("test is failed");
		}
		
		
		
		
	}
	
	@Test(priority=2)
	
	public void getUsages() throws InterruptedException
	{
		//now we see the usage of get Text method return type is string
		
		openBrowser("edge");
		openUrl("https://www.facebook.com/index.php");
		
	     WebElement element=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		 String act=element.getText();
		
		System.out.println(act);
		String exp="Log in";
		
		if(act.equals(exp))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
	
	}
	
	@Test(priority=3)
	public void getUs()
	{
		openBrowser("edge");
		
		//now we have to see getPagesource methods it used to find out the language of webpage see
		openUrl("https://www.facebook.com/index.php");
		
		//now we use 
		
		String language=driver.getPageSource();//return type is string
		System.out.println(language);//so see its html code
	}
	
	@Test(priority=4)
	public void getUsge()
	{
	//here we want to see the getCurrentUrl method =>its used  to find the url of webpage 
		
		openBrowser("Edge");
		openUrl("https://www.instagram.com/");
		//now we will use to geturl method which is used to find the url
		String exp="instagram";
		
		String url=driver.getCurrentUrl();
		
		if(url.contains(exp))
		{
			System.out.println("test is passed "+url);
		}
		else
		{
			System.out.println("test is failed  "+url);	
		}
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}

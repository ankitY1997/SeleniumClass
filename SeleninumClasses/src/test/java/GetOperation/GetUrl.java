package GetOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class GetUrl extends BasePage
{

	@Test
	
	public void program1()
	{
		
		openBrowser("Edge");
		
		driver.manage().window().maximize();
		//driver.get()=>it s a method which is used to open url
		
		driver.get("https://ww.facebook.com");
		
		
		//driver.getText()=>its a method which is used to find the text 
		
		
		//so we have to use driver.getText() method and its return type is String
		
		WebElement name=driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]"));
		
		String name1=name.getText();
		
		System.out.println("this is the text :=>"+name1);
		
		
		//supposed if you find out the current url so we have one method is its return type 
		//is string 
		
	String 	url=driver.getCurrentUrl();
	System.out.println("this is current url :=>"+url);
	
	
	
	//driver.getAttribute()="it is the method which is used to  find out the return text inside input textField
	
	
	WebElement input=driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
	input.sendKeys("ankit");
	
	String text=input.getAttribute("value");
	System.out.println(text);
	
	
	//now if you want to find out the source code so we have one method is driver.getPageSource();
	
	String src=driver.getPageSource();
	
	System.out.println("the page source code is :=>"+src);
	
	
	
		
	}
	
}

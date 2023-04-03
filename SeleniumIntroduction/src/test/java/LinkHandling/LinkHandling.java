package LinkHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LinkHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
			
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		//supposed i want to click inside this link the link is broken image then my first step is find this elements by using findElement method with help of xpath
		
		/*WebElement broken=driver.findElement(By.xpath("//a[text()='Broken Images']"));//so basically findelement method will return only one web element but if you use findElements then it will
		//return multiple value 
		
		broken.click();// here we will click on this link */
		
		//now i want to find how many elements in this link so we have to use findElements method and multiple elements will not be  store in WebElement class soo we can use 
		//to store multiple WebElement in List<WebElement>=findElements method 
		
		List<WebElement> elmlist=driver.findElements(By.xpath("//a"));
		
		// now we are using to know how many links are present inside the method so we have to use size method
		
	       int num=elmlist.size();//this is the size method which we use to number of element present in web page 
	
	       System.out.println(num);//now we get  the result is 46
		
	       ArrayList name=new ArrayList();
	       //if you want to store data in array list so we can use add mehtod .
	       name.add("Broken Images");//this is adding method 
	       name.add("Secure File Download");
	       
	       int count=0;
	       String compare = null;
	       
	       //now we want 
	       for(int i=0,j=0;i<elmlist.size();i++)
	       {
	    	   
	    	  // now we read the element or text so we can use this method // so we have text method to read the element what was  present in webpage so we use getText() method.
	    	  String x=(elmlist.get(i).getText());
	    	   //System.out.println(x);
	    	   count++;
	    	   if((count==1)&&(j<=1))
	    	   {
	    	 
	    	   compare=(String)name.get(j);
	    	   j++;
	    	   //System.out.println(compare);
	    	   }
	    	   
	    	   if(count==46)
	    	   {
	    		  
	    		  count=0;
	    		  i=0;
	    	   }
	    	   
	    	  if(compare.equals(x))
	    	   {
	    		  System.out.println("test is passed  "+compare+"="+x);
	    	   }
	    	   
	    	  
	       }
		
		
		
		
		
		
		
	}

}

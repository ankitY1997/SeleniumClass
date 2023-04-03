package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Gmail {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/search?q=gmail&source=hp&ei=mJJ0Y6GsBaeWseMPpPiagAk&iflsig=AJiK0e8AAAAAY3SgqIV-8rPxk2FWBKifm2CwaRdLxpyh&oq=gmail&gs_lcp=Cgdnd3Mtd2l6EAEYADILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyCAgAEIAEELEDMgUIABCABDILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzIICAAQgAQQsQNQAFgaYJIoaABwAHgCgAG5AYgB8gSSAQMwLjSYAQCgAQE&sclient=gws-wiz");
        //driver.switchTo().newWindow(WindowType.TAB);
       // driver.get("https://www.google.co.in/search?q=gmail&source=hp&ei=mJJ0Y6GsBaeWseMPpPiagAk&iflsig=AJiK0e8AAAAAY3SgqIV-8rPxk2FWBKifm2CwaRdLxpyh&oq=gmail&gs_lcp=Cgdnd3Mtd2l6EAEYADILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyCAgAEIAEELEDMgUIABCABDILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzIICAAQgAQQsQNQAFgaYJIoaABwAHgCgAG5AYgB8gSSAQMwLjSYAQCgAQE&sclient=gws-wiz");
       // Set<String> window=driver.getWindowHandles();
        
       // int num=window.size();
       // System.out.println(num);
      //  Iterator<String> it=window.iterator();
        
       // String parent=it.next();
       // String child=it.next();
        
        
        
       List<WebElement> list1=driver.findElements(By.xpath("//div[@id='search']//a"));
        
       // driver.findElement(By.xpath("//h3[text()=\"Gmail - Google\"]"));
        
       
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
       int size1=list1.size();
        System.out.println(size1);
        
        int m=1;
        
        for(int j=1;j<=size1;j++)
        {
            
           
			while(m<=size1)
            {
            
               if(j==m)
                {
            	 Thread.sleep(5000);
            	  
            	 
                  
            	 WebElement link=driver.findElement(By.xpath("((//div[@id='search']//a)["+m+"])"));
            	   
            	String name=link.getText();
            	 System.out.println(name);
            	 
            	 int loc=link.getLocation().y;
            	 
            	 js.executeScript("arguments[0].scrollIntoView(true);",link);
            	 Thread.sleep(2000);
            	 link.click(); 
            	
                  
                    
                
              //Thread.sleep(10000);
                 //  System.out.println(j+"===="+m);
                 break;
               
                 }
            
            }
			 
        m++;
       
     driver.navigate().back();
      
      //Thread.sleep(10000);
   
            
            
            }
            
            
                
        }
        
        



	}


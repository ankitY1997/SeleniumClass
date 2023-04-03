package MultipleTab;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://www.facebook.com/");
	
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.instagram.com/");
		//driver.get("https://www.instagram.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
	Set<String> window=driver.getWindowHandles();
	
			//int num=window.size();
			
	
			Iterator<String>it=window.iterator();
			
		String parent= it.next();
		String child=it.next();
		String subchild=it.next();
		driver.switchTo().window(parent);
		driver.switchTo().window(child);
		driver.switchTo().window(subchild);
		
		Thread.sleep(5000);
		driver.switchTo().window(child);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys("9340256458");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("ankit@123");
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
           
            
            
            Thread.sleep(5000);
            driver.switchTo().window(parent);
        	
    		WebElement  login=driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
    		login.sendKeys("9340256458");
    		
    		WebElement pwd=driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
    		pwd.sendKeys("ankit@123");
    		
    		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    		
    		 Thread.sleep(5000);
    		driver.switchTo().window(child);
    		
    		String child_title=driver.getTitle();
    		
    		
    		
    		
    		
    		
    		
    		if(child_title.equals("Instagram"))
    		{
    			System.out.println("test is passed");
    		}
    		else
    		{
    			System.out.println("test is failed");
    		}
    		
    		
    		 Thread.sleep(5000);
    		driver.switchTo().window(parent);
    		
    		
    		String parent_title=driver.getTitle();
    		
    		if(parent_title.equals("(13) Facebook"))
    		{
    			System.out.println("test is passed");
    		}
    		else
    		{
    			System.out.println("test is failed");
    		}
    		
    		
    		driver.switchTo().window(subchild);
    		
    		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ankiteng1997@gmail.com");
    		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
             driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("ankitYadav12");
             driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
             
    		driver.switchTo().window(subchild);
    		
    		String gmail=driver.getTitle();
    		System.out.println(gmail);
            
		
		
	}

}

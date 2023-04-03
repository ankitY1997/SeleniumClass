package SelininumAssignement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Tab {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
			
			WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    
		    
		    driver.get("https://www.facebook.com/");
		    
		    driver.switchTo().newWindow(WindowType.TAB);
		    
		    driver.get("https://www.instagram.com/");

		    driver.switchTo().newWindow(WindowType.TAB);
		    
		    
		    Set<String> window=driver.getWindowHandles();
		    
		    int size=window.size();
		    
		    
		    Iterator<String> it=window.iterator();
		    
		    String parent=it.next();
		    
		    String child=it.next();
		    
		    
		    
		    driver.switchTo().window(parent);
		    
		    Thread.sleep(5000);
		    
		    driver.switchTo().window(child);
		    
		    driver.close();
		    
		    
		    
	}

}

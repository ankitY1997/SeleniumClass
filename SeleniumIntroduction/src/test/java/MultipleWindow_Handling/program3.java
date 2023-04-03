package MultipleWindow_Handling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class program3 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.croma.com/");
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone14");
	    List<WebElement> name=driver.findElements(By.xpath("//div/input"));
	    
	   for(int i=0;i<name.size();i++)
	   {
		   System.out.println(name.get(i).getText());
	   }
	   
	    
	   Set<String> window= driver.getWindowHandles();
	   
	   System.out.println(window.size());
	   
	   Iterator<String> it=window.iterator();
	   String parent=it.next();
	   
	   driver.switchTo().window(parent);
	   
	   
	    
	}

}

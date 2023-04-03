package MultipleWindow_Handling;
import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.zeromq.ZStar.Set;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
		
		Set<String> window= driver.getWindowHandles();
		
	System.out.println(window.size());
		
	Iterator<String> name=window.iterator();
	 
	String parent=name.next();
	
	String child=name.next();
	System.out.println(child);
	Thread.sleep(5000);
	driver.switchTo().window(child);
	
	Thread.sleep(5000);
	driver.switchTo().window(parent);
	
	
		
	
		
		
		
		

	}

}

package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.demoblaze.com/");
	    Thread.sleep(5000);
	  List<WebElement> name=driver.findElements(By.xpath("//div[@class=\"card-block\"]/h4/a"));
	  
	  int size=name.size();
	  System.out.println(size);
	  
	  int num=0;
	  for(int i=0;i<name.size();i++)
	  {
		 String x=name.get(i).getText(); 
		// System.out.println(x);
		 
		 if(x.equals("Nokia lumia 1520"))
		 {
			  num=i;
			  System.out.println(num);
			 name.get(i).click();
			 break;
		 }
		 if(num>0)
		 {
			break; 
		 }
	  }
	  

	}

}

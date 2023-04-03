package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassicDropDown {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://the-internet.herokuapp.com/dropdown");
	    
	   WebElement name= driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
	   
	  // name.click();
	   
	   Select drop=new Select(name);
	   
	//  drop.selectByVisibleText("Option 2");
	  
	   
	   List<WebElement> opt=drop.getOptions();
	   
	   for(int i=0;i<opt.size();i++)
	   {
		   String x=opt.get(i).getText();
		   
		   System.out.println(x);
		   
		   if(opt.get(i).getText().equals("Option 1"))
		   {
			   opt.get(i).click();
		   }
	   }
	   
	   Thread.sleep(5000);
	   driver.quit();
	   
	  
	   
	   
	    

	}

}

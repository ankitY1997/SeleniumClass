package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705384516478&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
	    
	 WebElement list=   driver.findElement(By.xpath("//input[@aria-label=\"Search\"]"));
	 
	 list.sendKeys("samsung fold 4");
	 
	 Thread.sleep(5000);
	 
	 List<WebElement> list1=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
	 
	 
	 int j=0;
	 for(int i=1;i<list1.size();i++)
	 {
		String name=list1.get(i).getText();
		System.out.println(name);
		
		if(name.equals("samsung z fold 4"))
		{
			j=i;
			//Thread.sleep(5000);
			list1.get(i).click();
			
			break;
		}
		if(j>0)
		{
			break;
		}
		
		
	 }
	    
	    
	}

}

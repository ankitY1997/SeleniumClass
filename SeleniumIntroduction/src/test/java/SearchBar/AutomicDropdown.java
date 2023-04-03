package SearchBar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AutomicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//automatic drop down means its a combination of input and dropdown
		
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.tripodeal.com/flight-deal?utm_source=bing_tpk&utm_medium=cpc&utm_campaign=bing_c_tpk&msclkid=424e48a62b9219ebf1432bc2b0f94bf5");
		
		driver.manage().window().maximize();
		
		WebElement roundtrip=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		WebElement  oneway=driver.findElement(By.id("returnDateRequiredNo"));
	//	boolean onecheck=oneway.isSelected();
		boolean check=roundtrip.isSelected();
		System.out.println(check);
		if(check==false)
		{
			roundtrip.click();
			check=roundtrip.isSelected();
			System.out.println(check);
		}
		else
		{
			oneway.click();
		}
		
		WebElement from=driver.findElement(By.xpath("//input[@name=\"origin\"]"));
		from.sendKeys("Varanasi (VNS)");
		WebElement to=driver.findElement(By.xpath("//div[@class=\"col-12 col-lg-12 mt-2 d-none d-sm-block\"]/following-sibling::div[2]/child::fieldset/child::div/child::label/child::div/child::input"));
		    to.sendKeys("newBurgh (SWF)");
		/*WebElement from1=driver.findElement(By.xpath("//label[@for=\"origin\"]/child::i/following-sibling::input[@value=\"BOM\"]"));
		String expname="Mumbai (BOM)";
		String name=from.getAttribute("value");
	
		try {
		if(expname.equals(name))
		{
			from1.click();
	
		}
		System.out.println(name);
		}
		catch(Exception e)
		{
		e.printStackTrace()	;
		}
		finally
		{
			System.out.println(from1.isSelected());
			
		}*/
		//another way
		
		List<WebElement> from1=driver.findElements(By.xpath("//label[@for='origin']/child::div"));
		List<WebElement> to1=driver.findElements(By.xpath("//div[@class=\"col-12 col-lg-12 mt-2 d-none d-sm-block\"]/following-sibling::div[2]/child::fieldset/child::div/child::label"));		
		System.out.println(from1.isEmpty()+"3");
		for(int i=0;i<from1.size();i++)
		{
			String  x = (from1.get(i).getText());
			//System.out.println(x);
			if(from1.get(i).getText().equals(from))
			{
				System.out.println("1");
				from1.get(i).click();
				//System.out.println(from1.isSelected());
				
			
			}
			System.out.println("**************************");
			for(int j=0;j<to1.size();j++)
			{
				String y=to1.get(j).getText();
				//System.out.println(y);
				
				if( to1.get(j).getText().equalsIgnoreCase("Newburgh (SWF)"))
				{
					System.out.println("2");
						Thread.sleep(5000);
						to1.get(j).click();
				}
			}
		}
		
		
	}

}

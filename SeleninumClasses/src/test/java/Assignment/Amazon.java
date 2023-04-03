package Assignment;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class Amazon extends BasePage {
	
	@Test
	public void dropdown() throws InterruptedException
	{
		openBrowser("Edge");
		openUrl("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911655628446&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5nz8knj2kb_e");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("dress");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> dropdown=driver.findElements(By.xpath("//div[@class=\"autocomplete-results-container\"]/div"));
		
		int totalsize=dropdown.size();
		
		String selecteditem="dresses for women";
		int j=0;
		for(int i=1;i<=totalsize;i++)
		{
			Thread.sleep(1000);

			String name=driver.findElement(By.xpath("(//div[@class=\"autocomplete-results-container\"]/div)["+i+"]")).getText();
			//driver.switchTo().window(name);
			System.out.println(name);
			if(name.equals(selecteditem))
			{
			 j=i;
			   break;
			}
			
			if(j>0)
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("(//div[@class=\"autocomplete-results-container\"]/div)["+j+"]")).click();
	}

}

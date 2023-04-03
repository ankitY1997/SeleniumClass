package ClassicDropDownList;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program 
{

	public static void main(String[] args) throws Exception
	{
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.close();
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));

		username.sendKeys("Admin");
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		WebElement leave=driver.findElement(By.xpath("//span[text()=\"Leave\"]"));
		leave.click();
		Thread.sleep(2000);
		WebElement apply=driver.findElement(By.xpath("//a[text()=\"Apply\"]"));
		apply.click();
		Thread.sleep(5000);
		WebElement fromcal=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/i"));
		fromcal.click();
		WebElement monthopt=driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-month-selected\"]"));
		monthopt.click();
		List<WebElement> liscal=driver.findElements(By.xpath("(//ul[@class=\"oxd-calendar-dropdown\"]/li)"));
		int listsize=liscal.size();
		System.out.println(listsize);
		String monthname;
		int j=0;
		for(int i=1;i<=liscal.size();i++)
		{
			WebElement month=driver.findElement(By.xpath("(//ul[@class=\"oxd-calendar-dropdown\"]/li)["+i+"])"));
			
			//act.moveToElement(month).moveToElement(month).build().perform();
			 monthname=month.getText();
			System.out.println(monthname);
			
			if(monthname.equalsIgnoreCase("September"))
			{
		j=i;
		System.out.println(j);
		break;
			}
			
		driver.findElement(By.xpath("(//ul[@class=\"oxd-calendar-dropdown\"]/li)["+j+"])")).click();
		
		if(j>0)
		{
			break;
		}
			
		}
		
		
		
	}
}

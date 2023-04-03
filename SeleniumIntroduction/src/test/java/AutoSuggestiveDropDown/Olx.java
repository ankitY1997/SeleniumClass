package AutoSuggestiveDropDown;

import java.net.SocketException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Olx {

	public static void main(String[] args) throws InterruptedException,SocketException
	{
	//here we will check auto suggestive dropdown button
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		Thread.sleep(5000);
		/*WebElement searchlogin=driver.findElement(By.xpath("//span[text()=\"Login\"]"));
		searchlogin.click();
		Thread.sleep(5000);
		WebElement login=driver.findElement(By.xpath("//button[@data-aut-id=\"googleLogin\"]"));
		login.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ankiteng1997@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();*/
		
		
		
	WebElement search=driver.findElement(By.xpath("//input[@placeholder=\"Search city, area or locality\"]"));
		String y=search.getAttribute("value");
		//System.out.println(y);
		search.clear();
		search.sendKeys("Mumbai");
		Thread.sleep(5000);
		
		List<WebElement> name=driver.findElements(By.xpath("//span[@class=\"_1qtOc COluN\"]/following-sibling::div"));
		/*for(int i=0;i<name.size();i++)
		{
			System.out.println(i);
				System.out.println(name.get(i).getText());
			//System.out.println(x);
		}*/
		String name1="Mumbai Naka, Nashik";
		Thread.sleep(5000);
		//System.out.println("2");
		//System.out.println(name.size());
		int i=0;
		while(i<name.size())
		{
			String x= name.get(i).getText();
			System.out.println(x);
			if(x.equals(name1))
			{
				name.get(i).click();
				break;
			}
			i++;
		}
		
		Thread.sleep(5000);
		try
		{
		driver.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("3");
		
	}

}

package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class Assignment2 extends BasePage
{

	//
	
	//****see order of execution *********************//
	
	@Test(priority=1)
	
	public void ScreenShot() throws IOException
	{
		//Question-10: How would you automatically click a screenshot whenever an exception occurs? 
			
		openBrowser("Edge");
		driver.get("https://www.facebook.com/");
		
		try
		{
			WebElement elm=driver.findElement(By.xpath("//input[@name=\"em\"]"));
			elm.sendKeys("9340256458");
			
			
		}
		catch(Exception e)
		{
			
		TakesScreenshot ss=(TakesScreenshot)driver;	
		
		File screenShot=ss.getScreenshotAs(OutputType.FILE);
		
		
		Date d=new Date();
		
		//System.out.println(d);
		
		String convert=d.toString();
		
		String modifydate=convert.replace(" ","_").replace(":","_");
		System.out.println(modifydate);
		String srcFile="Test_"+modifydate+".jpg";
		
		
	//	FileUtils.copyFile(scrshot,new File(System.getProperty("user.dir")+"//screenshot//"+src));
		
		FileUtils.copyFile(screenShot,new File(System.getProperty("user.dir")+"//screenshot//"+srcFile));
		
		System.out.println(screenShot.getClass());
		}
		
	}
	
	
	
	@Ignore
	
	public void alert() throws InterruptedException
	{
		//How would you handle the alert popups in Selenium Webdriver?
		
		
		openBrowser("Edge");
		openUrl("https://demoqa.com/alerts");
		
		
		WebElement element=driver.findElement(By.xpath("(//div[@class=\"col\"]/button[text()=\"Click me\"])[1]"));
		
		Thread.sleep(2000);
		element.click();
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(5000);
		alt.accept();// this for accepting
		Thread.sleep(5000);
		
		
		WebElement element1=driver.findElement(By.xpath("(//div[@class=\"col\"]/button[text()=\"Click me\"])[3]"));
		Thread.sleep(2000);
		element1.click();
		Thread.sleep(5000);
		alt.dismiss();//this is for cancel
		
		
		driver.manage().window().fullscreen();
		//when you want to enter something 
		Thread.sleep(2000);
		WebElement element2=driver.findElement(By.xpath("(//div[@class=\"col\"]/button[text()=\"Click me\"])[4]"));
		Thread.sleep(2000);
		element2.click();
		Thread.sleep(5000);
		alt.sendKeys("ankit");
		Thread.sleep(5000);
		alt.accept();
		
		
		//when your poppus come into 5 seconds 
		
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element3=driver.findElement(By.xpath("(//div[@class=\"col\"]/button[text()=\"Click me\"])[3]"));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		element3.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		alt.dismiss();
		
	}
	
	
	@Test(priority=2)
	public void LaunchDriver()
	{
		
	//	Question-13: What is the process to start the IE/Chrome browser? 
		
		
		
		
	//first step we have to set a property means give a path where we can store driver	
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./Driver/msedgedriver.exe")	;
		
//second step launch  the browser
		int i=1;
		while(i<=2)
		{
			
			if(i==1) {
		new ChromeDriver();
			}
			else if(i==2)
			{
		new EdgeDriver();
			}
		
		i++;
		}
				 
		
		
		
	}
	
	@Test(priority=3)
	public void Dropdownmenu() throws InterruptedException
	{
		//Q.In Selenium WebDriver, how do you select an item from a drop-down menu? 
		
		
		openBrowser("Edge");
		
		openUrl("https://www.olx.in/");
		
		WebElement dropdown=driver.findElement(By.xpath("//input[@placeholder=\"Search city, area or locality\"]"));
		Thread.sleep(2000);
		dropdown.clear();
		
		dropdown.sendKeys("allahabad");
		Thread.sleep(5000);
		
		List<WebElement> options=driver.findElements(By.xpath("(//div[@class=\"_32lww\"]/div)"));
		Thread.sleep(5000);
		int num=options.size();
		
		System.out.println(num);
		int j=0;
		
		String select="Allahabad, Uttar Pradesh";
		
		for(int i=1;i<=num;i++)
		{
			WebElement name=driver.findElement(By.xpath("(//div[@class=\"_32lww\"]/div)["+i+"]"));
			System.out.println(name.getText());
			
			if(name.equals(select))
			{
					name.click();
			
			break;
			}
			
			
			
		}
		
		
		
	}
	
	@Test(priority=4)
	public void dragAndDrop() throws InterruptedException
	{
	//	Question-14: In Selenium WebDriver, how do you select an item from a drop-down menu? 
		
		openBrowser("Edge");
		openUrl("https://jqueryui.com/droppable/");
		
		Actions act=new Actions(driver);
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
	
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		
		
		
		act.dragAndDrop(driver.findElement(By.xpath("//div[@id=\"draggable\"]")),driver.findElement(By.xpath("//div[@id=\"droppable\"]"))).build().perform();
		
	}
	
	@AfterTest
	
	public void closeCone()
	{
	driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}

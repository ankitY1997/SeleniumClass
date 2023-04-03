package Com.Appname.Tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appname.pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

import Com.Appname.Basepage.BaseTest;

public class LogInTest extends BaseTest
{

public 	String testCaseName="LogIn";

public LoginPage loginPage;
	
public Actions act;

@BeforeMethod
public void setUp()
{
	
}

	@Test(priority=1)
	public void logIn() throws Exception
	{
		test=reports.startTest(testCaseName);
		openBrowser("edge");
		openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		 loginPage=new LoginPage(driver,test);
		PageFactory.initElements(driver, loginPage);
		test.log(LogStatus.INFO,"clicking on login button");
		loginPage.clickLogin();
		
		Thread.sleep(2000);
		loginPage.verify();
		
		loginPage.verifyElementes();
	}
	
	
	@AfterMethod
	public void written()
	{
		if(reports!=null)
		reports.endTest(test);
		reports.flush();
	}
	//@Test(priority=2)

	/*public void job() throws Exception
	{

   
}


	@Test(priority=2)
     public void applyLeave() throws Exception
     {
		logIn();
		
		Thread.sleep(2500);
		WebElement clickLeave=driver.findElement(By.xpath("//span[text()='Leave']"));
		clickLeave.click();
		
		Thread.sleep(2000);
		WebElement clickApply=driver.findElement(By.xpath("//a[text()='Apply']"));
		clickApply.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		
	WebElement leaveType=driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]"));
		
				leaveType.click();
	
Thread.sleep(4000);

List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]/div")) ;

String selectTit="CAN - Bereavement";
               int num=list.size();
               System.out.println(num);
               String name;
               int j=0;
            for(int i=1;i<=list.size();i++)
            {
            	
            	 name=driver.findElement(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]/div["+i+"]")).getText();
            	System.out.println(name);
            	
            	if(name.equals(selectTit))
            	{
            		 j=i;
            		 break;
            	}
            	
            }
               
        WebElement name1=driver.findElement(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]/div["+j+"]")); 
        name1.click();

		 //div[@class="oxd-select-option --selected"]
		/*Select select=new Select(leaveType);
		select.selectByVisibleText("CAN - Bereavement");
		
		List<WebElement> x=select.getOptions();
		for(int i=0;i<x.size();i++)
		{
			String name=x.get(i).getText();
			System.out.println(name);
			
			if(name.equals("CAN - Bereavement"))
			{
				x.get(i).click();
				break;
			}
		}
		select.selectByIndex(0);*/
	/*	String targetdate="19-Dec-2023";
		
		SimpleDateFormat targetdateFormat=new SimpleDateFormat("dd-MMM-yyyy"); 
		
		//now i want to convert my date into targetdateFormat
		Calendar calendar=Calendar.getInstance();
		Date formated_date;
		try {
			targetdateFormat.setLenient(false);
			 formated_date=targetdateFormat.parse(targetdate);
			 calendar.setTime(formated_date);
			 //now i want to find the day what is the day is it Monday or Tuesday
			 int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
			 System.out.println(targetDay);
			 int targetMonth=calendar.get(Calendar.MONTH);
			 System.out.println(targetMonth);
			 int targetYear=calendar.get(Calendar.YEAR);
			 System.out.println(targetYear);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		WebElement fromcal=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/i"));
		fromcal.click();
		
		//String actMonth=driver.findElement(By.xpath(""))
		
		
		
	
     }*/
           
      }


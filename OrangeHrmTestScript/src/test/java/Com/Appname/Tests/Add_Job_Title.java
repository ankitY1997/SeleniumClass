package Com.Appname.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.appname.pages.AdminJobPage;
import com.appname.pages.DashBoardPage;

import Com.Appname.Basepage.BaseTest;

public class Add_Job_Title extends BaseTest
{

	public void clickAdmin() throws Exception
	{
		
		openBrowser("edge");
		openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		DashBoardPage dashboard=PageFactory.initElements(driver,DashBoardPage.class);
		dashboard.clickAdmin();
		
		
		
		
	}
	
	
}

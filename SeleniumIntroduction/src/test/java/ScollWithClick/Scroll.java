package ScollWithClick;

import org.openqa.selenium.By;

import com.appname.basepage1.BasePage2;

public class Scroll extends BasePage2 {
	
	
	public void scroolDown() throws InterruptedException
	{
		openBrowser("Edge");
		openUrl("https://www.lambdatest.com/blog/automation-testing-tools/");
		driver.manage().window().maximize();
	driver.findElement(By.linkText("testing web applications")).click();
	

}
}
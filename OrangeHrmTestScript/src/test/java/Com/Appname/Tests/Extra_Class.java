package Com.Appname.Tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Extra_Class {
	
	public WebDriver driver;
	public Extra_Class(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickAdmin() throws InterruptedException, Exception 
	{
		Actions act=new Actions(driver);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		Thread.sleep(5000);
		WebElement admin=driver.findElement(By.xpath("//span[text()='Admin']"));
		//wt.until(ExpectedConditions.visibilityOf(admin));
		admin.click();
		Thread.sleep(5000);
	 // driver.findElement(By.xpath("//ul[@class=\"oxd-topbar-body-nav-tab-item\"]/li[2]")).click();
	  
		
		WebElement clickJob=driver.findElement(By.xpath("//span[text()='Job ']"));
		 act=new Actions(driver);
		act.moveToElement(clickJob).click(clickJob).build().perform();
		
		WebElement addJob=driver.findElement(By.xpath("//a[text()='Job Titles']"));
		Thread.sleep(2000);
		act.moveToElement(addJob).click().build().perform();
		Thread.sleep(5000);
		WebElement clickAdd=driver.findElement(By.xpath("//div/button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		//wt.until(ExpectedConditions.visibilityOf(clickAdd));
		
		//act.moveToElement(clickAdd).click().build().perform();
		clickAdd.click();
		
		Thread.sleep(2000);
		
	WebElement jobTitle=driver.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/following-sibling::div/input[@class=\"oxd-input oxd-input--active\"]"));
		
	  jobTitle.sendKeys("boitechg engineer");
	  
	  
	  String act_jobTitle=jobTitle.getAttribute("value");
	 // System.out.println(act_jobTitle);
	  
	  WebElement descr=driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]"));
	  
	  descr.sendKeys("handle man power ,perparing production report and claculate efficiency of man power,doing 5s and also maintaining a TPM record ");
	  
	
	  WebElement upload=driver.findElement(By.xpath("//div[@class='oxd-file-button']"));
	 // act.moveToElement(upload).sendKeys("Downloads\\ShubhamResume.docx").build().perform();
	 act.moveToElement(upload).click().build().perform();
	 //upload.sendKeys("D:\\dir\\ankit\\file.txt");
	 
	 Robot rb=new Robot();
	 rb.delay(2000);
	 
	 StringSelection ss=new StringSelection("D:\\dir\\ankit\\file.txt");
	 
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	 
	 //cntrl+v
	 
	 rb.keyPress(KeyEvent.VK_CONTROL);//cntrl
	 rb.keyPress(KeyEvent.VK_V);//  v
	 
	 rb.keyRelease(KeyEvent.VK_CONTROL);
	 rb.keyRelease(KeyEvent.VK_V);
	 
	 
	 rb.keyPress(KeyEvent.VK_ENTER);
	 rb.keyRelease(KeyEvent.VK_V);
	 
	 
	 WebElement add_note=driver.findElement(By.xpath("//textarea[@placeholder=\"Add note\"]"));
	 	
	 add_note.sendKeys("how are you");
	 
	 
	WebElement submit_button =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	
	submit_button.click();
	
	//for confirmation
	Thread.sleep(10000);
		 
	List<WebElement> column=driver.findElements(By.xpath("//div[@role=\"columnheader\"]"));
	
	System.out.println(column.size());
	
	List<WebElement> row=driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
	System.out.println(row.size());
	
	boolean flag=false;
	int j=1;
	int k=0;
	for(int i=1;i<row.size();i++)
	{
		 j=1;
		 while(j<=column.size())
		  {
			String realtitle=driver.findElement(By.xpath("//div[@class=\"oxd-table-body\"]/div["+i+"]/div/div["+j+"]")).getText();
			
			//System.out.println(realtitle);
			
			if(act_jobTitle.equals(realtitle))
			{
				 k=i;
				
				flag=true;
				
				break;
				
			} 
		
			j++;
		  } 
		 if(k>0)
			{
				break;
			}
	
	}
	
	if(flag==true)
	{
		System.out.println("test is passed and add job title is persent ");
	}
	else
	{
		System.out.println("test is failed job title is not persent");
	}
	}
	
	public void clickLeave()
	{
		
	}
	

}

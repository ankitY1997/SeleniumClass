package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Inputs {
private static Thread Thread;

//how to handle input
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()=\"Forms\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Practice Form\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("ankit");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("yadav");
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("ankit@gmail.com");
		
		Thread.sleep(5000);
		WebElement male=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		male.click();
		boolean check=male.isSelected();
		
		Thread.sleep(5000);
		WebElement female=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
	    female.click();
		boolean check1=female.isSelected();
		Thread.sleep(5000);
		WebElement other=driver.findElement(By.xpath("//input[@value=\"Other\"]"));
		other.click();
		boolean check2=other.isSelected();
		/*boolean check=true;
		boolean check1 = true;
		boolean check2=false;
		for(int i=0;i<=5;i++)
		{
			if(i<=2)
			{
			if(i==0)
			{
				WebElement male=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
				male.click();
				 check=male.isSelected();	
			}
			else if(i==1)
			{
				Thread.sleep(2000);
				WebElement female=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
			    female.click();
				 check1=female.isSelected();	
			}
			else if(i==2)
			{
				Thread.sleep(2000);
				WebElement other=driver.findElement(By.xpath("//input[@value=\"Other\"]"));
				other.click();
				 check2=other.isSelected();	
			}
			}
			else if(i>2&&i<=3)
			{
				if(check==true)
				{
					
					WebElement female=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
				    female.click();
				    Thread.sleep(2000);
				}
				else if(check==false)
				{
					WebElement male=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
					male.click();
					Thread.sleep(2000);
				}
				
				
			}
			else if(i>3&&i<=4)
			{
				if(check1==true)
				{Thread.sleep(2000);
					WebElement male=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
					male.click();
				}
				else
				{Thread.sleep(2000);
					WebElement female=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
				    female.click();	
				}
			}
			else if(i>4&&i<=5)
			{
				if (check2==true)
				{
					Thread.sleep(2000);
					WebElement female=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
				    female.click();	
				}
				else
				{
					WebElement other=driver.findElement(By.xpath("//input[@value=\"Other\"]"));
					other.click();	
					Thread.sleep(2000);
				}
			}
		
		}*/
	}

}
